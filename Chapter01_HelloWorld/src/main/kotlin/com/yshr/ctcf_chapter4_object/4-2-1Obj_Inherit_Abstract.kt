package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/25.
 */
abstract class Person(open val age: Int) {
    open fun work() {

    }
}

class MaNong(age: Int) : Person(age) {
    override val age: Int
        get() = super.age

    override fun work() {
        super.work()
        println("我是码农，我在写代码")
    }
}

class Doctor(age: Int) : Person(age) {
    override val age: Int
        get() = super.age

    override fun work() {
        super.work()
        println("我是医生，我在给病人看病")
    }
}

fun main(args: Array<String>) {
    val person = MaNong(23)
    person.work()
    println(person.age)
    val person2 = Doctor(25)
    person2.work()
    println(person2.age)
}