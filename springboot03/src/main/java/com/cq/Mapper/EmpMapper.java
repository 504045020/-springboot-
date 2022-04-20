package com.cq.Mapper;

import com.cq.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface EmpMapper {

    List<Emp> selectAllEmp();

    Emp selectEmpByempno(int empno);
}
