package com.abc.di01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    //  1.使用可变参数构造方法，加载多个配置文件
    @Test
    public void test01(){
        String config1 = "com/abc/di01/spring-bean01.xml";
        String config2 = "com/abc/di01/spring-bean02.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config1,config2);

         Person person = (Person) ac.getBean("person");
         System.out.println(person);
         Student student = (Student) ac.getBean("student");
         System.out.println(student);
    }

    //2.使用数组的构造方法，加载多个配置文件
    @Test
    public void test02(){
        String config1 = "com/abc/di01/spring-bean01.xml";
        String config2 = "com/abc/di01/spring-bean02.xml";
        String[] configs = {config1,config2};
        ApplicationContext ac = new ClassPathXmlApplicationContext(configs);
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

    //3.使用通配符
    @Test
    public void test03(){
        String config = "com/abc/di01/spring-*.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

    //加载主配置文件
    @Test
    public void test04(){
        String config = "com/abc/di01/applicationContest.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}
