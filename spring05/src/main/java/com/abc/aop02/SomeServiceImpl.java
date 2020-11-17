package com.abc.aop02;

public class SomeServiceImpl implements ISomeService {

    public void doFirst() {
        System.out.println("执行SomeServiceImpl类中的方法doFirst()方法");
    }

    public String doSecond() {
        System.out.println("执行SomeServiceImpl类中的方法doSecond()方法");
        return "aynu";
}

    public String doThird() {
        System.out.println("执行SomeServiceImpl类中的方法doThird()方法");
        return "rjxy";
    }

    public void doForth() {
        System.out.println("执行SomeServiceImpl类中的方法doForth()方法"+3/0);
        // System.out.println("执行SomeServiceImpl类中的方法doForth()方法");
    }

}
