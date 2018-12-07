package com.example.admin.bigkt

import java.util.*

/**
 * @author admin
 * @des 2018/12/7
 * 假设一: 在Kotlin中的val修饰的变量不能说不可变的，只能说val修饰变量的权限是可读的。这个例子已经证实是真的
 * 假设二: 在Koltin中的val修饰的变量的引用是不可变的，但是指向的对象是可变的。
 */
class RandomNum {
    val num2 get() = Random().nextInt()
    val num: Int
        get() = Random().nextInt()
}

fun main(args: Array<String>) {
    println("the num is ${RandomNum().num}")
    println("the num is ${RandomNum().num}")
    println("num2 is ${RandomNum().num2}")
    println("num2 is ${RandomNum().num2}")
}
