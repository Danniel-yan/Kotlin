package com.yshr.java;

import com.yshr.ctcf_chapter4_object.MusicPlayer;

/**
 * Created by yshr on 2017/9/25.
 */
public class PersonJava {
    public void work() {

    }

    public static class MaNong extends PersonJava {

        @Override
        public void work() {
            super.work();
        }
    }

    public static void main(String args[]) {
        MusicPlayer.INSTANCE.getState();
    }
}
