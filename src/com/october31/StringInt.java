package com.october31;

import java.util.Random;
import java.util.Scanner;

public class StringInt {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Soz daxil edin: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int[] a = new int[s.length()];
            int[] b=randMass(a);

            funk(b, s);
        }
    }

    public static int[] randMass(int a[]) {                   //return array???

        Random r = new Random();

        outer:
        for (int i = 0; i < a.length; i++) {
            int x = r.nextInt(a.length);
            for (int j = i; j >= 0; j--) {
                if (x == a[j]) {
                    i--;
                    continue outer;
                }
                a[i] = x;
            }
        }
        return a;
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
        System.out.println(sum);          //return array?
    }
}
