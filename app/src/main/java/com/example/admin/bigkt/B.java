package com.example.admin.bigkt;

/**
 * @author Richard_Y_Wang
 * @des 2018/12/19 20:22
 */
public class B extends A {
    public static void aaa() {
        System.out.println("bbbbbbbbbb");
    }
    public static void main(String[] args) {
        A a = new B();
       A.aaa();
    }
}
