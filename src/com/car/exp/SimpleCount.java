package com.car.exp;

public class SimpleCount {

    public static void main(String[] args) {
        int a = 1;
        while (a < 100) {
            int b = 2;
            if (a <= b) System.out.println(a);
            while (b < a) {
                if (a - b == 1) System.out.println(a);
                if (a % b != 0) {
                    b++;
                } else break;
            }
            a++;
        }
    }
}
