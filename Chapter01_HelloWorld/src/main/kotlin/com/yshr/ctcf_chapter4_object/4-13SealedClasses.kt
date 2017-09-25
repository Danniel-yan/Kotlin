package com.yshr.ctcf_chapter4_object

import java.text.FieldPosition

/**
 * Created by yshr on 2017/9/25.
 */
sealed class PlayerCmd {
    class Play(val url: String, val position: Long = 0) : PlayerCmd()
    class Seek(val position: Long) : PlayerCmd()
    object Pause : PlayerCmd() //无参数用obj
    object Resume : PlayerCmd()
    object Stop : PlayerCmd()

}

