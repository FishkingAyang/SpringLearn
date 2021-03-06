package com.ayang.spring5.aop.bean;

/**
 * @author Ayang
 * @date 2021/3/3 - 20:50
 */
public class Emp {
    private String ename;
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", dept=" + dept +
                '}';
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public Dept getDept() {
        return dept;
    }


}
