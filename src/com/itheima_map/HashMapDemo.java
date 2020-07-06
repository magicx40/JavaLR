package com.itheima_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<String, Student>();

        Student student1 = new Student(1, "张曼玉");
        Student student2 = new Student(2, "王祖贤");
        Student student3 = new Student(3, "林青霞");

        map.put("001", student1);
        map.put("002", student2);
        map.put("003", student3);

        Set<Map.Entry<String, Student>> entries = map.entrySet();

        for (Map.Entry<String, Student> stu : entries) {
            String key = stu.getKey();
            Student value = stu.getValue();
            System.out.println(key + ":" + value);
        }

        System.out.println("------------------");
        Set<String> strings = map.keySet();

        for (String key : strings) {
            Student value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
