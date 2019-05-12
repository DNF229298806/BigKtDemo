package com.example.admin.bigkt.testclass.duotai;

/**
 * @author 20888
 * @date 2019/5/12 22:41
 */
public class Test {
    public static void aaa(Student s) {
        System.out.println("Student="+s.name);
    }
    public static void aaa(Person p) {
        System.out.println("Person=" + p.name);
    }

    public static void main(String[] args) {
        Person p = new Student("张三");
        Person p1 = new Person("历史");
        Student s = new Student("哈哈哈");
        p.eat();
        aaa( (Student) p);
        aaa(p1);
        aaa(s);
        System.out.println(p.getClass());
        if (p instanceof Student) {
            System.out.println("111");
        }
        if (p instanceof Person) {
            System.out.println("2222");
        }
    }
}
