package com.yshr.ctcf_chapter123

/**
 * Created by yshr on 2017/9/21.
 */
//fun main(args: Array<String>) {
//
//}

fun main(vararg args: String) {
    for (arg in args) {
        println(arg)
    }


//    string = "nihao"具名参数
//    hello(1.0, 2, 3, 4, string = "nihao")

    val intArray = intArrayOf(1, 3, 5, 7)
//    hello(1.0, *intArray, string = "nihao")
    //Double 使用变长参数传过去
    hello(ints = *intArray, string = "nihao")

}

//vararg 变长参数 可以接受多个值
fun hello(double: Double = 3.0, vararg ints: Int, string: String) {
    println(double)
    ints.forEach(::println)
    println(string)

}
