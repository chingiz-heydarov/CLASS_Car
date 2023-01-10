package com.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Map2 {
    public static void main(String[] args) {

        HashMap<String, String> str = new HashMap<>();

        str.put("goturmek","get");
        str.put("almaq", "get");
        str.put("qaytarmaq","get");
        str.put("heqiqeten","indeed");
        str.put("dogrudan", "indeed");
        str.put("danismaq","talk");
        str.put("sohbet elemek", "talk");

        String c = new Scanner(System.in).nextLine();

        System.out.println(str.get(c));
    }
}