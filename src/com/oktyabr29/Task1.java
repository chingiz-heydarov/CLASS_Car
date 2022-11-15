package com.oktyabr29;

public class Task1 {
    public static void main(String[] args) {
        String w[] = {"cool","lock","cook"};
        String str = w[0];
        for (int j = 1; j < w.length; j++) {
            for (int i = 0; i < str.length(); i++) {
                int count = 0;
                for (int k = 0; k < w[j].length(); k++) {
                    if (str.charAt(i) == w[j].charAt(k)) break;
                    count++;
                    if (count == w[j].length()) str = str.replaceFirst(str.substring(i,i+1), "0");
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='0') System.out.print(str.charAt(i) + "\t");
        }
    }
}