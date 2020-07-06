package com.itheima_kebiancanshu;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ParamsCM {
    public static void main(String[] args) {
        // public static<T> List<T> asList(T... a): 返回由指定数组支持的固定大小的不可变集合
        List<String> list = Arrays.asList("hello", "world");
        // add\remove 不可用，因为它会修改集合大小，set可以用，因为它不修改集合大小

        // public static<E> List<E> of(E... ele): 返回包含任意元素的不可变列表
        List<String> list2 = List.of("hello", "world");
        //add/remove/set 不可用
//        list2.set(1,"javaee"); //UnsupportedOperationException
        System.out.println(list2);

        //public static<E> Set<E> of(E... ele): 返回一个包含任意数量元素的不可变集合
        Set<String> set = Set.of("hello","world");//IllegalArgumentException ,set集合不允许重复元素
//        set.add("javaee"); UnsupportedOperationException
//        set.remove("world");UnsupportedOperationException

        System.out.println(set);

    }
}
