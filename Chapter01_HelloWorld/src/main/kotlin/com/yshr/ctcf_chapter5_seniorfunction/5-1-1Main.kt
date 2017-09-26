package com.yshr.ctcf_chapter5_seniorfunction

/**
 * Created by yshr on 2017/9/26.
 */
fun main(args: Array<String>) {
    args.forEach(::println)
    val helloWorld = Hello::world
    args.filter(String::isNotEmpty)
    var pdfPrinter = PdfPrinter()
    // kotlin 1.1之后才支持
//    args.forEach(pdfPrinter::println)
}

class PdfPrinter {
    fun println(any: Any) {
        kotlin.io.println(any)
    }
}

class Hello {
    fun world() {
        println("Hello World")
    }
}