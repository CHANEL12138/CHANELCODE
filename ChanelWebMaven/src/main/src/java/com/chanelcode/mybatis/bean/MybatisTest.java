package com.chanelcode.mybatis.bean;

import com.chanelcode.mybatis.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

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
}
