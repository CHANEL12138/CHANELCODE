package com.chanelcode.bean;

import org.springframework.beans.factory.FactoryBean;

public class Factory implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setbName("哈哈哈");
        book.setbNo("1231244412");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
