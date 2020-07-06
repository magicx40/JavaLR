package com.itheima_list2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();

        Student s1 = new Student("han", 12);
        Student s2 = new Student("zhang", 33);

        arrayList.add(s1);
        arrayList.add(s2);

        Iterator<Student> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            Student stu = arrayList.get(i);
            System.out.println(stu);;
        }

        for (Student s : arrayList) {
            System.out.println(s);
        }
    }
}
