package com.ayang.spring5.aop;

/**
 * @author Ayang
 * @date 2021/3/3 - 17:56
 */
public class Book {
    private String bname;
    private String bauthor;
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getBname() {
        return bname;
    }

    public String getBauthor() {
        return bauthor;
    }
//    public Book(String bname) {
//        this.bname = bname;
//    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBname("abc");
    }


}
