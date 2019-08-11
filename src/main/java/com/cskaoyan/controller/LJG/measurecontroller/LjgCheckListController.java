package com.cskaoyan.controller.LJG.measurecontroller;

import com.cskaoyan.bean.FinalCountCheck;
import com.cskaoyan.bean.FinalCountCheck2;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.bean.unqualify.ResponseVo;
import com.cskaoyan.mapper.FinalCountCheckMapper;
import com.cskaoyan.service.LJG.measureservice.LjgCheckCountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
成品计数质检
* */
@Controller
public class LjgCheckListController {
    @Autowired
    LjgCheckCountService ljgCheckCountService;

    @Autowired
    FinalCountCheckMapper finalCountCheckMapper;

   @RequestMapping("/f_count_check/find")
    public String findCheck(){
       return "/WEB-INF/jsp/f_count_check_list.jsp";

   }


  /* @RequestMapping("list")
    @ResponseBody
    public Map check(){
       List<FinalCountCheck2> finalCountCheck2s = ljgCheckCountService.queryCheckCountList();
       int total = finalCountCheck2s.size();
       HashMap hashMap = new HashMap();
       hashMap.put("total",total);
       hashMap.put("rows",finalCountCheck2s);
       return hashMap;*/
    @RequestMapping("/f_count_check/list")
    @ResponseBody
    public PageResult getPageList(int page,int rows){
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<FinalCountCheck2> finalCountCheck2s = ljgCheckCountService.queryCheckCountList();
        PageInfo<FinalCountCheck2> pageInfo = new PageInfo<>(finalCountCheck2s);
        pageResult.setRows(finalCountCheck2s);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
   }
    @RequestMapping("/fCountCheck/delete_judge")
    @ResponseBody
    public String deletejudge(){
        return "{}";
    }

    @RequestMapping("/f_count_check/delete_batch")
    @ResponseBody
    public ResponseVo delete(String[] ids){
        int status = 0;
        for (String id : ids) {
            status = finalCountCheckMapper.deleteByPrimaryKey(id);
        }

        ResponseVo responseVo = new ResponseVo();
        if (status != 0){
            responseVo.setStatus(200);
            responseVo.setMsg("OK");
        }else {
            responseVo.setStatus(0);
            responseVo.setMsg("操作失败！请联系管理员！");
        }
        return responseVo;
    }

    @RequestMapping("/f_count_check/add")
    public String addCL(){
        return "/WEB-INF/jsp/f_count_check_add.jsp";
    }

    @RequestMapping("/fCountCheck/add_judge")
    @ResponseBody
    public String addCL2(){
        return "{}";
    }

    @RequestMapping("/fCountCheck/edit_judge")
    @ResponseBody
    public String edit(){
        return "{}";
    }

    @RequestMapping("/f_count_check/edit")
    public String editUn(){
        return "/WEB-INF/jsp/f_count_check_edit.jsp";
    }

    @RequestMapping("/f_count_check/update_all")
    @ResponseBody
    public Map editUn2(FinalCountCheck finalCountCheck){
        int i = finalCountCheckMapper.updateByPrimaryKey(finalCountCheck);
        HashMap map = new HashMap();
        map.put("status",200);
        map.put("data",null);
        map.put("msg","OK");
        return map;
    }

    @RequestMapping("/f_count_check/insert")
    @ResponseBody
    public ResponseVo unquaInsert(FinalCountCheck finalCountCheck){
        int status = finalCountCheckMapper.insert(finalCountCheck);
        ResponseVo responseVo = new ResponseVo();
        if (status == 1){
            responseVo.setStatus(200);
            responseVo.setMsg("OK");
        }else {
            responseVo.setStatus(0);
            responseVo.setMsg("操作失败！请联系管理员！");
        }
        return responseVo;

    }

}
