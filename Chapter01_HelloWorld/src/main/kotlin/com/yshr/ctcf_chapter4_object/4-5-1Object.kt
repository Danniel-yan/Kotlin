package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/25.
 * 查看反编译字节码 可以看出 kotlin中Object是个单例模式
 */

class Driver1

interface OnExternalDriverMountListener {

    fun onMount(driver: Driver1)

    fun onUnmount(driver: Driver1)
}

abstract class Player

object MusicPlayer : Player(), OnExternalDriverMountListener {
    override fun onMount(driver: Driver1) {

    }

    override fun onUnmount(driver: Driver1) {

    }

    val state: Int = 0
    fun play(url: String) {

    }

    fun stop() {

    }
}