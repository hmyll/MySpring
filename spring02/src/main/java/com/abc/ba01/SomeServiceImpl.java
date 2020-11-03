package com.abc.ba01;

public class SomeServiceImpl implements ISomeService{

    public SomeServiceImpl(){
        System.out.println("执行无参构造器");
    }

    public void dosome() {
        System.out.println("执行dosome()方法");
    }
}
