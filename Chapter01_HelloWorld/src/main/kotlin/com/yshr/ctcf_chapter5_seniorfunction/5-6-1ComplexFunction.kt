package com.yshr.ctcf_chapter5_seniorfunction

import java.util.function.Function

/**
 * Created by yshr on 2017/9/27.
 * 函数复合  andThen（实现） compose(未实现详看视频)
 * infix中缀表达式  调用函数 不用点和（）
 *
 */

val add5 = { i: Int -> i + 5 }
val multiplyBy2 = { i: Int -> i * 2 }
fun main(args: Array<String>) {
    println(multiplyBy2(add5(8)))

    val add5AndMultiBy2 = add5 andThen multiplyBy2
    println(add5AndMultiBy2(8))
}

//infix中缀表达式调用函数 不用点和（）
infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

//infix fun<P1,P2,R> Function1<P2,R>.compose(function: Function)