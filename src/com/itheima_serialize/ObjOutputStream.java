package com.itheima_serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象序列化流：将对象保存在磁盘中，或者在网络中传输对象
 * 这种机制就是使用一个字节序列表示一个对象，该字节序列包含：对象的类型、对象的数据和对象中存储的属性等
 * 信息字节序列写到文件之后，相当于在文件中持久保存了一个对象的信息
 * 反之，该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化
 * <p>
 * 要实现序列化和反序列化就要使用对象序列化流和对象反序列化流
 * 对象序列化流：ObjectOutputStream
 * 对象反序列化流：ObjectInputStream
 */
public class ObjOutputStream {
    /**
     * 对象序列化流：ObjectOutputStream
     * 将java对象的原始数据类型和图形写入OutputStream。可以使用ObjectInputStream进行反序列化，可以使用网络套接字流进行网络传输
     */

    /**
     * 构造方法： ObjectOutputStream(OutputStream out) 创建一个写入指定OutputStream流的ObjectOutputStream
     *
     * NotSerializableException 抛出一个实例需要一个Serializable接口。序列化运行时或实例化的类可能会爆出此异常
     *
     * 类的序列化由实现Java.io.Serializable接口的类启用。不实现此接口的类不会使任何状态序列化或反序列化
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./oos.txt"));
        Student student = new Student("林青霞", 25);
        oos.writeObject(student);
        oos.close();
    }
}
