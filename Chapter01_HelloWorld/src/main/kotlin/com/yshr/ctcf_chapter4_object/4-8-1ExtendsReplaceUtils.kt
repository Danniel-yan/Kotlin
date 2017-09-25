package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/25.
 * kotlin扩展方法和属性
 */
fun main(args: Array<String>) {

//    println("abc".multiply(16))
    println("abc" * 16)
    println("abc".a)
    println("abc".b)
}

//fun String.multiply(int: Int): String {
//    val stringBuilder = StringBuilder()
//    for (i in 0 until int) {
//        stringBuilder.append(this)
//    }
//    return stringBuilder.toString()
//}

operator fun String.times(int: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

val String.a: String
    get() = "abc"
var String.b: Int
    get() = 5
    set(value) {
    }