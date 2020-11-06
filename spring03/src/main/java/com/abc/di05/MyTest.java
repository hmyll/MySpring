package com.abc.di05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //数组和集合注入
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/di05/applicationContest2.xml");
        Some some = (Some) ac.getBean("some");
        System.out.println(some);
    }

}
