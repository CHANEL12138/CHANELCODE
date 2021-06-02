package com.chanelcode.mybatis.bean;

import com.chanelcode.mybatis.dao.EmpAnnotation;
import com.chanelcode.mybatis.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class MybatisTest {

    public SqlSessionFactory getSqlSessionFactory() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
    @Test
    public void mybatisTest() throws IOException {

        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        Employee employee = openSession.selectOne("com.chanelcode.mybatis.dao.EmployeeMapper.getEmpById",1);
        System.out.println(employee);
        openSession.close();
    }
    @Test
    public void mybatisTest1() throws IOException
    {
        //1、获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        //2、获取SqlSession对象
        SqlSession openSession = sqlSessionFactory.openSession();
        //3、获取接口的实现对象
        EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);

        Employee employee = mapper.getEmpById(1);

        System.out.println(employee);

        openSession.close();
    }

    @Test
    public void TestAnn() throws IOException
    {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession open = sqlSessionFactory.openSession();
        EmpAnnotation mapper = open.getMapper(EmpAnnotation.class);
        Employee employee = mapper.getEmpById(1);
        System.out.println(employee);
        open.close();
    }


    /**
     * 测试增删改的功能
     * mybatis 允许增删改直接定义 Integer Long Boolean
     * @throws IOException
     */
    @Test
    public void test() throws IOException
    {
        SqlSessionFactory sessionFactory = getSqlSessionFactory();

        SqlSession openSession = sessionFactory.openSession();
//        里面为true的时候说明自动提交
//        SqlSession openSession = sessionFactory.openSession(true);
        EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);

//增
//        Employee employee = new Employee(null,"Jerry","女","jerry@gmail.com");
//        employeeMapper.AddEmp(employee);
//改
//        Employee employee1 = new Employee(1,"Mike","男","mike@qq.com");
//        employeeMapper.updateEmp(employee1);
//删
//        employeeMapper.deleteEmp(1);


//        //多参数传入
//        Employee employee3 = employeeMapper.getEmpByIdAndLastname(1,"Tom");
//        System.out.println(employee3);
//map传入
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        map.put("lastname","Tom");
        Employee employee4 = employeeMapper.getEmpByMap(map);
        System.out.println(employee4);



        //需要手动提交
        openSession.commit();


        openSession.close();

    }
}
