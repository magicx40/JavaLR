package com.ext;

/**
 * 方法重写注意事项
 * 1.私有方法不能被重写（父类私有成员子类不能继承的）
 * 2.子类方法访问权限不能更低（public > 默认 > private
 */
public class Zi extends Fu{
//    @Override
//    private void show() {
//        System.out.println("Zi中show（）方法被调用");
//    }
//    @Override
//    public void method() {
//        System.out.println("Zi中method（）方法被调用");
//    }

    /**
     * 不写访问修饰符，即为默认访问修饰符，
     * 子类重写父类方法时，访问修饰符权限不可低于父类权限
     */
    @Override
    void method() {
        System.out.println("Zi中method（）方法被调用");
    }

}
