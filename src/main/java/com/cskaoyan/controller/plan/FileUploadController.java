package com.cskaoyan.controller.plan;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FileUploadController {

    @RequestMapping("/file/upload")
    @ResponseBody
    public Map OrderFileUpload(MultipartFile file) throws IOException {
        File file1 = new File("D://spring",file.getOriginalFilename());
        String name =  file.getOriginalFilename();
        file.transferTo(file1);
        HashMap map = new HashMap();
        map.put("error",0);
        map.put("url",name);
        return map;
    }

    @RequestMapping("/file/delete")
    @ResponseBody
    public Map  deleteFile(String fileName){
        HashMap map = new HashMap();
        map.put("data","success");
        return map;
    }

    @RequestMapping("/pic/upload")
    @ResponseBody
    public Map picUpload(MultipartFile uploadFile) throws IOException {

        //String value = String.valueOf(new Double((Math.random() + 1) * Math.pow(10, 9)).longValue());
        //System.out.println(value);
        //String name =  value;
        String name = uploadFile.getOriginalFilename();

        System.out.println(name);
        File file1 = new File("D:\\git\\Production_ERP\\src\\main\\webapp\\WEB-INF",name);
        uploadFile.transferTo(file1);
        HashMap map = new HashMap();
        map.put("error", 0);
        map.put("url","/pic/" + uploadFile.getOriginalFilename());
        return map;
    }
}
