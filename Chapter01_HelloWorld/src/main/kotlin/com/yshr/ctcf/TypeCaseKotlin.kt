package com.yshr.ctcf

import com.yshr.java.Child
import com.yshr.java.Parent

/**
 * Created by yshr on 2017/9/19.
 */
class TypeCaseKotlin {
}

fun main(args: Array<String>) {
//    val parent = Child()
//    if (parent is Child) {
//        println(parent.name)
//    }
//
//    val string: String? = "hello"
//    println(string?.length)

    val parent: Parent = Parent()
    val child: Child? = parent as Child
    System.out.println("child------->" + child)
}