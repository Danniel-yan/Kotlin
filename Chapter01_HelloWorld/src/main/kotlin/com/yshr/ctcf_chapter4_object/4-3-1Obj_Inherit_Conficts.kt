package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/25.
 *
 */
abstract class K {
    open fun x(): Int = 5
}

interface M {
    fun x(): Int = 1
}

interface E {
    fun x(): Int = 0
}

class F(var y: Int = 0) : K(), M, E {
    override fun x(): Int {
        println("call x(): Int in F")
        if (y > 0) {
            return y
        } else if (y < -200) {
            return super<M>.x()
        } else if (y < -100) {
            return super<E>.x()
        } else {
            return super<K>.x()
        }

    }

//    override fun x(): Int {
//    }

}

fun main(args: Array<String>) {
    println(F(3).x())
    println(F(-10).x())

}