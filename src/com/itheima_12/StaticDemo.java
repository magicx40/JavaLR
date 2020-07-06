package com.itheima_12;

public class StaticDemo {
    // static 关键字是静态的意思，可以修饰成员方法，
    // 成员变量

    /**
     * 特点：
     *  被类的所有对象共享
     *  这也是我们判断是否使用静态关键字的条件
     *
     *  2 可以通过类名调用
     *      当然，也可以通过对象名调用
     *      推荐使用类名调用
     *
     */
    public static void main(String[] args) {
        Student.university = "台湾大学";
        Student s1 = new Student();
        s1.name = "林青霞";
        s1.age = 30;
        s1.show();

        Student s2 = new Student();
        s2.name = "秦汉";
        s2.age = 32;
//        s2.university = "台湾大学";
        s2.show();
    }
}
