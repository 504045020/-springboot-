package com.cq.controller;

import com.cq.pojo.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    @RequestMapping("/do")
    @ResponseBody
    public String index(){
        return "hello springboot03";
    }


}
