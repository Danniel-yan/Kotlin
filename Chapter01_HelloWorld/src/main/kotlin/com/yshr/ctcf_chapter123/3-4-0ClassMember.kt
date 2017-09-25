package com.yshr.ctcf_chapter123

/**
 * Created by yshr on 2017/9/20.
 */

/**
 * Created by yshr on 2017/9/18.
 */

class NewMeizi(waibiao: String) : NewRen(waibiao) {
    //    init {
//        println("new 了一个meizi，外表$waibiao")
//    }
    fun sing(name: String) {
        println("妹纸正在唱歌")
    }

    fun dance(name: String) {
        println("妹纸正在跳舞")
    }

}

class NewShuaige(waibiao: String) : NewRen(waibiao) {
//    init {
//        println("new了一个shuaige,外表$waibiao")
//    }

}

open class NewRen(var waibiao: String) {
    init {
        println("new 了一个${this.javaClass.simpleName},外表：$waibiao")
    }
}

fun main(args: Array<String>) {
    val iLike: NewMeizi = NewMeizi("美丽")
    iLike.sing("歌唱祖国")
    iLike.dance("天鹅湖")
    println(iLike is NewRen)
//    val shaige: Shuaige = Shuaige("英俊")
}