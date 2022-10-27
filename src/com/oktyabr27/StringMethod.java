package com.oktyabr27;

public class StringMethod {
    public static void main(String[] args) {
        String w[] = {"unt", "er", "gehen"};
        String st = "untergehen";
        System.out.println(word(st, w));
    }

    static boolean word(String st, String w[]) {

        int i = 0, j = 0, a = 0, k, Stl = st.length();

        outer:   while (i != Stl) {
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
}
