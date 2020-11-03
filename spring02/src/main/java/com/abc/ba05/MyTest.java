package com.abc.ba05;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    //Bean后处理器
    @Test
    public void test01(){
        String config = "com/abc/ba05/applicationContest.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ISomeService service = (ISomeService) ac.getBean("someService");
        ISomeService service2 = (ISomeService) ac.getBean("someService2");
        System.out.println(service);
        System.out.println(service2);
    }

}
