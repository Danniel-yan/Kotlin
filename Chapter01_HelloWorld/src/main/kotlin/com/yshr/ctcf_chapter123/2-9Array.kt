package com.yshr.ctcf_chapter123

import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by yshr on 2017/9/19.
 */

val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
val arrayOfChar: CharArray = charArrayOf('h', 'e', 'l', 'l', 'o')
val arrayOfString: Array<String> = arrayOf("我", "是", "码农")
//val arrayOf书记:Array<市委书记> = arrayOf(市委书记("张"),市委书记("王"))

fun main(args: Array<String>) {
    println(arrayOfInt.size)
//    for (i in arrayOfChar) {
//        print(i)
//    }

    println(arrayOfChar.joinToString())
    println(arrayOfChar.joinToString(""))
    println(arrayOfInt.slice(1..3))
}