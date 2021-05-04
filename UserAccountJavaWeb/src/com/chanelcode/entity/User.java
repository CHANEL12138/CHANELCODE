package com.chanelcode.entity;

public class User {
    private Integer UserID;
    private String Username;
    private String Password;
    private String sex;
    private String email;
    public User() {
    }

    public User(Integer userID, String username, String password, String sex, String email) {
        UserID = userID;
        Username = username;
        Password = password;
        this.sex = sex;
        this.email = email;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
