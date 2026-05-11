package com.itheima.demo01;

public class MyAspect {
    public void before() {
        System.out.println("目标对象调用之前打印");
    }
    public void after() {
        System.out.println("目标对象调用之后打印");
    }
}
