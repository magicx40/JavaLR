package com.itheima_int_Str;

public class IntegerDemo {
    /**
     * 装箱：把基本数据类型转换为对应的包装类类型
     * 拆箱：把包装类类型转换为对应的基本数据类型
     */
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100); //装箱
        Integer ii = 100;  //自动装箱

//         拆箱：把包装类类型转换为对应的基本数据类型
//         ii += 200;
//        ii = ii.intValue() + 200;  //ii.intValue 拆箱   该表达式为自动装箱

        ii += 200;  //自动拆箱 + 自动装箱
        System.out.println(ii);

        Integer iii = null;
        if (iii != null) { //Exception in thread "main" java.lang.NullPointerException
            iii += 200;
        }
    }
}
