package com.ext;

public class MethodReWrite {
    /**
     * 方法重写概述：
     * 子类中出现了与父类中一模一样的方法声明
     *
     * 方法重写的应用
     * 当子类需要父类的功能，而功能主体子类有自己特有的内容时，可以重写父类的方法，这样，即沿袭了父类的功能，又定义
     * 了子类特有的内容
     *
     * 练习：手机类，新手机类
     */
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call("Jerry");
        System.out.println("_______________");
        NewPhone newPhone = new NewPhone();
        newPhone.call("Jummy");
    }
}
