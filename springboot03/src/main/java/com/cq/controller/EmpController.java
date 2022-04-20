package com.cq.controller;

import com.cq.Service.EmpService;
import com.cq.pojo.Emp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@ResponseBody
public class EmpController {



    @Autowired
    private EmpService empService;

    @RequestMapping("/emp")
    public List<Emp> selectAllEmp(){
        return empService.selectAllEmp();
    }

// 分页查询
    @RequestMapping("/empPage/{pageNum}/{pageSize}")
//    PageInfo 封装了关于页的各种数据
    public PageInfo<Emp> pageAllEmp(@PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
        return empService.findByPage(pageNum,pageSize);
    }

    @RequestMapping("/empByempno")
    public Emp getEmpByEmpno(int empno){
       return empService.selectEmpByempno(empno);
    }



}
