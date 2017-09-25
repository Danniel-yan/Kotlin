package com.yshr.ctcf_chapter123

import javax.swing.Box

/**
 * Created by yshr on 2017/9/14.
 */

/*
interface A {
    fun foo() {
        print("A")
    }   // 已实现

    fun bar()                  // 未实现，没有方法体，是抽象的
}

interface B {
    fun foo() {
        print("B")
    }   // 已实现

    fun bar() {
        print("bar")
    } // 已实现
}

class C : A {
    override fun bar() {
        print("bar")
    }   // 重写
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main(args: Array<String>) {
    val d = D()
    d.foo();
    d.bar();
}*/


//fun main(args: Array<String>) {
//    System.out.println("Hello")


/*    for (i in 1..4)
        System.out.println(i)*/

/*    for (i in 1..10 step 4)
        System.out.println(i)*/

/*    for (i in 5 downTo 1 step 2)
        System.out.print(i  )*/

/*var a = arrayOf(1, 2, 3)
System.out.print(a[2])*/

/*    val str = "helloworld"
    for (c in str)
        System.out.print("char->"+c + "  ")*/

/*    val text = """
    多行字符串1
    多行字符串2
    """
    println(text)   // 输出有一些前置空格*/

/*    val text = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    println(text)    // 前置空格删除了*/

/* val items = setOf("apple", "banana", "kiwi")
 when {
     "orange" in items -> println("juicy")
     "apple" in items -> println("apple is fine too")
 }*/


/*   val items = listOf("apple", "banana", "kiwi")
   for (item in items) {
       println(item)
   }

   for (index in items.indices) {
       println("item at $index is ${items[index]}")
   }*/

/*    var allByDefault: Int? // 错误: 需要一个初始化语句, 默认实现了 getter 和 setter 方法
    var initialized = 1    // 类型为 Int, 默认实现了 getter 和 setter
    val simple: Int?       // 类型为 Int ，默认实现 getter ，但必须在构造函数中初始化
    val inferredType = 1   // 类型为 Int 类型,默认实现 getter*/


//}

/*
class User(var name: String)

*/
/**扩展函数**/
/*

fun User.Print() {
    print("用户名 $name")
}

fun main(arg: Array<String>) {
    var user = User("Runoob")
    user.Print()
}*/


/*
// 扩展函数 swap,调换不同位置的值
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]     //  this 对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {

    val l = mutableListOf(1, 2, 3)
    // 位置 0 和 2 的值做了互换
    l.swap(0, 2) // 'swap()' 函数内的 'this' 将指向 'l' 的值

    println(l.toString())
}*/


/*
open class C

class D: C()

fun C.foo() = "c"   // 扩展函数 foo

fun D.foo() = "d"   // 扩展函数 foo

fun printFoo(c: C) {
    println(c.foo())  // 类型是 C 类
}

fun main(arg:Array<String>){
    printFoo(D())
}*/


/*
class MyClass {
    companion object { }  // 将被称为 "Companion"
}

fun MyClass.Companion.foo() {
    println("伴随对象的扩展函数")
}

val MyClass.Companion.no: Int
    get() = 10

fun main(args: Array<String>) {
    println("no:${MyClass.no}")
    MyClass.foo()
}*/

/*data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val jack = User("jack", 18)
    println(jack)
    val olderJack = jack.copy(age = 20)
    println(olderJack)
}*/

/*
class Box<T>(t: T) {
    var value = t
}

fun main(args: Array<String>) {
    var box = Box<Int>(10)
    var boxString = Box<String>("nimeide")
    println(box.value)
    println(boxString.value)
}*/

/*
class Box<T>(t: T) {
    var value = t
}

fun <T> boxInt(value: T) = Box<T>(value)

fun main(args: Array<String>) {
    val box4 = boxInt<Int>(1)
    println(box4.value)
}*/


/*
fun main(args: Array<String>) {
    val age = 23
    val name = "runoob"
    val bool = true

    doPrintln(age)    // 整型
    doPrintln(name)   // 字符串
    doPrintln(bool)   // 布尔型
}

fun <T> doPrintln(content: T) {

    when (content) {
        is Int -> println("整型数字为 $content")
        is String -> println("字符串转换为大写：${content.toUpperCase()}")
        else -> println("T 不是整型，也不是字符串")
    }
}*/


enum class Shape(value:Int){
    ovel(100),
    rectangle(200)
}