package com.ayang.spring5.aop.autowire;

/**
 * @author Ayang
 * @date 2021/3/5 - 1:38
 */
public class Stu {
    private Cla cla;

    public void setCla(Cla cla) {
        this.cla = cla;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "cla=" + cla +
                '}';
    }

    public void test() {
        System.out.println(cla);
    }
}
