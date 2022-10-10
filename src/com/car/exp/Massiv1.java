package com.car.exp;

import java.util.Scanner;

public class Massiv1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("------reqemi daxil edin------");
            Scanner reqem = new Scanner(System.in);
            int model = reqem.nextInt();
            int a[] = {116, 118, 120, 125, 130, 135, 140, 318, 320, 328, 330, 335, 340, 520, 523, 525, 528, 530, 535, 540, 550};
            //i=20 / a[20]=550, length=21

            for (int i = 0; i < a.length; i++) {
                if (a[i] == model) {
                    System.out.println(i + " nomreli edede beraberdir!!!");
                    break;
                }
                if (a[i] > model) {
                    System.out.println("Massivde yoxdur, "+i+" nomreli olan ededin yerine elave oluna biler");
                    break;
                }
                if(a.length-i==1) System.out.println("Massivde yoxdur, "+(i+1) + " nomre ile massive elave oluna biler");
            }
        }
    }
}
