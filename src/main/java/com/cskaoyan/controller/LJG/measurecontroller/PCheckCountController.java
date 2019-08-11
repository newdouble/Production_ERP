package com.cskaoyan.controller.LJG.measurecontroller;


import com.cskaoyan.bean.ProcessCountCheck;
import com.cskaoyan.bean.ProcessCountCheck2;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.bean.unqualify.ResponseVo;
import com.cskaoyan.mapper.ProcessCountCheckMapper;
import com.cskaoyan.service.LJG.qualify.PCheckCountService;
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
* 工序计数质检
* */
@Controller
public class PCheckCountController {

    @Autowired
    PCheckCountService pCheckCountService;

    @Autowired
    ProcessCountCheckMapper processCountCheckMapper;

    @RequestMapping("/p_count_check/find")
    public String find(){
        return "/WEB-INF/jsp/p_count_check_list.jsp";
    }

    /*@RequestMapping("list")
    @ResponseBody
    public Map countCheck(){
        List<ProcessCountCheck2> processCountCheck2s = pCheckCountService.queryAllPCheckCount();
        int total = processCountCheck2s.size();
        HashMap map = new HashMap();
        map.put("total",total);
        map.put("rows",processCountCheck2s);
        return map;

    }*/
    @RequestMapping("/p_count_check/list")
    @ResponseBody
    public PageResult getPageList(int page,int rows){
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<ProcessCountCheck2> processCountCheck2s = pCheckCountService.queryAllPCheckCount();
        PageInfo<ProcessCountCheck2> pageInfo = new PageInfo<>(processCountCheck2s);
        pageResult.setRows(processCountCheck2s);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @RequestMapping("/pCountCheck/delete_judge")
    @ResponseBody
    public String deletejudge(){
        return "{}";
    }

    @RequestMapping("/p_count_check/delete_batch")
    @ResponseBody
    public ResponseVo unqualifydelete(String[] ids){
        int status = 0;
        for (String id : ids) {
            status = processCountCheckMapper.deleteByPrimaryKey(id);
        }

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

    @RequestMapping("/p_count_check/add")
    public String addPCo(){
        return "/WEB-INF/jsp/p_count_check_add.jsp";
    }

    @RequestMapping("/pCountCheck/add_judge")
    @ResponseBody
    public String addPCo2(){
        return "{}";
    }

    @RequestMapping("/pCountCheck/edit_judge")
    @ResponseBody
    public String edit(){
        return "{}";
    }

    @RequestMapping("/p_count_check/edit")
    public String editUn(){
        return "/WEB-INF/jsp/unqualify_edit.jsp";
    }

    @RequestMapping("/p_count_check/update_all")
    @ResponseBody
    public Map editUn2(ProcessCountCheck processCountCheck){
        int i = processCountCheckMapper.updateByPrimaryKey(processCountCheck);
        HashMap map = new HashMap();
        map.put("status",200);
        map.put("data",null);
        map.put("msg","OK");
        return map;
    }

    @RequestMapping("/p_count_check/insert")
    @ResponseBody
    public ResponseVo unquaInsert(ProcessCountCheck processCountCheck){
        int status = processCountCheckMapper.insert(processCountCheck);
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

    @RequestMapping("p_count_check/search_pCountCheck_by_pCountCheckId")
    @ResponseBody
    public PageResult searchById(String searchValue,int page,int rows){
        return pCheckCountService.searchPCById(searchValue,page,rows);
    }
}
