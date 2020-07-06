package com.itheima_interface_2;

//public class InterImpl implements Inter{
public class InterImpl extends Object implements Inter{
    public InterImpl() {
        super();
    }

    @Override
    public void method() {
        System.out.println("子类InterImpl实现了Inter接口");
    }

    @Override
    public void show() {
        System.out.println("show方法");
    }
}
