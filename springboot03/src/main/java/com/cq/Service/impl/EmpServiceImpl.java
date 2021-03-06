package com.cq.Service.impl;

import com.cq.Mapper.EmpMapper;
import com.cq.Service.EmpService;
import com.cq.pojo.Emp;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> selectAllEmp() {
        return empMapper.selectAllEmp();
    }

    @Override
    public Emp selectEmpByempno(int empno) {
        return empMapper.selectEmpByempno(empno);
    }

    @Override
    public  PageInfo<Emp> findByPage(Integer pageNum, Integer pageSize) {
        Page<Emp> page = PageHelper.startPage(pageNum, pageSize);
        List<Emp> list = empMapper.selectAllEmp();
//        需要向前端返回更多的数据详细
//        方式1
//        System.out.println("当前页"+page.getPageNum());
//        System.out.println("总页数"+page.getPages());
//        System.out.println("页大小"+page.getPageSize());
//        System.out.println("总记录数"+page.getTotal());
//        System.out.println("当前页数据"+page.getResult());
//        方式2
        PageInfo<Emp> pi = new PageInfo<>(list);
        System.out.println("当前页"+pi.getPageNum());
        System.out.println("总页数"+pi.getPages());
        System.out.println("页大小"+pi.getSize());
        System.out.println("总记录数"+pi.getTotal());
        System.out.println("当前页数据"+pi.getList());
        return pi;
    }

    @Override
    public Boolean removeEmpno(Integer empno) {
        return empMapper.removeEmp(empno);
    }


}
