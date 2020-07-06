package com.itheima_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();

        Student s1 = new Student("linqingxia", 31);
        Student s2 = new Student("zhangmanyu", 33);
        Student s3 = new Student("wangzuxian", 33);
        Student s4 = new Student("liuyan", 35);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });

        for (Student student : arrayList) {
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}
