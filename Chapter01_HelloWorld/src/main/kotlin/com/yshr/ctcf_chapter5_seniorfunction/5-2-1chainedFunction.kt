package com.yshr.ctcf_chapter5_seniorfunction

import java.util.*

/**
 * Created by yshr on 2017/9/26.
 * map 映射 forEach迭代 阶乘 flapMap铺平
 * fold reduce filter takeWhile等高阶函数
 *
 */
fun main(args: Array<String>) {


/*    val list = listOf(1, 3, 4, 5, 6)
//    val newList = ArrayList<Int>()
//    list.forEach {
//        val newElement = it * 2 + 3
//        newList.add(newElement)
//    }
//
//    newList.forEach(::println)
//    val newList = list.map {
//        it * 2 + 3
//    }


    //映射到newList
    val newList = list.map(Int::toDouble)

    //迭代遍历输出
    newList.forEach(::println)*/


    /* // flatMap
     val list = listOf(
             1..20,
             2..5,
             100..322
     )

     //flatMap将集合打平 然后再进行map映射 再forEach遍历
     val flatList = list.flatMap {
         it
 //        it.map {
 //            "No.$it"
 //        }
     }
     flatList.forEach(::println)
     println(flatList.reduce { acc, i -> acc + i })*/

    // 单个数的阶乘
    println(factorial(5))

//    阶乘打印
    (0..6).map(::factorial).forEach { println(it) }

    //阶乘求和
    (0..6).map(::factorial).reduce { acc, i -> acc + i }

    // 阶乘求和 添加 加上初始值 从小到大
    println((0..6).map(::factorial).fold(5) { acc, i -> acc + i })

    //打印连接起来的字符串 从大到小
    println((0..6).map(::factorial).foldRight(StringBuilder()) { i, acc -> acc.append(i).append(",") })

// 获取阶乘结果中莫除为1的数据集合 遇到不符合条件的不为1的时候截止
    println((0..6).map(::factorial).takeWhile { it % 2 == 1 })

    // 连接字符
    println((0..6).joinToString(","))

}


fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { a, i -> a * i }
}