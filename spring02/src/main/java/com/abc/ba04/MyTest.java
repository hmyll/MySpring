package com.abc.ba04;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //Bean的作用范围
    @Test
    public void test01(){
        String config = "com/abc/ba04/applicationContest.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ISomeService service = (ISomeService) ac.getBean("someService");
        ISomeService service2 = (ISomeService) ac.getBean("someService");
        System.out.println(service);
        System.out.println(service2);
    }

}
