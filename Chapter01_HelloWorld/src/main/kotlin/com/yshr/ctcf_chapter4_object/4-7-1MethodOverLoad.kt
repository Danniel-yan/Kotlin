package com.yshr.ctcf_chapter4_object

import java.util.*

/**
 * Created by yshr on 2017/9/25.
 * 方法重载
 */

class Overloads {
//    fun a(): Int {
//        return 0
//    }

    @JvmOverloads
    fun a(int: Int = 0, string: String): Int {
        return int
    }

    fun a(string: String): String {
        return string
    }
}

fun main(args: Array<String>) {
//    val overLoad = Overloads()
//    println(overLoad.a("nihao"))
//    println(overLoad.a(10))
//    println(overLoad.a())

//    val integerList = ArrayList<Int>()
//    integerList.add(9)
//    integerList.add(8)
//    integerList.add(7)
//    integerList.add(6)
//    integerList.add(5)
//    integerList.add(4)
//    integerList.add(9)
//    println(integerList)
//
//    integerList.remove(8)
//    integerList.removeAt(2)
//    println(integerList)

}