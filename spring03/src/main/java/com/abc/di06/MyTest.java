package com.abc.di06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //域属性自动注入 byName，byType
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/di06/applicationContest.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}
