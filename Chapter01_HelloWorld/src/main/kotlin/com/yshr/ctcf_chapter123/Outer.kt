package com.yshr.ctcf_chapter123

/**
 * Created by yshr on 2017/9/14.
 */

class Outer {
    private val bar: Int = 1
    var v = "成员属性"

    /**嵌套内部类**/
    inner class Inner {
        fun foo() = bar  // 访问外部类成员
        fun innerTest() {
            var o = this@Outer //获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }
}

fun main(args: Array<String>) {
    val demo = Outer().Inner().foo()
    println(demo) //   1
    val demo2 = Outer().Inner().innerTest()
    println(demo2)   // 内部类可以引用外部类的成员，例如：成员属性
}