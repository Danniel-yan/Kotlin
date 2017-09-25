package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/25.
 */

// 经理自己写作 开车 权利独揽一身
class Manager : Driver, Writer {
    override fun write() {

    }

    override fun drive() {

    }

}

//class SeniorManager(val driver: Driver, val writer: Writer) : Driver, Writer {
//    override fun drive() {
//        driver.drive()
//    }
//
//    override fun write() {
//        writer.write()
//    }
//
//}

// 高级经理 找司机开车 别人写作 权利下放
// kotlin的牛逼语法 功能等价同上 不用再重写方法 by作为接口代理的关键字 之后还会有 属性代理
class SeniorManager(val driver: Driver, val writer: Writer) : Driver by driver, Writer by writer

class CarDriver : Driver {
    override fun drive() {
        println("开车呢")
    }

}

class PPTWriter : Writer {
    override fun write() {
        println("做ppt呢")
    }

}


interface Driver {
    fun drive()
}

interface Writer {
    fun write()
}

fun main(args: Array<String>) {
    val driver = CarDriver()
    val writer = PPTWriter()
    val seniorManager = SeniorManager(driver, writer)
    seniorManager.drive()
    seniorManager.write()

}