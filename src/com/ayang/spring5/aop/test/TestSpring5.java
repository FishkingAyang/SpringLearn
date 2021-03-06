package com.ayang.spring5.aop.test;

import com.ayang.spring5.aop.Book;
import com.ayang.spring5.aop.User;
import com.ayang.spring5.aop.bean.Emp;
import com.ayang.spring5.aop.autowire.Stu;
import com.ayang.spring5.aop.bean.Orders;
import com.ayang.spring5.aop.service.UserService;
import com.ayang.spring5.aop.service1.UserService1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ayang
 * @date 2021/3/3 - 15:49
 */
public class TestSpring5 {

    @Test
    public void testAdd(){
        //1.spring depoly file
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.huoqu chuangjian duixiang
        User user = context.getBean("user",User.class);

        System.out.println("user = " + user);
        user.add();
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book1 = context.getBean("book",Book.class);
        Book book2 = context.getBean("book",Book.class);
        System.out.println(book1 + "\n" + book2);
    }

    @Test
    public void testOrder() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Orders orders = context.getBean("order",Orders.class);

        System.out.println(orders.toString());
    }

    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testEmp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Emp emp = context.getBean("emp",Emp.class);

        System.out.println(emp);
    }

    @Test
    public  void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Book book = context.getBean("mybean", Book.class);

        System.out.println(book);
    }
    @Test
    public  void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        ((ClassPathXmlApplicationContext)context).close();
    }
    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }
    @Test
    public void test7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        UserService1 userService1 = context.getBean("userService", UserService1.class);
        System.out.println("userService1 = " + userService1);
        userService1.add();

    }
}
