package com.car.exp;

import java.util.Scanner;

public class SevenThree {
    public static void main(String[] args) {

        System.out.println("Birinci reqemi daxil edin");
            Scanner reqem = new Scanner(System.in);
            int a = reqem.nextInt();
            System.out.println("Ikinci reqemi daxil edin");
            Scanner reqem2 = new Scanner(System.in);
            int b = reqem2.nextInt();
            if(a<b) {
                for (int i = a; i < b; i++)
                    if (i % 21 == 0) System.out.println(i);
            }
            else{
                for (int i = b; i < a; i++)
                    if (i % 21 == 0) System.out.println(i);
            }
        }
    }
