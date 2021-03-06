package com.ayang.spring5.aop.service1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Ayang
 * @date 2021/3/5 - 14:45
 */

@Service(value = "userService")
public class UserService1 {

    public void add(){
        System.out.println("service add!!!!!!");
    }
}
