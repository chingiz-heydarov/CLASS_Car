package com.yanvar15ders;

import java.util.ArrayList;
import java.util.List;

public class Man2 {
    public static void main(String[] args) {

        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(4);

        List<Integer> b=new ArrayList<>();
        b.add(2);
        b.add(6);
        b.add(4);
        b.add(1);
        b.add(2);

        Object[] c =a.stream().filter(b::contains).sorted().toArray();
        for (Object z: c
             ) {
            System.out.println(z);

        }
    }
}
