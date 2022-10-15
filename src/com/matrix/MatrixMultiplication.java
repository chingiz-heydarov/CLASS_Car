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
        System.out.println("A matrisasi:");
        System.out.println();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("A length= " + a[0].length);
        System.out.println("A width= " + a.length);
        System.out.println();                                      //...bura qeder A matrisasi daxil olunur ve consola cixarilir

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
        System.out.println("B matrisasi:");
        System.out.println();

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("B length= " + b[0].length);
        System.out.println("B width= " + b.length);               //...bura qeder B matrisasi doldurulur ve consola cixarilir
        System.out.println();
        System.out.println("Cavab matrisasi (C):");

        int[][] c;
        c = new int[x][x];
        //else c = new int[y][y];

        // int length = a.length - 1;
        // int width = a.length-1;   //  =2

        // System.out.println("width="+width);
        System.out.println("y=" + y);

        if (x > y) {
            for (int i = 0; i <= a.length - 1; i++) {
                for (int j = 0; j <= a.length - 1; j++) {
                    for (int k = 0; k < a.length - 1; k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
            }
        }

        else{
                for (int i = 0; i <= a.length-1; i++) {
                    for (int j = 0; j <= a.length-1; j++) {
                        for (int k = 0; k <= a.length; k++) {
                            c[i][j] = c[i][j] + a[i][k] * b[k][j];
                        }
                    }
                }
            }

            for (int i = 0; i <= a.length - 1; i++) {
                for (int j = 0; j <= a.length - 1; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }





