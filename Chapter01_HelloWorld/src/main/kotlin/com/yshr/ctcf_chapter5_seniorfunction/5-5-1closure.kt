package com.yshr.ctcf_chapter5_seniorfunction

/**
 * Created by yshr on 2017/9/27.
 * 闭包 ： 函数运行的状态 函数内嵌套函数或类
 */
val string = "Hello"

fun makeFun(): () -> Unit {
    var count = 0
    return fun() {
        println(++count)
    }
}

fun fibonacci(): () -> Long {
    var first = 0L
    var second = 1L
    return fun(): Long {
        val result = second
        second += first
        first = second - first
        return result

    }
}

fun fibonacciIterable(): Iterable<Long> {
    var first = 0L
    var second = 1L
    return Iterable {
        object : LongIterator() {
            override fun nextLong(): Long {
                val result = second
                second += first
                first = second - first
                return result
            }

            override fun hasNext() = true
        }
    }
}

fun main(args: Array<String>) {
//    val x = makeFun()
//    x()
//    x()

//    val y = fibonacci()
//    println(y())
//    println(y())
//    println(y())
//    println(y())
//    println(y())

//    for (i in fibonacciIterable()) {
//        if (i > 100) break
//        println(i)
//    }

    val add5 = add(5)
    println(add5(2)) //输出7
}

//fun add(x: Int) = fun(y: Int) = x + y
//同上等价
fun add(x: Int): (Int) -> Int {
    return fun(y: Int): Int {
        return x + y
    }
}