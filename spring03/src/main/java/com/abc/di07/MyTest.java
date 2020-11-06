package com.abc.di07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //SPEL注入 spring EL表达式
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/di07/applicationContest.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}
