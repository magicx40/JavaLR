package com.itheima_interface;

/**
 * 定义了一个接口
 *
 * 接口的特点
 * 接口用关键字interface修饰
 *  public interface 接口名{}
 *
 * 类实现接口用immplements 表示
 *  public class 类名 immplements 接口名{}
 * 接口不能实例化
 *  接口如何实例化？参照多态的方式，通过实现类对象实例化，这叫接口多态
 *  多态的形式，具体类多态，抽象类多态，接口多态
 *  多态的前提：有继承或者实现关系；有方法重写；有父类引用指向（子/实现）类对象
 *
 * 接口的实现类
 *  要么重写接口的所有抽象方法
 *  要么是抽象类
 *
 * 接口可看作是特殊的抽象类
 */
public interface Jummping {
    public abstract void jump();
}
