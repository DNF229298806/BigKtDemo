package com.example.admin.bigkt.testclass.duotai;

/**
 * @author 20888
 * @date 2019/5/12 22:40
 */
public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("xuesheng吃");
    }
}
