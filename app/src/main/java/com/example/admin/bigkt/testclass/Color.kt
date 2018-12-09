package com.example.admin.bigkt.testclass

import com.example.admin.bigkt.testclass.Color.RED

/**
 * @author Richard_Y_Wang
 * @des 2018/12/9 11:59
 */
enum class Color(val r: Int, val b: Int, val g: Int) {
    RED(255,0,0),ORANGE(255,165,0),
    YELLOW(255,255,0);

    fun rgb() = (r * 256 + g) * 256 + b

    fun getColorString(color: Color): String = when (color) {
        RED -> "红的啊傻逼"
        ORANGE-> "橙的啊傻逼"
        else-> "黄色你懂嘛"
    }
}

fun main(args: Array<String>) {
    val color = RED
    println(color.getColorString(color))
}