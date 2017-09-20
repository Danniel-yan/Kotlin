package com.yshr.ctcf

/**
 * Created by yshr on 2017/9/19.
 */
val FINAL_HELLO_WORLD: String = "HelloWorld"
var helloWorld: String = "HelloVar"

val FINAL_HELLO_CHINA = "HelloChina"

fun main(args: Array<String>) {
    helloWorld = "nima"
    println(FINAL_HELLO_CHINA)
}