package com.butu.ssm.controller;

import com.butu.ssm.entity.File;
import com.butu.ssm.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/file")
public class FileController {

    @Resource
    private FileService fileService;

    @RequestMapping("getDataById")
    public String getDataById(HttpServletRequest request){
        Integer id = 1;
        File file = fileService.selectByPrimaryKey(id);
        request.setAttribute("file",file);
        return "show";
    }

}
