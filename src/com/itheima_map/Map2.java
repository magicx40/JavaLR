package com.itheima_map;

import java.util.HashMap;
import java.util.Map;

/**
 * put(K key, V value)  添加
 * remove(K key)   移除
 * clear() 清除所有键值对
 * containsKey(Object key)  是否包含key
 * containsValue(Object Value)  是否包含值
 * isEmpty()  是否为空
 * size()  长度
 */
public class Map2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        System.out.println(map.remove("郭靖"));
        System.out.println(map.remove("郭襄"));

//        map.clear();

        System.out.println(map.containsKey("郭靖"));

        System.out.println(map.isEmpty());
        System.out.println(map.size());

    }
}
