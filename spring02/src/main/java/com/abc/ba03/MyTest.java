package com.abc.ba03;

import org.junit.jupiter.api.Test;

public class MyTest {

    //静态工厂Bean
    @Test
    public void test01(){
        ServiceFactory factory = new ServiceFactory();
        ISomeService service = factory.getSomeService();
        service.dosome();
    }

}
