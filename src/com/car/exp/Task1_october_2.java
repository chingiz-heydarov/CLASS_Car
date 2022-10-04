package com.car.exp;

import java.util.Scanner;

public  class Task1_october_2 {


            public static void main (String[]args) {
                while (true) {
                    System.out.println("---------Enter the value: ");
                    Scanner console = new Scanner(System.in);
                    int num = console.nextInt();
                    int a = num;
                    int b = 0;
                    while (num > 10) {
                        num = num / 10;
                        b++;
                    }
                    int x = 0;
                    int z;
                    int m;
                    int ten_b;
                    int ten_x_p;
                    int ten_x;
                    while (x-b<=0) {
 
                        ten_x_p = (int) Math.pow(10, (x + 1));

                        ten_x = (int) Math.pow(10, x);

                        ten_b = (int) Math.pow(10, b);


                            m = (a % ten_x_p) / ten_x;

                            z = a / ten_b;

                            a = a % ten_b;

                        b--;
                        x++;

                        if(x-b>=1 && z==m)System.out.println("Polindrom");

                        if (z != m) {
                            System.out.println("Polindrom deyil");
                            break;
                        }
                    }
                }
            }
    }

