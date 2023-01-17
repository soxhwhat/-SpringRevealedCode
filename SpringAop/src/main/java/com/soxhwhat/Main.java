package com.soxhwhat;

import org.springframework.aop.support.NameMatchMethodPointcut;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
        pointcut.setMappedName("test");
        //传入多个方法名
        pointcut.setMappedNames("test", "test2");

    }

}