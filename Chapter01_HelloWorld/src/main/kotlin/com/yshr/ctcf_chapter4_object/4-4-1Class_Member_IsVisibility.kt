package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/25.
 * 类成员是否可见
 */
class House

class Flower

class Countyard {
    private val house: House = House()
    private val flower: Flower = Flower()
}

class ForbiddenCity {
    val house = arrayOf(House(), House())
    val flower = arrayOf(Flower(), Flower())
}

fun main(args: Array<String>) {
    val countyard = Countyard()
//    println(countyard.flower)
    val fc = ForbiddenCity()
    println(fc.flower)

}