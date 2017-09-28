package com.yshr.ctcf_chapter5_seniorfunction

import java.io.File
import java.util.*

/**
 * Created by yshr on 2017/9/27.
 */
fun main(args: Array<String>) {
    val map = HashMap<Char, Int>()
    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace)
            //功能等同于下
            .groupBy { it }.map {
            it.key to it.value.size
            }.forEach(::println)

    /* {

        val count = map[it]
        if (count == null) map[it] = 1
        else map[it] = count + 1
    }*/

    map.forEach(::println)
}