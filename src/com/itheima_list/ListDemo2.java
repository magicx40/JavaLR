package com.itheima_list;

/**
 * list 特有方法
 * add(int index, E element)
 * remove(int index)
 * set(int index,E element)
 * get(int index)
 */
public class ListDemo2 {
    /**
     * 并发修改异常  ConcurrentModificationException
     *
     * 迭代器遍历的过程中，通过集合对象修改了集合中元素的长度，造成了迭代器中
     * 获取元素中预期修改值，和实际修改值不一致
     *
     * 在迭代器遍历的过程中，请勿操作集合的长度，否则会造成并发修改异常  ConcurrentModificationException
     *
     *
     *
     * 解决方案：
     * 用for循环遍历，然后用集合对象做对应操作即可
     */
}
