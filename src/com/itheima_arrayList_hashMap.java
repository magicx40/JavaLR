package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class itheima_arrayList_hashMap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        hashMap.put("sgyy", sgyy);

        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("孙悟空");
        xyj.add("猪八戒");
        hashMap.put("xyj", xyj);

        ArrayList<String> shz = new ArrayList<String>();
        shz.add("卢俊义");
        shz.add("吴用");
        hashMap.put("shz", shz);

        Set<String> stringSet = hashMap.keySet();

        for (String key : stringSet) {
            ArrayList<String> arrayList = hashMap.get(key);
            for (String s : arrayList) {
                System.out.println(key + ":" + s);
            }
        }
    }
}
