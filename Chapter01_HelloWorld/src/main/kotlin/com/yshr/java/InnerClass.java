package com.yshr.java;

import com.yshr.ctcf_chapter4_object.OnClickListener;
import com.yshr.ctcf_chapter4_object.View;

/**
 * Created by yshr on 2017/9/25.
 * 内部类持有外部类的引用
 * 静态内部类不持有外部类的引用 静态内部类不可直接获取外部类的属性值
 */
public class InnerClass {
    private int a;

    public class Inner {
        public void hello() {
            System.out.println(InnerClass.this.a);
        }
    }

    public static void main(String args[]) {
        InnerClass innerClass = new InnerClass();
        Inner inner = innerClass.new Inner();
        View view = new View();
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {

            }
        });
    }
}
