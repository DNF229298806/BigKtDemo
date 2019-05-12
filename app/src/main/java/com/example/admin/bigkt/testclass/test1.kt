package com.example.admin.bigkt.testclass

/**
 * @author 20888
 * @date 2019/5/11 11:37
 */
class JX(var width: Int, var height: Int) {
    val isSquare: Boolean get() = width == height
}

/**
 * @param separator 分隔
 * @param prefix 字首
 * @param postfix 后缀
 */
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0)
            result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/***
 * 拓展函数
 */
fun String.lastChar(): Char = this[this.length - 1]

fun main(args: Array<String>) {
    println("捡来的 卢卡斯的卢卡斯加大师框架阿斯卡隆卡死了去欧文禄口街道中心拿到看见了".lastChar())
    var jx = JX(5, 5)
    println(jx.isSquare)
    jx.height = 100
    println(jx.isSquare)
    var list = mutableListOf(1, 2, 3, 4)
    println(joinToString(list, prefix = ")", postfix = "("))
    list.addAll(mutableListOf(5, 6, 7, 8, 9))
    println(joinToString(list, "草"))

}
