package com.car.exp;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("---------Enter the value: ");
            Scanner console = new Scanner(System.in);
            int a = console.nextInt();
            if(1<=a && a<=999) {
                int x, y, z;
                int w = 1;
                int c=0;
                while (c < 100) {
                    x = a / 100;
                    y = (a % 100) / 10;
                    z = a % 10;
                    w = x * x + y * y + z * z;
                    System.out.println(w);
                    if (w % 10 == 1) {
                        System.out.println("true");
                        break;
                    } else a = w;
                    c++;
                }
                if(c==100) System.out.println("false");
            }
            else System.out.println("false");
    }
}




