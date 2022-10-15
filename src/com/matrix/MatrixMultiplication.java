package com.matrix;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        System.out.println("Birinci (A) matrisanin uzunlugu teyin edin: ");
        Scanner olcu = new Scanner(System.in);
        int y = olcu.nextInt();
        System.out.println("matrisanin enliyi teyin edin ");
        Scanner olcu1 = new Scanner(System.in);
        int x = olcu1.nextInt();

        int[][] a;                                                //Burdan...
        a = new int[x][y];
        int[][] b;
        b = new int[y][x];
        System.out.print("Birinci setir ucun ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("reqem daxil edin: ");
                Scanner sc = new Scanner(System.in);
                a[i][j] = sc.nextInt();
            }
            if (i < x - 1) System.out.print("Novbeti setir ucun ");
        }

        System.out.println();
        System.out.println("A matrisasi:"+"\n");


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("A length= " + a[0].length+"\n");
        System.out.println("A width= " + a.length+"\n");         //...bura qeder A matrisasi daxil olunur ve consola cixarilir

        // Burdan...
        System.out.println("QEYD: ikinci (B) matrisanin uzunlugu birinci (A) matrisanin enliyi qeder ola biler, enliyi uzunluga qeder");
        System.out.print("Birinci setir ucun ");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("reqem daxil edin: ");
                Scanner sc = new Scanner(System.in);
                b[i][j] = sc.nextInt();
            }
            if (i < y - 1) System.out.print("Novbeti setir ucun ");
        }

        System.out.println();
        System.out.println("B matrisasi:"+"\n");

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("B length= " + b[0].length);
        System.out.println("B width= " + b.length+"\n");               //...bura qeder B matrisasi doldurulur ve consola cixarilir
        System.out.println("Cavab matrisasi (C):");

        int[][] c;                                              // C matrisa elan olunur
        c = new int[x][x];

        for (int i = 0; i <= a.length - 1; i++) {                         // A ve B matrisalarin muxtelif formalari nezere tutulur
            for (int j = 0; j <= a.length - 1; j++) {
                if (x > y) {
                    for (int k = 0; k < a.length - 1; k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
                else if(x<y){
                    for (int k = 0; k <= a.length; k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
                else{
                    for (int k = 0; k <= a.length-1; k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
            }
        }
        for (int i = 0; i <= a.length - 1; i++) {                     // Matrisa cixisa verilir
            for (int j = 0; j <= a.length - 1; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}







