package com.chanelcode.dao;

import com.chanelcode.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();
}
