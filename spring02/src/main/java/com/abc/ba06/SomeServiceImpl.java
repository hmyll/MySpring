package com.abc.ba06;

public class SomeServiceImpl implements ISomeService {

    public SomeServiceImpl(){
        System.out.println("=====");
    }

    public void dosome() {
        System.out.println("执行dosome()方法");
    }

    public void afterInit(){
        System.out.println("当前对象初始化完毕");
    }

    public void beforeDestory(){
        System.out.println("当前对象马上就要被销毁了");
    }


}
