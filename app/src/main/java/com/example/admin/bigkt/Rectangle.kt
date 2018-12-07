package com.example.admin.bigkt

/**
 * @author admin
 * @des 2018/12/7
 */
class Rectangle(width: Float, height: Float) {
    private var width = 0.0
    private var height = 0.0
    //在Kotlin中只需要一个属性就能解决，重新定义了isSquare的getter属性访问器，访问器中可以写入具体逻辑代码
    var isSquare: Boolean
        get() {
            return width == height
        }
        set(value) {
            isSquare = value
        }
}