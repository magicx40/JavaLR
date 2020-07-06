package com.itheima_map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map 创建多态的方式，使用的是HashMap
 */
public class Map1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("itheima", "han123");
        map.put("itheima002", "zhang234");
        map.put("itheima004", "li567");
        map.put("itheima004", "li56721"); //不能拥有重复key，后添加的会覆盖先添加的
        System.out.println(map);
    }
}
