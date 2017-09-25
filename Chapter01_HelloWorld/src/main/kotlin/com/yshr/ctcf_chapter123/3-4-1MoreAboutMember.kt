package com.yshr.ctcf_chapter123

/**
 * Created by yshr on 2017/9/20.
 */


class A {
    protected var b = 0
//        get() {
//            println("kotlin get b")
//            return field
//        }
//        set(value) {
//            println("kotlin set b")
//            field = value
//        }


        protected get
        protected set
}

class X

class B {
    var b = 0
    lateinit var c: String
    lateinit var d: X
    // val 不可变 不可用lateinit修饰
    val e: X by lazy {
        println("init X")
        X()
    }

    var cc: String? = null

}

fun main(args: Array<String>) {
    val b = B()
    b.c = "nihao"
    println(b.e)

    println(b.c)

    println(b.cc?.length)
}