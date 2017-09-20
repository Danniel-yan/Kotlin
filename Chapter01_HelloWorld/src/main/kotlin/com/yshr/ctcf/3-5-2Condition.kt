package com.yshr.ctcf

/**
 * Created by yshr on 2017/9/20.
 */
private const val USERNAME = "kotln"
private const val PASSWORLD = "jetbrains"

class Player {
    enum class State {
        IDLE, BUFFERING, PLAYING, PAUSED
    }

    private var state = State.BUFFERING

    fun pause() {
        when (state) {
            Player.State.IDLE -> println("IDLE情况执行了")
            else -> println("非IDLE情况执行了")
        }
    }
}

fun main(args: Array<String>) {
//    println("请输入用户名")
//    val username = readLine()
//    println("请输入密码")
//    val passwd = readLine()

    Player().pause()
}