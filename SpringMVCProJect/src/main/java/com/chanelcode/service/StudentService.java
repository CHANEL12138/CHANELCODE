package com.chanelcode.service;

import com.chanelcode.domain.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);
    List<Student> findStudent();
}
