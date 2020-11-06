package com.abc.di03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //命名空间注入
    //p命名空间注入：设置注入的另一种写法
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/di03/applicationContest.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}
