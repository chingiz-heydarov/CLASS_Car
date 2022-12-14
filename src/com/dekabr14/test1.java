package com.dekabr14;

import java.util.HashMap;

public class test1 {
    public static void main(String[] args) {
        String s = "aaz";
        HashMap<Integer, String> str = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            str.put(i,s.charAt(i)+"");
        }
        for(int i=0;i<str.size();i++){
            int count=0;
            System.out.println(str.get(i));
            for(int j=i+1;j<str.size();j++){
                if(str.get(i).equals(str.get(j))) {
                    count++;
                }
                System.out.println(str.get(i)+"  "+count+" defe tekrarlanir.");
            }
        }
    }
}