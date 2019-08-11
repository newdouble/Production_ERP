package com.cskaoyan.controller.LJG.qualifycontroller;

import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.bean.UnqualifyApply2;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.bean.unqualify.ResponseVo;
import com.cskaoyan.mapper.UnqualifyApplyMapper;
import com.cskaoyan.service.LJG.qualify.UnqualifyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    不合格品管理
* */
@Controller
@RequestMapping("unqualify")
public class UnqualifyController {
    @Autowired
    UnqualifyService unqualifyService;

    @Autowired
    UnqualifyApplyMapper unqualifyApplyMapper;

    @RequestMapping("find")
    public String findAll(){
        return "/WEB-INF/jsp/unqualify_list.jsp";
    }

   /* @RequestMapping("list")
    @ResponseBody
    public Map unqualify(){
        List<UnqualifyApply> unqualifyApplies = unqualifyService.queryAllUnQualify();
        int total = unqualifyApplies.size();
        Map map = new HashMap();
        map.put("total",total);
        map.put("rows",unqualifyApplies);
        return map ;
    }*/
   @RequestMapping("list")
   @ResponseBody
   public PageResult getPageList(int page, int rows, HttpServletResponse httpServletResponse){
       httpServletResponse.setContentType("text/html;charset=utf-8 ");
       PageResult pageResult = new PageResult();
       PageHelper.startPage(page,rows);
       List<UnqualifyApply> unqualifyApplies = unqualifyService.queryAllUnQualify();
       PageInfo<UnqualifyApply> pageInfo = new PageInfo<>(unqualifyApplies);
       pageResult.setRows(unqualifyApplies);
       pageResult.setTotal(pageInfo.getTotal());
       return pageResult;
   }

    @RequestMapping("add")
    public String addUn(){
        return "/WEB-INF/jsp/unqualify_add.jsp";
    }

    @RequestMapping("add_judge")
    @ResponseBody
    public String unqualifyadd(){
        return "{}";
    }

    @RequestMapping("edit_judge")
    @ResponseBody
    public String edit(){
       return "{}";
    }
    @RequestMapping("edit")
    public String editUn(){
        return "/WEB-INF/jsp/unqualify_edit.jsp";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Map editUn2(UnqualifyApply unqualifyApply){
        int i = unqualifyApplyMapper.updateByPrimaryKey(unqualifyApply);
        HashMap map = new HashMap();
        map.put("status",200);
        map.put("data",null);
        map.put("msg","OK");
        return map;
    }

    @RequestMapping("insert")
    @ResponseBody
    public ResponseVo unquaInsert(UnqualifyApply unqualifyApply){
        int status = unqualifyApplyMapper.insert(unqualifyApply);
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
    @RequestMapping("delete_judge")
    @ResponseBody
    public String unqualifydeletejudge(){
        return "{}";
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    public ResponseVo unqualifydelete(String[] ids){
       int status = 0;
        for (String id : ids) {
           status = unqualifyApplyMapper.deleteByPrimaryKey(id);
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


}






