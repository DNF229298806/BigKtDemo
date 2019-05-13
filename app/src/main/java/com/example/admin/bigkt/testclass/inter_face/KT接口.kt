package com.example.admin.bigkt.testclass.inter_face

import java.io.Serializable

/**
 * @author 20888
 * @date 2019/5/13 14:19
 */
interface Clickable {
    /*
    * 可以有一个默认的实现
    * */
    fun click() {
        println("baba click")
    }
}

interface Focusable {
    fun click() {
        println("Focus click")
    }
}

class View : Clickable, Focusable {
    override fun click() {
        super<Clickable>.click()
        super<Focusable>.click()
    }
}

class Button : Clickable {
    override fun click() {
        println("bt")
    }
}

interface State : Serializable
interface KTView {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = "123123123"
}


 fun main(args: Array<String>) {
    val view = View()
    view.click()
    println(PrivateUser("test@kotlinaaaaa.org").nickname)
    println(SubscribingUser("11111111111111@wwwwwwwwwwwww.org").nickname)
}
