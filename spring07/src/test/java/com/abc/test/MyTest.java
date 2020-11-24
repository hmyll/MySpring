package com.abc.test;

import com.abc.beans.BuyStockException;
import com.abc.service.IBuyStockService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    private IBuyStockService service;

    @Before
    public void before(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContest2.xml");
        //service = (IBuyStockService) ac.getBean("serviceProxy");
        service = (IBuyStockService) ac.getBean("buyService");
    }

    @Test
    public void test01(){//开户
        service.openAccount("张三",10000);
        service.openStock("安阳钢铁",0);
    }

    @Test
    public void test02(){//开户
        try {
            service.buyStock("张三",1000,"安阳钢铁",500);
        } catch (BuyStockException e) {
            e.printStackTrace();
        }
    }
}
