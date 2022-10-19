package com.audi;

import java.util.Scanner;

public class DiaqonalOne {
    public static void main(String[] args) {

        System.out.println("Matrisanin razmeri teyin edin: ");
        Scanner olcu = new Scanner(System.in);
        int x = olcu.nextInt();
        int[][] a;
        a = new int[x][x];

        System.out.print("Birinci setir ucun ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("reqem daxil edin: ");
                Scanner sc = new Scanner(System.in);
                a[i][j] = sc.nextInt();
            }
            if (i < x - 1) System.out.print("Novbeti setir ucun ");
        }

        System.out.println();
        System.out.println("A matrisasi:"+"\n");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        int i, j;
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                a[i][j] = 1;
                if (i+j==x-1) break;
            }
        }
        System.out.println("Cavab matrisasi:");

        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
               System.out.print(a[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}