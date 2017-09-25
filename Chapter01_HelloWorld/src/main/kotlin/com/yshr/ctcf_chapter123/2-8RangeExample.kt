package com.yshr.ctcf_chapter123

/**
 * Created by yshr on 2017/9/19.
 */
fun main(args: Array<String>) {
    val range: IntRange = 0..1024 //闭区间0-2014
    val rangenew: IntRange = 0 until 1024 //半开区间【0-1024）
    for (i in range) {
        print("$i  ")
    }
}