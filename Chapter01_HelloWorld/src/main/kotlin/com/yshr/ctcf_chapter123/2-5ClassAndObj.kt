package com.yshr.ctcf_chapter123

/**
 * Created by yshr on 2017/9/18.
 */

class Meizi(waibiao: String) : Ren(waibiao) {
//    init {
//        println("new 了一个meizi，外表$waibiao")
//    }

}

class Shuaige(waibiao: String) : Ren(waibiao) {
//    init {
//        println("new了一个shuaige,外表$waibiao")
//    }
}

open class Ren(var waibiao: String) {
    init {
        println("new 了一个${this.javaClass.simpleName},外表：$waibiao")
    }
}

fun main(args: Array<String>) {
    val iLike: Meizi = Meizi("美丽")
    println(iLike is Ren)
//    val shaige: Shuaige = Shuaige("英俊")
}