package com.chanelcode.bean;

public class Book {
    private String bName;
    private String bNo;

    public Book() {
    }

    public Book(String bName, String bNo) {
        this.bName = bName;
        this.bNo = bNo;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbNo(String bNo) {
        this.bNo = bNo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bNo='" + bNo + '\'' +
                '}';
    }
}
