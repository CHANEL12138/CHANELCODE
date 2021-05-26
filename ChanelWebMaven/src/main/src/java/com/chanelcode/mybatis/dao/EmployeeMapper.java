package com.chanelcode.mybatis.dao;

import com.chanelcode.mybatis.bean.Employee;

public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    //mapping 配置文件与本接口动态绑定
    // EmployeeMapper.xml
}
