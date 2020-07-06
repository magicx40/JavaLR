package com.itheima_14;

public class CatDemo {
    /**
     * 方法的形参是类名，其实需要的是该类的对象
     * 方法的返回值是类名，其实返回的是该类的对象
     *
     */
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        CatOperator catOperator = new CatOperator();
        Cat c = new Cat();
        catOperator.useCat(c);

        Cat c2 = catOperator.getCat();
        c2.eat();
    }
}
