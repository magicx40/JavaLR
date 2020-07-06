package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class itheima_hashMao {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");

        arrayList.add(hm1);

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm1.put("郭靖", "黄蓉");
        hm1.put("杨过", "小龙女");

        arrayList.add(hm2);
        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm1.put("令狐冲", "任盈盈");
        hm1.put("林平之", "岳灵珊");

        arrayList.add(hm3);

        for (HashMap<String, String> hashMap : arrayList) {
            Set<String> keyset = hashMap.keySet();
            for (String key : keyset) {
                String value = hashMap.get(key);
                System.out.println(key + ":" + value);
            }
        }
    }
}
