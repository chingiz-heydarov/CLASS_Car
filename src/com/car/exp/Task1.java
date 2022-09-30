package com.car.exp;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int b;
        do {
            System.out.println("---------Enter the value: ");
            Scanner console = new Scanner(System.in);
            int a = console.nextInt();
            b = a;
            if (0 <= a && a <= 50) System.out.println(~a);
            else System.out.println("reqem 0-50 arasinda deyil");
        } while (0 <= b && b <= 50);
    }
}





