package com.example.admin.bigkt.testclass

/**
 * @author Richard_Y_Wang
 * @des 2018/12/8 18:47
 */
class Triangle(var sideA: Double, var sideB: Double, var sideC: Double) : Shape(listOf(sideA, sideB, sideC)) {
    override fun calculateArea(): Double {
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(5.0, 2.0)
    var triangle = Triangle(3.0, 4.0, 5.0)
    println("Area of rectangle is${rectangle.calculateArea()} its perimeter is ${rectangle.perimeter}")
    println("Area of rectangle is${triangle.calculateArea()} its perimeter is ${triangle.perimeter}")

}