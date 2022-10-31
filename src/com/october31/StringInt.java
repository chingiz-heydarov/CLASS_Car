package com.october31;

public class StringInt {
    public static void main(String[] args) {
        String s = "abcdefgh";
        int[] a = {4, 7, 3, 1, 5, 0, 6, 2};
        funk(a, s);
    }

    public static void funk(int[] a, String s) {       // ?????
        char[] c = s.toCharArray();
        String sum = "";
        int l = a.length;
        char[] nevv = new char[l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++)
                if (a[j] == i) {
                    nevv[i] = c[j];
                    break;
                }
        }
        for (char z : nevv)
            sum += z + " ";
        System.out.println(sum);//return array?
    }
}
