package com.itheima_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * get(Object key)
 * Set<k> keySet()   获取所有键的集合
 * Collection<V> values() 获取所有值的集合
 * Set<Map.Entry<K,V>> entrySet() 获取所有值的集合
 */
public class Map3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        System.out.println(map.get("张三丰"));
        System.out.println(map.get("张无忌"));

        Collection<String> values = map.values();

        for(String value : values) {
            System.out.println(value);
        }
    }
}
