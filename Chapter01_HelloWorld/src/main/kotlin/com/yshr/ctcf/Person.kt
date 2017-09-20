package com.yshr.ctcf

/**
 * Created by yshr on 2017/9/14.
 */
class Person constructor(name: String) {
    class Person constructor(firstName: String) {
        init {
            System.out.print("1111111111")
        }
    }

    var lastName: String = "zhang"
    //        get() = field.toUpperCase()
    var no: Int = 100

}

fun main(args: Array<String>) {
    var person: Person = Person("zhang")
    System.out.println(person.lastName)
}