package com.yshr.ctcf

import java.util.*

/**
 * Created by yshr on 2017/9/21.
 */
class Student {
    fun isNotClothedProperlt(): Boolean {
        return false
    }
}

fun main(args: Array<String>) {
//    val students = ArrayList<Student>()
//    for (student in students) {
//        if (student.isNotClothedProperlt()) {
//            break
//        }
//    }

    for (i in 1..10) {
        if (i == 5) continue
        println(i)
    }

}
