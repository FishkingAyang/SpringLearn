package com.ayang.spring5.aop.factoryBean;

import com.ayang.spring5.aop.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Ayang
 * @date 2021/3/5 - 0:54
 */
public class MyBean implements FactoryBean<Book> {

    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBname("ayang");
        book.setBauthor("ayng");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
