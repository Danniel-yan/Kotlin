package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/22.
 */
abstract class A {
    var i = 0
    abstract fun hello()
}

interface B {
    var j: Int
    fun hello() {
        println(j)
    }
}

class D : A(){
    override fun hello() {

    }

}