package com.abc.di02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //DI：依赖注入，为对象的属性赋值
    //设置注入：调用相关属性的setter方法完成赋值的过程
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/di02/applicationContest.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}
