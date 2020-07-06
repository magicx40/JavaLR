package com.itheima_serialize;

import java.io.Serializable;

/**
 * 一个类要想序列化和反序列化，必须实现Serializable 接口，该接口为标记接口，不重写任何方法
 */
public class Student implements Serializable {
    private String name;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
