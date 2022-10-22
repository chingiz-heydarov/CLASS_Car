package com.string1;

public class RemoveStars {
    public static void main(String[] args) {
        String word = "bc**xc**ccc*c*";
        while(true) {
            int a = word.indexOf('*');
            if (a == -1) break;
            word = word.substring(0, a - 1) + word.substring(a + 1);
            System.out.print(word);
            System.out.println(",  and length is "+word.length());
        }
    }
}