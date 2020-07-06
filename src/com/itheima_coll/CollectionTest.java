package com.itheima_coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();

        Student s1 = new Student("林青霞",31);
        Student s2 = new Student("张曼玉",33);
        Student s3 = new Student("王祖贤",29);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
    }
}
