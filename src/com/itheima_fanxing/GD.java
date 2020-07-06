package com.itheima_fanxing;

import java.util.ArrayList;
import java.util.List;

public class GD {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        System.out.println("----------------");

        // 上限
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();
        System.out.println("-----------------");

        //下限
        List<? super Number> list7 = new ArrayList<Number>();
//        List<? super Number> list8 = new ArrayList<Integer>(); 报错


    }
}
