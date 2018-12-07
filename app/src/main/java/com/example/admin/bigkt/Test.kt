package com.example.admin.bigkt


fun getStringLength(obj: Any): Int? {
    if (obj is String && obj.length >= 0) {
        return obj.length
    }
    return null
}

/**
 * 区间
 */
fun qujian(num: Int) {

    //until 范围为[1,num)
    for (x in 1 until num) {
        println(x)
    }

    for (y in 1..num) {
        println(y)
    }
}

fun nullCheck() {
    //类型后面加?表示可为空
    val age: String? = "123"
    //字段后面加"!!"抛出空指针异常
    val ages = age!!.toInt()
    //字段后面加”？“不做处理返回 null
    val ages1 = age?.toInt()
    //使用”?:“ 表示age为空返回-1
    val ages2 = age?.toInt() ?: -1
}

/**
 * 有步长的 相等于等差数列
 * indices 得到一个类似数据的东西[0,size]
 */
fun shulie() {
    val list = listOf("a", "b", "c")
    println("indices=${list.indices}")
    for (x in 0..100 step 2) {
        println(x)
    }
}

/**
 * 集合
 */
fun collection() {
    //对集合进行迭代
    val list = listOf("C", "C++","java", "kotlin", "python","JavaScript")
    for (i in list) {
        println(i)
    }

    for (index in list.indices) {
        println(index)
    }

    //使用 in 运算符判断集合内是否包含某个实例
    when {
        "java" in list -> println("java is good lang")
        "kotlin" in list -> println("kotlin is good good lang")
        else -> println("python is best lang")
    }
    //使用lambda 表达式来过滤(filter)和映射(map)集合
    list.filter { it.startsWith("p") }
        .sortedBy { it }
        .map { it.toUpperCase()}
        .forEach(::println)
}

fun useWhen(str : String) = when (str) {
    "666"-> {
        println(str)
    }
    else -> {
        println("Kotlin${str}真的很有意思")
    }
}

fun main(args: Array<String>) {
    var s1 = "This is a pig"
    var a = 1
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    s1 = if (s1 == "123") "123" else "234"
    println(s2)
    qujian(50)
    shulie()
    collection()
    useWhen("")
}
