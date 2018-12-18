package com.example.admin.bigkt

/**
 * @author Richard_Y_Wang
 * @des 2018/12/13 21:36
 */
var opCount = 0
val UNIX_LINE_SEPARAOR = "\n"
const val UNIX_LINE_SEPARAOR1 = "???"
fun main(args: Array<String>) {
    for (i in 1..10) {
        when {
            i % 2 == 0 || i%3==0-> println("i是偶数")
            i % 10 == 0 -> println("i被10整除")
        }
    }

    val list = listOf("1", "2", "3", "4")
    println(joinToString(list))
    val testString = "Kotlin"
    println(testString.lastChar())
}

fun String.lastChar(): Char = get(length-2)

