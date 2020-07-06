package com.company;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {

    }
    public void calcMaxHeight() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个和尚的身高：");
        int height1 = scanner.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int height2 = scanner.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int height3 = scanner.nextInt();

        int tempHeight = height1 > height2 ? height1 : height2;

        int maxHeight = tempHeight > height3 ? tempHeight : height3;

        System.out.println("这三个和尚中，最高的和尚身高是：" + maxHeight);
    }
}
