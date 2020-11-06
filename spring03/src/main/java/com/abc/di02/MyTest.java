package com.abc.di02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //构造器注入注入：调用相关构造器完成对象创建和属性赋值的过程
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/di02/applicationContest.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}
