package com.example.admin.bigkt.testclass

/**
 * @author 20888
 * @date 2019/5/11 16:56
 */
open class View {
    open fun click() {
        println("View clicked")
    }
}

class Button: View() {
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

fun main(args: Array<String>) {
    var view: View = Button()
    view.click()
    println(view.javaClass)
    view.showOff()
}