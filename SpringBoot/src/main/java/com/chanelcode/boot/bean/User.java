package com.chanelcode.boot.bean;

public class User {
    private String name;
    private Integer age;
    private Pet pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() {
        name="Default";
        age=0;
        System.out.println("No-arg cons");
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void setPet(Pet pet)
    {
        this.pet=pet;
        System.out.println(pet);
    }

    public Pet getPet() {
        return pet;
    }
}
