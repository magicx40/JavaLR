package com.itheima_coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator 迭代器：集合专用遍历方式
 *  Iterator<E> iterator(): 返回此集合中元素的迭代器，通过集合的iterator（）方法得到
 *
 *  方法：
 *      E.next():
 *      boolean hasNext()
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("Java");

        Iterator<String> it = c.iterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
//        System.out.println(it.next());// NoSuchElementException 被各种访问器方法抛出，表示该元素不存在


//        用while循环改进判断
        while (it.hasNext()){
//            System.out.println(it.next());
            String str = it.next();
            System.out.println(str);
        }

    }
}
