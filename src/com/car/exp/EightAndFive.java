package com.car.exp;

import java.util.Scanner;

public class EightAndFive {
    public static void main(String[] args) {
      System.out.print("a=");
        Scanner reqem = new Scanner(System.in);
        int a = reqem.nextInt();
        System.out.print("b=");
        Scanner reqem2 = new Scanner(System.in);
        int b = reqem2.nextInt();

       a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("b="+b);
        System.out.println("a="+a);

    }
}
