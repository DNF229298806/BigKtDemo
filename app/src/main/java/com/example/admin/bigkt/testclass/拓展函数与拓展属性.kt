package com.example.admin.bigkt.testclass

/**
 * @author 20888
 * @date 2019/5/11 16:56
 * 拓展函数是传什么给什么
 * 拓展属性 在编译之后实际并不会给原来的类加上成员变量 实际只是生成一个
 * set/get方法而已
 */
open class View {
    open fun click() {
        println("View clicked")
    }
}

class Button : View() {
    override fun click() {
        println("Button clicked")
    }
}

fun View.showOff() {
    println("this is view")
}

fun Button.showOff() {
    println("this is button")
}

fun String.last2Char(): Char {
    return this[this.length - 2]
}

val String.last2Char: Char get() = this[this.length - 2]

var StringBuilder.lastChar: Char
    get() = this[this.length - 1]
    set(value) {
        this.setCharAt(length-1, value)
    }


fun main(args: Array<String>) {
    var view: View = Button()
    view.click()
    println(view.javaClass)
    view.showOff()
    val zwu = "浙江万里学院"
    println(zwu.last2Char())
    println("爱丽丝肯德基".last2Char)
    println(zwu)

    val zjdx: StringBuilder = StringBuilder("浙江大学")
    println(zjdx)
    zjdx.lastChar = '垃'
    println(zjdx)
}