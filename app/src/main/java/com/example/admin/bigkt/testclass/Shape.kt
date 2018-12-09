package com.example.admin.bigkt.testclass

/**
 * @author Richard_Y_Wang
 * @des 2018/12/8 14:55
 */
abstract class Shape(val sides : List<Double>) {
    val perimeter : Double get() = sides.sum()
    abstract fun calculateArea(): Double
}