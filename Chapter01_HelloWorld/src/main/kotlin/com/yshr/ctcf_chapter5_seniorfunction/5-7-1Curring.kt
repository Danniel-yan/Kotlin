package com.yshr.ctcf_chapter5_seniorfunction

import com.sun.org.apache.xpath.internal.operations.Bool
import java.io.OutputStream
import java.nio.charset.Charset

/**
 * Created by yshr on 2017/9/27.
 * 科里化 多元函数变换成一元函数调用链的过程
 */
//fun hello(x: String, y: Int, z: Double): Boolean {
//    return true
//}

//fun curriedHello(x:String):(y:Int)->(z:Double)->Boolean{
//
//}

fun log(tag: String, target: OutputStream, message: Any?) {

    target.write("[$tag] $message\n".toByteArray())
}


// 可里化
//fun log(tag: String)
//        = fun(target: OutputStream)
//        = fun(message: Any?)
//        = target.write("[$tag] $message\n".toByteArray())


fun main(args: Array<String>) {
    log("benny", System.out, "HelloWorld")
//    log("benny")(System.out)("HelloWorld Again")

    (::log.curried())("benny")(System.out)("HelloWorld Again.")

    val consoleLogWithTag = (::log.curried())("benny")(System.out)
    consoleLogWithTag("hello again again")
    consoleLogWithTag("hello again again")
    consoleLogWithTag("hello again again")


}

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried()
        = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)

val makeString = fun(byteArray: ByteArray, charset: Charset): String {
    return String(byteArray, charset)
}