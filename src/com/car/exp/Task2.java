package com.car.exp;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int b;
        do {
            System.out.println("---------Enter the value: ");
            Scanner console = new Scanner(System.in);
            int a = console.nextInt();
            b=a;
            if (a > 0 && a % 2 == 0) System.out.println("MUSBET, CUT");
            else if (a > 0 ) System.out.println("MUSBET, TEK");
            else if (a < 0 && a % 2 != 0) System.out.println("MENFI, TEK");
            else if (a < 0 ) System.out.println("MENFI, CUT");
            else System.out.println("reqem sifirdir");
        }while (b!=0);
    }
}
