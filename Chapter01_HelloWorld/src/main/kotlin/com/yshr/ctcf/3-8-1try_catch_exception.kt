package com.yshr.ctcf

/**
 * Created by yshr on 2017/9/21.
 */
fun main(args: Array<String>) {
//    try {
//        val arg1 = args[0].toInt()
//        val arg2 = args[1].toInt()
//        println("$arg1 + $arg2 = ${sum2(arg1, arg2)}")
//    } catch (e: NumberFormatException) {
//        println("请确定输入整数")
//    } catch (e: ArrayIndexOutOfBoundsException) {
//        println("请确保输入正确的参数")
//    } catch (e: Exception) {
//        println("程序出现未知错误")
//    } finally {
//        println("感谢用户使用我们的程序")
//    }

    val result = try {
        args[0].toInt()
    } catch (e: Exception) {
        e.printStackTrace()
        0
    } finally {
        println("感谢使用")
    }
    println(result)

}

//fun sum(arg1: Int, arg2: Int): Int {
//    return arg1 + arg2
//}

fun sum2(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}