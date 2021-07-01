package com.chanelcode.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Stu {
    private String[] courses;

    private List<String> list;

    private Map<String,String> map;

    private Book[] books;

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", map=" + map +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
