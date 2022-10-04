package com.car.exp;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("---------Select operation (+,-,*,/): ");
        Scanner sign = new Scanner(System.in);
        var o = sign.next();


           System.out.print("a=");

        Scanner a = new Scanner(System.in);
        int x = a.nextInt();

           System.out.print("b=");

        Scanner b = new Scanner(System.in);
        int y = b.nextInt();

        double c = 0;

        switch (o) {
            case "+":
                c = x + y;
                break;
            case "-":
                c = x - y;
                break;
            case "*":
                c = x * y;
                break;
            case "/":
                c =(double) x / y;
                break;
        }
        System.out.println(c);
    }
}

