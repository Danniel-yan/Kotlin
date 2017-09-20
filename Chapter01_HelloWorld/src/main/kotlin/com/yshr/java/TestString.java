package com.yshr.java;

/**
 * Created by yshr on 2017/9/18.
 */
public class TestString {
    public static void main(String args[]) {
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
