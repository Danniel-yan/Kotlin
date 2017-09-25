package com.yshr.ctcf_chapter123

/**
 * Created by yshr on 2017/9/19.
 */
fun getName(): String? {
    return "xiaomi"
}

fun main(args: Array<String>) {
//    var name: String? = getName() ?: return
//    println(name?.length)

    var value: String? = "HelloWorld"
    println(value!!.length)
}