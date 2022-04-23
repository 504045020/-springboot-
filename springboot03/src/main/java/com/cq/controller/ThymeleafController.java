package com.cq.controller;

import com.cq.Service.EmpService;
import com.cq.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/showIndex")
    public String showIndex(Map<String,Object> map){
        map.put("msg","testMessage");
        return "index";
    }

    @RequestMapping("/show")
    public String showEmp(Map<String,Object> map){
        List<Emp> emp = empService.selectAllEmp();
        map.put("empList",emp);
        map.put("emp",emp.get(2));
        return "showEmp";
    }

    @RequestMapping("/removeEmp")
    public String removeEmp(Integer empno){
        Boolean aBoolean = empService.removeEmpno(empno);
        return "forward:show";
    }

//    public String addEmp(){
//        empService.addEmp(Emp emp);
//    }

    @RequestMapping("/")
    public String welcome(){
        return "welcome";
    }
}
