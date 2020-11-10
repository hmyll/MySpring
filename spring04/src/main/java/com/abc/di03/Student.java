package com.abc.di03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component //表示当前类的对象由Spring容器管理
public class Student {
    @Value("张三")
    private String name;//成员变量
    @Value("23")
    private int age;
//    @Autowired  //byType属性自动注入
//    private School school;//对象属性，域属性

//    @Autowired
//    @Qualifier("mySchool")//byTName属性自动注入，要求@Autowired， @Qualifier同时使用
//    private School school;

//    @Resource //byType属性自动注入
//    private School school;

    @Resource(name = "mySchool")//byTName属性自动注入
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
