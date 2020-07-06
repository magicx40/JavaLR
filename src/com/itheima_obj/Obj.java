package com.itheima_obj;

/**
 * 看方法的源码
 * 选中方法：ctrl + b
 */
public class Obj {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("林青霞");
        student.setAge(30);
        System.out.println(student); //默认会调用参数的toString方法，建议所有子类重写Object.toString()方法
    }
}
