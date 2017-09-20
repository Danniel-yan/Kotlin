package com.yshr.java;

/**
 * Created by yshr on 2017/9/19.
 */
public class TypeCase {
    public static void main(String args[]) {
        Parent p = new Parent();
        System.out.println(((Child) p).getName());
//        if (p instanceof Child) {
//            System.out.println(((Child) p).getName());
//        }
    }

}
