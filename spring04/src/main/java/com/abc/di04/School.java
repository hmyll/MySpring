package com.abc.di04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mySchool")
@Scope("singleton")//单例模式 ：默认
//@Scope("prototype")//原型模式
public class School {

    @Value("安阳师院")
    private String sname;
    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "School{" +
                "sname='" + sname + '\'' +
                '}';
    }
}
