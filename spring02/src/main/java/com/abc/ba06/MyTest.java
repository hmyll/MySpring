package com.abc.ba06;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //Bean的生命周期
    @Test
    public void test01(){
        String config = "com/abc/ba06/applicationContest.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ISomeService service = (ISomeService) ac.getBean("someService");
        service.dosome();

        //关闭容器
        ((ClassPathXmlApplicationContext) (ac)).close();
    }

}
