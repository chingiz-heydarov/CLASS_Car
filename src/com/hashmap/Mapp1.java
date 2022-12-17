package com.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Mapp1 {
    public static void main(String[] args) {

        HashMap<Integer, String> str = new HashMap<>();

        str.put(1, "I");
        str.put(2, "II");
        str.put(3, "III");
        str.put(4, "IV");
        str.put(5, "V");
        str.put(6, "VI");
        str.put(7, "VII");
        str.put(8, "VIII");
        str.put(9, "IX");
        str.put(10, "X");

        while (true) {
            System.out.println("Enter value 0-20:");
            int c = new Scanner(System.in).nextInt();

            if (str.containsKey(c)) System.out.println(str.get(c));
            else System.out.println(str.get(10) + str.get(c - 10));
        }
    }
}