package com.abc.test;

import com.abc.service.ISomeService;
import com.abc.service.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyTest {

    /**
     * 当前代码存在的问题
     * 当前测试类与someServiImpl类完全耦合在一起
     */
    @Test
    public void test01(){
        SomeServiceImpl service = new SomeServiceImpl();
        service.dosmome();
    }

    @Test
    public void test02(){
        //加载spring配置文件(在类路径下存放），创建Spri容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContest.xml");
        //强制类型转换快捷键：alt+enter
        //通过bean的id从容器中获得SomeServiceImpl对象
        ISomeService service = (ISomeService) ac.getBean("someService");
        service.dosmome();
    }

    @Test
    public void test03(){
        //加载spring配置文件(在当前项目的根目录下存放），创建Spri容器对象
        ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContest.xml");
        ISomeService service = (ISomeService) ac.getBean("someService");
        service.dosmome();
    }

    public void test04(){
        //加载spring配置文件(在e盘的根目录下存放），创建Spri容器对象
        ApplicationContext ac = new FileSystemXmlApplicationContext("e:/applicationContest.xml");
        ISomeService service = (ISomeService) ac.getBean("someService");
        service.dosmome();
    }
}
