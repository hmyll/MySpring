package com.abc.ba02;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    /**使用工厂模式实现了当前测试类与SomeServiceImpl的解耦合
     *但是增加了两对耦合：当前测试类与工厂类，工厂类与SomeServImpl
     */
    @Test
    public void test01(){
        ServiceFactory factory = new ServiceFactory();
        ISomeService service = factory.getSomeService();
        service.dosome();
    }

    //降低了执行效率
    @Test
    public void test02(){
        String config = "com/abc/ba02/applicationContest.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ServiceFactory factory = (ServiceFactory) ac.getBean("factory");
        ISomeService service = factory.getSomeService();
        service.dosome();
    }

    //动态工厂Bean
    @Test
    public void test03(){
        String config = "com/abc/ba02/applicationContest.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ISomeService service = (ISomeService) ac.getBean("someService");
        service.dosome();
    }
}
