package com.abc.ba05;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {
    //bean:当前正在创建的Bean对象
    //beanName：当前正在创建的Bean对象的id属性
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("-----before-----");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("-----after-----");
        return bean;
    }
}
