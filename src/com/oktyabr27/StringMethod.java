package com.oktyabr27;

import java.util.List;

public class StringMethod {
    public static void main(String[] args) {
        String w[] = {"hello", "er"};
        String st = "helloerererer";
        System.out.println(word(st, w));
    }

    static boolean word(String st, String w[]) {

        int i = 0, j = 0, a = 0, k, Stl = st.length();

        outer:
        while (i != Stl) {
            int l = w[j].length();
            for (i = a, k = 0; k < l; i++, k++) {
                if (st.charAt(i) != w[j].charAt(k)) break outer;
                // System.out.print(w[j].charAt(k)+"\t");
            }
            a += l;
            j++;
        }
        if (i == Stl) return true;
        else return false;
    }


    public boolean wordBreak(String s, List<String> wordDict) {
        String[] w = new String[wordDict.size()];
        int t = 0;
        for (String sd : wordDict) {
            w[t] = sd;
            t++;
        }


        int i = 0, j = 0, a = 0, k, Stl = s.length();

        outer:
        while (i != Stl) {
            int l = w[j].length();
            for (i = a, k = 0; k < l; i++, k++) {
                if (s.charAt(i) != w[j].charAt(k)) break outer;
                // System.out.print(w[j].charAt(k)+"\t");
            }
            a += l;
            j++;
        }
        if (i == Stl) return true;
        else return false;

    }
}