package com.abc.di04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //命名空间注入
    //c命名空间注入：构造器注入的另一种写法
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/di04/applicationContest.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}
