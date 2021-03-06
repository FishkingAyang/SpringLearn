package com.ayang.spring5.aop.bean;

/**
 * @author Ayang
 * @date 2021/3/5 - 1:17
 */
public class Orders {
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.print("第二步 调用set方法注入属性值");
        System.out.println("name = " + name);
    }

    public Orders() {
        System.out.println("第一步 执行无参数构造创建bean实例");
    }

    public void initMethod() {
        System.out.println("第三步 执行初始化方法");
    }

    public void destoryMethod() {
        System.out.println("第五步 执行销毁方法");
    }
}
