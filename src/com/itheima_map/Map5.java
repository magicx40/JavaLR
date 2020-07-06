package com.itheima_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Set<Map.Entry<K,V>> entrySet()
 */
public class Map5 {
    public static void main(String[] args) {
        //遍历2
        Map<String, String> map = new HashMap<String, String>();

        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        Set<Map.Entry<String, String>> entries = map.entrySet(); //cmd + alt + v

        for(Map.Entry<String, String> me : entries) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + ":" + value);
        }

    }
}
