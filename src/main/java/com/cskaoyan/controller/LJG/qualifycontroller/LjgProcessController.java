package com.cskaoyan.controller.LJG.qualifycontroller;

import com.cskaoyan.bean.Process;
import com.cskaoyan.bean.ProcessExample;
import com.cskaoyan.mapper.ProcessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*工序信息*/
@Controller
public class LjgProcessController {
    @Autowired
    ProcessMapper processMapper;

    @RequestMapping("process/get/{idz}")
    @ResponseBody
    public Process processDetail(@PathVariable("idz") String id){
        Process process = processMapper.selectByPrimaryKey(id);
        return process;
    }
}
