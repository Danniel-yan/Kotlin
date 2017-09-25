package com.yshr.ctcf_chapter123

import javax.print.attribute.standard.MediaSize

/**
 * Created by yshr on 2017/9/20.
 * 运算符复数
 */
class Complex(var real: Double, var imaginary: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    override fun toString(): String {
//        return super.toString()
        return "$real + $imaginary"
    }
}

data class Counter(val dayIndex: Int) {
    operator fun plus(increment: Int): Counter {
        return Counter(dayIndex + increment)
    }
}

class Books {
    infix fun on(value: String) {
        println("书的内容------->" + value)
    }
}

fun main(args: Array<String>) {
//    val c1 = Complex(3.0, 4.0) // 3+4
//    val c2 = Complex(2.0, 7.5) // 2+7.5
//    println(c1 + c2)

    //中缀表达式
    println(Books() on "nima")
}

