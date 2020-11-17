package com.abc.aop01;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        String config = "com/abc/aop01/applicationContest.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ISomeService someService = (ISomeService) ac.getBean("someService");
        someService.doFirst();
        System.out.println("---------");
        String result = someService.doSecond();
        System.out.println("测试方法输出result="+result);
        System.out.println("----------");
        String result2 = someService.doThird();
        System.out.println("测试方法输出result2="+result2);
        System.out.println("----------");
        someService.doForth();
    }
}
