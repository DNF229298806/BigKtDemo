package com.example.admin.bigkt.testclass

/**
 * @author 20888
 * @date 2019/5/13 11:08
 */

fun main(args: Array<String>) {
    var list = listOf(1, 2, 3, 4, *args)
    var list2 = listOf(1, 2, 3, 5)
    println(list)
    println(list2)

    var map = mapOf(1 to "1", 2 to "2")
}