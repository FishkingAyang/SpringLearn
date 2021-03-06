package com.ayang.spring5.aop.service;

import com.ayang.spring5.aop.dao.UserDao;

/**
 * @author Ayang
 * @date 2021/3/3 - 18:28
 */
public class UserService {
   private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void add(){
        System.out.println("service!!!!");
        dao.dao();
    }
}
