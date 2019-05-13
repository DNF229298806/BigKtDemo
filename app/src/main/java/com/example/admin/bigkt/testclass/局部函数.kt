package com.example.admin.bigkt.testclass

/**
 * @author 20888
 * @date 2019/5/13 11:54
 */
class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    //重复的代码 检查函数 如果是java 只能把这部分抽出来放在外面 比如

    if (user.name.isEmpty()) {
        throw IllegalArgumentException("无法保存一个空的name")
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException("无法保存一个空的address")
    }
}

fun saveUser1(user: User) {
    //普通java的写法
    check(user, user.address, "address")
    check(user, user.name, "name")
}

//通常java都是这这样写的
fun check(user: User, s: String, fieldName: String) {
    if (s.isEmpty()) {
        throw IllegalArgumentException("无法保存对象${user.id}的${fieldName}属性 该属性为空")
    }
}

fun saveUser2(user: User) {
    //提取了User 这样ktCheck可以不需要传入user了 在局部函数很重访问外层函数的参数
    fun ktCheck(s: String, fieldName: String) {
        if (s.isEmpty()) {
            throw IllegalArgumentException("无法保存对象${user.id}的${fieldName}属性 该属性为空")
        }
    }
    ktCheck(user.name, "name")
    ktCheck(user.address, "name")
}

