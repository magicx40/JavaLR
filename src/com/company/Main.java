package com.company;

public class Main {

    public static void main(String[] args) {
        //自动类型转换与强制类型转换
        /*
           byte --> short ----> int ----> long ----> float ----> double
           char ----> int ----> long ----> float -----> double
           小位数自动转换成大位数
           强制类型转换 （类型） 会有精度丢失
        */

        //运算符与表达式
        /*
        * + - * / %
        * 加 减 乘 除 取余
        *
        * /（两个整数做除法，得出来的商也是整数，如果想要的得到小数，必须有浮点数参与）
        *  */

        //字符的'+'操作
        /**
         * char字符在参与'+'操作的时候，会转换成unicode码
         *
         * 算数表达式中包含多个基本数据类型的时候，整个算数表达式的类型会自动提升。
         * 提升规则：
         * byte，short，char自动提升为int类型
         * 整个表达式的类型自动提升到表达式中最高等级操作数同样的类型
         * 等级顺序：byte short char -> int -> long -> float -> double
         */

        int i = 10;
        char c = 'A';
        // char ch = c + i; 此表达式错误，基本数据类型在运算过程中自动提升，char 提升为int类型，所以 两个int类型相加，结果也是int类型
        int j = i + c;
        System.out.println(j);

        // int k = 10 + 73.5; 此表达式错误，结果应为double类型的
        double k = 10 + 73.5;

        /**
         * 字符串 + 字符串  （字符串拼接）
         * 字符串 + 数字 （数字转换成字符串，字符串拼接）
         *
         * 在 "+" 操作中出现字符串时，这个 "+" 是 字符串连接符，不是算数运算符
         * "itheima" + 666
         * 在字符串中出现了 "+" 操作，就是连接符号，否则就是算数运算符号。
         * 当连续进行 "+" 操作时，从左到右计算。
         * 1 + 99 + "年黑马"
         */
        System.out.println("黑马" + 6 + 66);
        System.out.println(1 + 99 + "heima");

        /**
         * 赋值运算符
         * = （+= -= *= /= %=）
         * 拓展的赋值运算符，运算时会强制变量提升
         *
         */
        int n = 10;
        n += 20;
        n = n + 20; //等价 （有变量提升 +号）
        System.out.println("n:" + n);

        short m = 10;
         m += 10;
        // m = m + 10; //报错
        System.out.println("m:" + m);

        /**
         * 自增自减运算符
         * ++ --
         * ++ -- 既可以放在变量前面，也可以放在变量后边
         * 单独使用的时候，++和--无论是放在变量的前面还是后边，结果都是一样的。
         *
         * 参与运算的时候，如果放在变量的后边，先拿变量参与运算，后拿变量做++或做--
         * 参与运算的时候，如果放在变量的前边，先拿变量做++或者--，在参与运算
         *
         * 单独使用最常用
         *
         */

        /**
         * 关系运算符
         * 返回值：布尔类型
         * == != > >= < <=
         */

        /**
         * 逻辑运算符
         *
         * & 逻辑与 a&b a和b都是true结果为true，否则为false
         * | 逻辑或 a|b a和b都是false，结果是false，否则是true
         * ^ 逻辑异或 a^b a和b结果不同为true， 相同为false
         * ! 逻辑非 !a 结果正好与a相反
         */

        ScannerDemo demo = new ScannerDemo();
        demo.calcMaxHeight();
    }
}
