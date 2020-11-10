package com.abc.di06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/abc/di06/applicationContest.xml")
public class MyTest {

    @Resource(name = "student")
    private Student student;//byName域属性自动注入
    @Autowired
    private School school;//byType域属性自动注入

    @Test
    public void test01(){
        System.out.println(student);
    }

    @Test
    public void test02(){
        System.out.println(school);
    }
}
