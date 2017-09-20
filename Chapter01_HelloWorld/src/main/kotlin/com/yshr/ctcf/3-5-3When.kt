package com.yshr.ctcf

/**
 * Created by yshr on 2017/9/20.
 */
fun main(args: Array<String>) {
    var x = 0
    when (x) {
//        is Int -> println("x在1-100区间")
        in 1..100 -> println("$x 在区间内")
        !in 1..100 -> println("$x 不在区间内")
    }
}