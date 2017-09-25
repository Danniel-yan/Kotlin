package com.yshr.ctcf_chapter4_object


/**
 * Created by yshr on 2017/9/25.
 * 伴生对象 相当于java中的静态方法
 */
fun main(args: Array<String>) {
//    val a = minOf(args[0].toInt(),args[1].toInt())
//    val list1 = listOf("a", "b")
//    val list2 = listOf("x", "y", "z")
//    val minSize = minOf(list1.size, list2.size)

    val latitude = Latitude.ofDouble(3.0)
    val latitude2 = Latitude.ofLatitude(latitude)
}

class Latitude private constructor(val value: Double) {

    companion object {
        @JvmStatic // 供java直接调用 否则 java中用Class.companion.属性或方法
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }

        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.value)
        }
    }
}