package com.chanelcode.mybatis.dao;

import com.chanelcode.mybatis.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    //返回一个list
    public List<Employee> getbyname(String lastname);

    public Employee getEmpById(Integer id);
    //mapping 配置文件与本接口动态绑定
    // EmployeeMapper.xml

    public void AddEmp(Employee employee);

    public void updateEmp(Employee employee);

    public void deleteEmp(Integer id);

    //在传入多个参数的时候 封装规则见映射文件
    public Employee getEmpByIdAndLastname(@Param("id")Integer id, @Param("lastname")String lastname);

    public Employee getEmpByMap(Map<String,Object> map);

    @MapKey("last_name")
    public Map<String,Employee> getMapByLastName(String lastname);

    public List<Employee> danamicsql(String name);

    public List<Employee> danamicsql1(String[] array);
}
