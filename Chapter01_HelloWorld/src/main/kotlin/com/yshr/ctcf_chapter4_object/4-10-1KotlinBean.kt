package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/25.
 * bean用data修饰默认实现了toString等方法
 * data class 自带component方法
 * class要是实现的话 自己加上
 *data class是默认final 默认没有无参构造函数 不能有子类被继承。 用的话 需要编译期allOPen和noArg插件 此处未实现 用到时详看视频
 */
data class Country(val id: Int, val name: String)

class ComponentX {
    operator fun component1(): String {
        return "您好"
    }

    operator fun component2(): Int {
        return 1
    }

    operator fun component3(): Int {
        return 1
    }

    operator fun component4(): Int {
        return 0
    }
}

fun main(args: Array<String>) {
    val china = Country(0, "中国")
    println(china)
    println(china.component1())
    println(china.component2())

    val (id, name) = china
    println(id)
    println(name)

//    for ((index, value) in args.withIndex()) {
//        println(index)
//        println(value)
//    }

    val componentX = ComponentX()
    val (a, b, c, d) = componentX
    println("$a $b $c $d")
}