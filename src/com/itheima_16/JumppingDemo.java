package com.itheima_16;

/**
 * 方法的形参是接口名，其实需要的是该接口的实现对象
 * 方法的返回值是接口名，其实需要的是该接口的实现类对象
 */
public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jumppingOperator = new JumppingOperator();
        Jumpping j = new Cat();
        jumppingOperator.useJumpping(j);

        Jumpping j2 = jumppingOperator.getJumpping();
        j2.jump();
    }
}
