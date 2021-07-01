package com.chanelcode.mybatis.dao;

import com.chanelcode.mybatis.bean.Employee;

public interface EmployeeMapperPlus {

    public Employee getEmpById(Integer id);

    public Employee getEmpAndDeptById(Integer id);

}
