package com.abc.di02;

public class Student {
    private String name;//成员变量
    private int age;
    private School school;

    public Student(){}

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void setName(String name) {//属性：name
        this.name = name;
    }

    public void setAge(int age) {//属性：age
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
