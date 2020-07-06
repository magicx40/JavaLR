package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        /**
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        arrayList.add(student);
        **/

        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getName());
        }
    }

    public static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        arrayList.add(student);
    }






}
