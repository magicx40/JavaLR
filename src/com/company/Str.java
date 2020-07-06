package com.company;

public class Str {
    /**
     * 字符串不可变，他们的值创建后不能被更改
     * String的值不可改变，但可以被共享
     * 字符串效果上相当于字符数组（char[]），但是底层原理是字节数组（byte[]）
     */
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("SL:" + s1);

        char[] chas = {'a', 'b', 'c'};
        String s2 = new String(chas);
        System.out.println("s2:" + s2);

        byte[] bys = {97, 98, 99}; //字符a在计算机底层，是以97存储的，我们将它在标准输出里面显示，其实就是将它从底层数字再还原成字符
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        String s4 = "abc";
        System.out.println("s4:" + s4);

        Str s = new Str();
        s.isEquals();
    }

    /**
     * String对象的特点
     * 1. new 创建的字符串对象，每一次new都会申请一个内存空间，虽然内容相同但是，地址值是不同的。
     * 2. 以""方式给出的字符串，只要字符序列相同（顺序和大小写），无论在程序代码中出现几次，JVM都只会创建一个String对象
     * 并在字符串池中维护
     */
    public void Str2() {
        String s3 = "abc";
        String s4 = "abc";
    }
    /**
     * 在上面的代码中，针对第一行代码，JVM会建立一个String对象放在字符串池（常量池）中，并给s3参考，
     * 第二行则让，s4直接参考字符串池中的String对象，也就是说它们拿的是同一个字符串对象
     */

    /**
     * 字符串的比较
     * 使用==比较
     * <p>
     * 基本类型：比较的是 数据值 是否相同
     * 引用类型：比较的是 地址值 是否相同
     * <p>
     * 字符串是对象，它比较内容是否相同，需要使用equals()方法
     */

    public void isEquals() {
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        String s3 = "abc";
        String s4 = "abc";

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s2 == s3 " + (s2 == s3));
        System.out.println("s3 == s4 " + (s3 == s4));

        System.out.println("s3 == s4 " + s1.equals(s2));
        System.out.println("s3 == s4 " + s1.equals(s3));
        System.out.println("s3 == s4 " + s3.equals(s4));


    }
}
