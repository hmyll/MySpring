package com.abc.ba01;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //容器调用Bean的无参构造器创建对象。
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/ba01/applicationContest.xml");
        ISomeService service = (ISomeService) ac.getBean("someService");
        service.dosome();
    }

}
