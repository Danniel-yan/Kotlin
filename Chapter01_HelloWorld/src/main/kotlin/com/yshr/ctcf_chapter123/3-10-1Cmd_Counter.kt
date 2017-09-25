package com.yshr.ctcf_chapter123

/**
 * Created by yshr on 2017/9/22.
 */
fun main(args: Array<String>) {
    while (true) {
        try {
            println("请输入算是如：3 + 4")
            val input = readLine() ?: break
            val splits = input?.trim().split(" ")
            if (splits.size < 3) {
                throw IllegalArgumentException("参数个数不对")
            }
            val arg1 = splits?.get(0)?.toDouble()
            val op = splits?.get(1)
            val arg2 = splits?.get(2)?.toDouble()
            println("$arg1 $op $arg2 = ${Operator(op.toString()).opFunction(arg1!!, arg2!!)}")
        } catch (e: NumberFormatException) {
            println("您确定您输入的是数字吗")
        } catch (e: IllegalArgumentException) {
            println("您确定输入的是用空格分开的三个参数吗")
        } catch (e: Exception) {
            println("亲爱的用户，程序出现了未知异常，${e.message}")
        } finally {
            println("感谢用户使用我们的计算器")
        }

        println("再来一发?[Y]")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            return
        }
    }
}

class Operator(op: String) {

    var opFunction = { left: Double, right: Double -> left + right }

    init {
        println("init执行了")
        opFunction = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            "%" -> { l, r -> l % r }
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

//    fun apply(left: Double, right: Double): Double {
//        return opFunction(left, right)
//    }
}