package com.ayang.spring5.aop.bean;

/**
 * @author Ayang
 * @date 2021/3/3 - 20:51
 */
public class Dept {
    private String name;
    private String xm;

    public void setName(String name) {
        this.name = name;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                ", xm='" + xm + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getXm() {
        return xm;
    }
}
