package com.cq.Service;

import com.cq.pojo.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmpService {
    List<Emp> selectAllEmp();

    Emp selectEmpByempno(int empno);

    PageInfo<Emp> findByPage(Integer pageNum, Integer pageSize);
}
