package com.yshr.ctcf_chapter123

import java.util.*

/**
 * Created by yshr on 2017/9/21.
 */
fun main(args: Array<String>) {
    var x = 5
//    while (x > 0) {
//        println(x)
//        x--
//    }

    do {
        println(x)
        x--
    }while (x>0)

//    /*
//       a
//       b
//       c
//       d*/
//    for (arg in args) {
//        println(arg)
//    }
//
//    /*
//    0 -> a
//    1 -> b
//    2 -> c
//    3 -> d*/
//    for ((index, value) in args.withIndex()) {
//        println("$index -> $value")
//    }
//
//    for (indexValue in args.withIndex()) {
//        println("${indexValue.index} -> ${indexValue.value}")
//    }


//    val list = MyIntList()
//    list.add(1)
//    list.add(2)
//    list.add(3)
//    for (i in list) {
//        println(i)
//    }

}

class MyIterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()
    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int: Int) {
        list.remove(int)
    }

    operator fun iterator(): MyIterator {
        return MyIterator(list.iterator())
    }
}