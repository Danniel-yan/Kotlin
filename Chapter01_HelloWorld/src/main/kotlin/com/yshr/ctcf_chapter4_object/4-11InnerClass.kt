package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/25.
 * 内部类
 */
class Outter {
    val a: Int = 0

    inner class Inner {
        val a: Int = 5
        fun hello() {
            //this@Outter 保证是外部的a
            println(this@Outter.a)
        }
    }
}

interface OnClickListener {
    fun onClick()
}

class View {
    var onClickListener: OnClickListener? = null
}

fun main(args: Array<String>) {
    val inner = Outter().Inner()
    val view = View()
    view.onClickListener= object :OnClickListener{
        override fun onClick() {

        }

    }

}