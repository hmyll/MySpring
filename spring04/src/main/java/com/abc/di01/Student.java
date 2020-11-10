package com.abc.di01;

public class Student {
    private String name;//成员变量
    private int age;

    public void setName(String name) {//属性：name
        this.name = name;
    }

    public void setAge(int age) {//属性：age
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
