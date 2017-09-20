package com.yshr.java;

/**
 * Created by yshr on 2017/9/19.
 */
public class NullUnSafeJava {
    public static void main(String args[]) {
        int nameLength = getName().length();
        System.out.println("nameLength----->" + nameLength);
    }

    public static String getName() {
        return "中";
    }
}
