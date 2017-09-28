package com.yshr.ctcf_chapter8_java_kotlin


/**
 * Created by yshr on 2017/9/28.
 */
fun main(args: Array<String>) {
    val source = "hello, telephone num:010-8098765"""
    val pattern = ".*(\\d{3}-\\d{8}).*"
    Regex(pattern).findAll(source).toList().flatMap(MatchResult::groupValues).forEach({
        println(it)
    })
}