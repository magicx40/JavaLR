package com.studentManger;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerSystem {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        while (true) {
            System.out.println("--------欢迎使用学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择:");

            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            switch (line) {
                case "1":
                    addStudent(arrayList);
                    System.out.println("添加学生成功！");
                    break;
                case "2":
                    deleteStudent(arrayList);
//                    System.out.println("删除学生");
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(arrayList);
                    break;
                case "4":
                    findAllStudent(arrayList);
//                    System.out.println("查看所有学生");
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0); //JVM 退出
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> arrayList) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        //为了让程序能够回到这里，我们使用循环
        String sid;
        while (true) {
            System.out.println("请输入学生学号：");
            sid = scanner.nextLine();

            boolean flag = isUsed(arrayList, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        String age = scanner.nextLine();
        System.out.println("请输入学生地址：");
        String address = scanner.nextLine();

        student.setName(name);
        student.setSid(sid);
        student.setAge(age);
        student.setAddress(address);

        arrayList.add(student);
    }

    //    public static void findAllStudent(ArrayList<Student> arrayList) {
//        //显示表头信息
//        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            Student s = arrayList.get(i);
//            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
//        }
//    }
    public static void findAllStudent(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("无信息，请添加信息！");
            return;
        }

        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你要删除的学生学号：");
        String sid = scanner.nextLine();

        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (student.getSid().equals(sid)) {
                arrayList.remove(i);
                System.out.println("删除学生成功！");
                break;
            } else {
                System.out.println("学号不存在，不存在请重新输入!");
                break;
            }
        }

    }

    public static void updateStudent(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你要修改的学生学号：");
        String sid = scanner.nextLine();

        System.out.println("请输入学生新姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = scanner.nextLine();
        System.out.println("请输入学生新居住地：");
        String address = scanner.nextLine();

        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);


        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getSid().equals(sid)) {
                arrayList.set(i, student);
                break;
            }
        }

    }

    public static boolean isUsed(ArrayList<Student> arrayList, String sid) {
        boolean flag = false;

        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (student.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}

