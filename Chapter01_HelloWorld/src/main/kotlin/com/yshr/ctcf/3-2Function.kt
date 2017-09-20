package com.yshr.ctcf

/**
 * Created by yshr on 2017/9/19.
 */
fun main(args: Array<String>) {

    println("hello ${args[0]}")
    println(sum(2, 3))

    checkArgs(args)

    val arg1 = args[0]?.toInt()
    val arg2 = args[1]?.toInt()
    println("$arg1 + $arg2 = ${arg1 + arg2}")

    println(getResult(4))
}

fun checkArgs(args: Array<String>) {
    if (args.size != 2) {
        printUsage()
//        return
        System.exit(-1)
    }
}

fun printUsage() {
    println("请传入两个整数")
}

fun sum(arg1: Int, arg2: Int): Int = arg1 + arg2

val getResult = fun(arg1: Int): Long {
    return arg1.toLong()
}