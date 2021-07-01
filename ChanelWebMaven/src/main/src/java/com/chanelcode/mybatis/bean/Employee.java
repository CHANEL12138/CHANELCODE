package com.chanelcode.mybatis.bean;

import org.apache.ibatis.type.Alias;

@Alias("emp")
public class Employee {
    private Integer id;
    private String lastname;
    private String email;
    private String gender;
    private Department dept;

    public Employee() {
    }

    public Employee(Integer id,String lastname,  String gender,String email) {
        this.id=id;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
