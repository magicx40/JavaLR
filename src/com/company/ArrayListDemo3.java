package com.company;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 40);
        Student s3 = new Student("张曼玉", 20);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        for (int i = 0; i < arrayList.size(); i++) {
            Student s =  arrayList.get(i);
            System.out.println(s.getName() + ","  + s.getAge());
        }
    }
}
