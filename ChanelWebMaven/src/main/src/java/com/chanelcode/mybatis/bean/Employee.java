package com.chanelcode.mybatis.bean;

import org.apache.ibatis.type.Alias;

@Alias("emp")
public class Employee {
    private Integer id;
    private String lastname;
    private String email;
    private String gender;

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
