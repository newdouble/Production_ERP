package com.cskaoyan.controller.LJG.measurecontroller;

import com.cskaoyan.bean.ProcessMeasureCheck;
import com.cskaoyan.bean.ProcessMeasureCheck2;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.bean.unqualify.ResponseVo;
import com.cskaoyan.mapper.ProcessMeasureCheckMapper;
import com.cskaoyan.service.LJG.measureservice.LjgMeasureCheckService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*工序计量质检controller层*/
@Controller
public class LjgMeasureCheckController {
    @Autowired
    LjgMeasureCheckService ljgMeasureCheckService;

    @Autowired
    ProcessMeasureCheckMapper processMeasureCheckMapper;

    @RequestMapping("/p_measure_check/find")
    public String find(){
        return "/WEB-INF/jsp/p_measure_check_list.jsp";
    }

   /* @RequestMapping("list")
    @ResponseBody
    public Map fiand(){
        List<ProcessMeasureCheck2> processMeasureCheck2s = ljgMeasureCheckService.queryAllMeasureCheck();
        int total = processMeasureCheck2s.size();
        HashMap hashMap = new HashMap();
        hashMap.put("total",total);
        hashMap.put("rows",processMeasureCheck2s);
        return hashMap;
    }*/
    @RequestMapping("/p_measure_check/list")
    @ResponseBody
    public PageResult getPageList(int page,int rows){
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<ProcessMeasureCheck2> processMeasureCheck2ss = ljgMeasureCheckService.queryAllMeasureCheck();
        PageInfo<ProcessMeasureCheck2> pageInfo = new PageInfo<>(processMeasureCheck2ss);
        pageResult.setRows(processMeasureCheck2ss);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @RequestMapping("/pMeasureCheck/delete_judge")
    @ResponseBody
    public String deletejudge(){
        return "{}";
    }

    @RequestMapping("/p_measure_check/delete_batch")
    @ResponseBody
    public ResponseVo delete(String[] ids){
        int status = 0;
        for (String id : ids) {
            status = processMeasureCheckMapper.deleteByPrimaryKey(id);
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

    @RequestMapping("/p_measure_check/add")
    public String addPm(){
        return "/WEB-INF/jsp/p_measure_check_add.jsp";
    }

    @RequestMapping("/pMeasureCheck/add_judge")
    @ResponseBody
    public String addPm2(){
        return "{}";
    }

    @RequestMapping("/pMeasureCheck/edit_judge")
    @ResponseBody
    public String edit(){
        return "{}";
    }

    @RequestMapping("/p_measure_check/edit")
    public String editUn(){
        return "/WEB-INF/jsp/p_measure_check_edit.jsp";
    }

    @RequestMapping("/p_measure_check/update_all")
    @ResponseBody
    public Map editUn2(ProcessMeasureCheck processMeasureCheck){
        int i = processMeasureCheckMapper.updateByPrimaryKey(processMeasureCheck);
        HashMap map = new HashMap();
        map.put("status",200);
        map.put("data",null);
        map.put("msg","OK");
        return map;
    }

    @RequestMapping("/p_measure_check/insert")
    @ResponseBody
    public ResponseVo unquaInsert(ProcessMeasureCheck processMeasureCheck){
        int status = processMeasureCheckMapper.insert(processMeasureCheck);
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

    @RequestMapping("/p_measure_check/search_pMeasureCheck_by_pMeasureCheckId")
    @ResponseBody
    public PageResult serachById(String searchValue, int page, int rows){
        return ljgMeasureCheckService.serachByPmeasureCheckIdService(searchValue,page,rows);
    }
}
