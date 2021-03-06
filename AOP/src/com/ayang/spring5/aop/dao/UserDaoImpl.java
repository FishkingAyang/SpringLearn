package com.ayang.spring5.aop.dao;

/**
 * @author Ayang
 * @date 2021/3/5 - 16:56
 */
public class UserDaoImpl implements UserDao{
    @Override
    public String update(String id) {
        return id;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了！！！");
        return a + b;
    }
}
