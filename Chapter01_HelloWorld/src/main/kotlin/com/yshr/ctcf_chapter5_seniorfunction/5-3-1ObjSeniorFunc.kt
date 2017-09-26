package com.yshr.ctcf_chapter5_seniorfunction

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * Created by yshr on 2017/9/26.
 * let apply with use等高阶函数
 */
data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name is working")
    }
}

fun main(args: Array<String>) {
//    val person = findPerson()
//    println(person?.name)
//    println(person?.age)

/*    findPerson()?.let {
        println(it.name)
        println(it.age)
        it.work()

    }*/

/*    findPerson()?.apply {
        println(name)
        println(age)
        work()

    }*/

//    val br = BufferedReader(FileReader("hello.txt")).readText()


/*    val br = BufferedReader(FileReader("hello.txt"))
    with(br) {
        var line: String?
        while (true) {
            line = readLine() ?: break
            println(line)
        }
        close()
    }*/

    BufferedReader(FileReader("hello.txt")).use {
        var line: String;
        while (true) {
            line = it.readLine() ?: break
            println(line)
        }
    }

}

fun findPerson(): Person? {
    return Person("张三", 10)
}