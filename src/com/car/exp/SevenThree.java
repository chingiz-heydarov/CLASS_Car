package com.car.exp;

import java.util.Scanner;

public class SevenThree {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Birinci reqemi daxil edin");
            Scanner reqem = new Scanner(System.in);
            int a = reqem.nextInt();
            System.out.println("Ikinci reqemi daxil edin");
            Scanner reqem2 = new Scanner(System.in);
            int b = reqem2.nextInt();
            if (a % 3 == 0 && a % 7 == 0) System.out.println("a 7 ve 3 bolunur");
            else System.out.println("a 7 ve 3 bolunMUR");
            if (b % 3 == 0 && b % 7 == 0) System.out.println("b 7 ve 3 bolunur");
            else System.out.println("b 7 ve 3 bolunMUR");
        }
    }
}