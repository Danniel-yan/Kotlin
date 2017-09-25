package com.yshr.ctcf_chapter4_object

import kotlin.reflect.KProperty

/**
 * Created by yshr on 2017/9/25.
 * 属性代理
 * var/val <property name>:<Type> by <expression>
 *  代理者需要实现相应的setValue/getValue方法
 */

class Agent {

    // 第一次访问到时 被初始化为HelloWorld
    val hello by lazy {
        "HelloWorld"
    }

    //自定义lazy
    val hello2 by X()
    var hello3 by X()

    class X {
        private var value: String? = null
        operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
            println("getValue $thisRef -> ${property.name}")
            return value ?: ""
        }

        operator fun setValue(arg: Any?, property: KProperty<*>, s: String) {
            println("setValue $arg -> ${property.name} = $s")
            this.value = value
        }

    }
}

fun main(args: Array<String>) {
    val agent = Agent()
    println(agent.hello)
    println(agent.hello2)
    println(agent.hello3)
    agent.hello3 = "value of hello3"
}