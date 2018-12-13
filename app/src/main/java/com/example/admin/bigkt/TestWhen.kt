package com.example.admin.bigkt

/**
 * @author Richard_Y_Wang
 * @des 2018/12/13 21:36
 */
class TestWhen {
}

fun main(args: Array<String>) {
    for (i in 1..10) {
        when {
            i % 2 == 0 || i%3==0-> println("i是偶数")
            i % 10 == 0 -> println("i被10整除")
        }
    }
}