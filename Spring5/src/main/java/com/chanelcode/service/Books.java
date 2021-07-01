package com.chanelcode.service;

import com.chanelcode.bean.Book;

public class Books {
    private Book book;

    public Books(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Books{" +
                "book=" + book +
                '}';
    }
}
