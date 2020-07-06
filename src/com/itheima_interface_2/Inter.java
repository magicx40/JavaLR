package com.itheima_interface_2;

/**
 * 接口中的成员变量，只能是常量（默认被static final修饰）
 * 接口中的成员方法，只能是抽象方法 （默认被 public abstract 修饰）
 */
public interface Inter {
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 40;
    int num4 = 90;

//    public Inter() {}  接口没有构造方法
//    public void show() {}

    public abstract void method();
    void show();
}
