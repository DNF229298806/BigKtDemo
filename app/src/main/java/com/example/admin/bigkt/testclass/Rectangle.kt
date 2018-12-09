package com.example.admin.bigkt.testclass

/**
 * @author Richard_Y_Wang
 * @des 2018/12/8 15:36
 */
class Rectangle(var height: Double, var length: Double) :
    Shape(listOf(height, length, height, length)) {
    override fun calculateArea(): Double = height * length
}