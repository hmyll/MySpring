package com.abc.ba02;

public class ServiceFactory {

    public ISomeService getSomeService(){
        return new SomeServiceImpl();
    }
}
