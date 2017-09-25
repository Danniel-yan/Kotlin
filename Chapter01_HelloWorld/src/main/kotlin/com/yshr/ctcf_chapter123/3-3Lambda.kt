package com.yshr.ctcf_chapter123

/**
 * Created by yshr on 2017/9/19.
 */
val sum = fun(arg: Int): Long {
    return arg.toLong()
}
val sum2 = { arg1: Int, arg2: Int ->
    println("$arg1 + $arg2 = ")
    arg1 + arg2
}


fun main(args: Array<String>) {
//    println(sum2(1, 3))
//   == println(sum2.invoke(1, 3))

//    for (i in args) {
//        println(i)
//    }

//    args.forEach(::println)

/*    // lamda表达式非函数 return 跳出main 不会执行 println("The End")
    args.forEach {
        if (it == "q") return
        println(it)
    }
    println("The End")*/

    fun printUsage() {
        println("请传入两个整数")
    }

    args.forEach ForEach@{
        if (it == "q") return@ForEach
        println(it)
    }
    println("The End")

    println(sum)
    println(::printUsage is () -> Unit)

}
