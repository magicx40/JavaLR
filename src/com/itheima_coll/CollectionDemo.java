package com.itheima_coll;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection
 * add remove clear size isEmpty contains
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("Java");
        c.add("Javascript");
        c.add("Java");

        c.remove("Javascript");

        System.out.println(c);
        c.add("Python");

        System.out.println(c.contains("world"));
        System.out.println(c.contains("Java"));

        System.out.println(c.isEmpty());
        System.out.println(c.size());
        c.clear();
        System.out.println(c.isEmpty());
        System.out.println(c);
    }
}
