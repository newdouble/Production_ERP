package com.cskaoyan.controller.LJG.measurecontroller;

import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.FinalMeasuretCheck2;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.bean.unqualify.ResponseVo;
import com.cskaoyan.mapper.FinalMeasuretCheckMapper;
import com.cskaoyan.service.LJG.measureservice.LjgMeasureService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*成品计量质检controller层*/
@Controller
public class LjgMeasureController {
    @Autowired
    LjgMeasureService ljgMeasureService;

    @Autowired
    FinalMeasuretCheckMapper finalMeasuretCheckMapper;

   @RequestMapping("/measure/find")
    public String measureAll(){
        return "/WEB-INF/jsp/measurement_list.jsp";
    }

    /*@RequestMapping("list")
    @ResponseBody
    public Map measureDetail(){
        List<FinalMeasuretCheck2> finalMeasuretCheck2s = ljgMeasureService.queryMeasureDetail();
        int total = finalMeasuretCheck2s.size();
        HashMap map = new HashMap<>();
        map.put("total",total);
        map.put("rows",finalMeasuretCheck2s);
        return map;
    }*/

    @RequestMapping("/measure/list")
    @ResponseBody
    public PageResult getPageList(int page,int rows){
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<FinalMeasuretCheck2> finalMeasuretCheck2s = ljgMeasureService.queryMeasureDetail();
        PageInfo<FinalMeasuretCheck2> pageInfo = new PageInfo<>(finalMeasuretCheck2s);
        pageResult.setRows(finalMeasuretCheck2s);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @RequestMapping("/fMeasureCheck/delete_judge")
    @ResponseBody
    public String deletejudge(){
        return "{}";
    }

    @RequestMapping("/measure/delete_batch")
    @ResponseBody
    public ResponseVo unqualifydelete(String[] ids){
        int status = 0;
        for (String id : ids) {
            status = finalMeasuretCheckMapper.deleteByPrimaryKey(id);
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

    @RequestMapping("/measure/add")
    public String addMc(){
        return "/WEB-INF/jsp/measurement_add.jsp";
    }

    @RequestMapping("/fMeasureCheck/add_judge")
    @ResponseBody
    public String addMc2(){
        return "{}";
    }

    @RequestMapping("/fMeasureCheck/edit_judge")
    @ResponseBody
    public String edit(){
        return "{}";
    }

    @RequestMapping("/measure/edit")
    public String editUn(){
        return "/WEB-INF/jsp/measurement_edit.jsp";
    }

    @RequestMapping("/measure/insert")
    @ResponseBody
    public ResponseVo unquaInsert(FinalMeasuretCheck finalMeasuretCheck){
        int status = finalMeasuretCheckMapper.insert(finalMeasuretCheck);
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

    @RequestMapping("/measure/update_all")
    @ResponseBody
    public Map editUn2(FinalMeasuretCheck finalMeasuretCheck){
        int i = finalMeasuretCheckMapper.updateByPrimaryKey(finalMeasuretCheck);
        HashMap map = new HashMap();
        map.put("status",200);
        map.put("data",null);
        map.put("msg","OK");
        return map;
    }

    @RequestMapping("/measure/search_fMeasureCheck_by_fMeasureCheckId")
    @ResponseBody
    public PageResult queryMeasureById(String searchValue,int page,int rows){
        return ljgMeasureService.queryMeasureSearchById(searchValue, page,rows);
    }

    @RequestMapping("/measure/search_fMeasureCheck_by_orderId")
    @ResponseBody
    public PageResult queryMeasureByOId(String searchValue,int page,int rows){
        return ljgMeasureService.queryMeasureSearchByOId(searchValue, page,rows);
    }
}
