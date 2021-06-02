package com.chanelcode.mybatis.dao;

import com.chanelcode.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Select;

public interface EmpAnnotation {
    @Select("select * from mybatis.employee where id = #{id} ")
    public Employee getEmpById(Integer id);

}
