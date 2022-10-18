package com.matrix;

import java.util.Scanner;

public class MatrixDiaqUP {
    public static void main(String[] args){
        while(true) {
            System.out.println("Diaqonali secin. p - Primary(esas)), s - Secondary (ikinci) :");
            Scanner diaqonal = new Scanner(System.in);
            var diq = diaqonal.next();
            System.out.println("Diaqonaldan asagisini ve ya yuxarisini secin. u - up, d - down :");
            Scanner updown = new Scanner(System.in);
            var ud = updown.next();

            int a[][] = {{1, 2, 3, 4, 5}, {11, 12, 13, 14, 15}, {21, 22, 23, 24, 25}, {31, 32, 33, 34, 35}, {41, 42, 43, 44, 45}};

        /*     1  2  3  4  5
               11 12 13 14 15
               21 22 23 24 25
               32 32 33 34 35
               41 42 43 44 45      */

            int i, j, l = a.length - 1, x = 0, m;

            switch (diq) {
                case ("p"):
                    switch (ud) {
                        case ("u"):
                            for (i = 0; i < l; i++) {                               // Prim Up
                                x++;
                                for (m = 1; m < x; m++) System.out.print("\t");
                                for (j = x; j <= l; j++) System.out.print(a[i][j] + "\t");
                                System.out.println();
                            }
                            break;
                        case ("d"):
                            for (i = 1; i <= l; i++) {                         // Prim Downer
                                for (j = 0; j < l; j++) {
                                    if (i == j) break;
                                    System.out.print(a[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("SECIM DUZGUN OLUNMAYIB");
                            break;
                    }
                    break;
                case ("s"):
                    switch (ud) {
                        case ("u"):
                            for (i = 0; i <= l; i++) {                            //  Sec up
                                for (j = 0; j < l; j++) {
                                    if (i + j == l) break;
                                    System.out.print(a[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            break;
                        case ("d"):
                            for (i = 1; i <= l; i++) {                                 // Sec Down
                                for (m = l - 1 - x; m > 0; m--) System.out.print("\t");
                                for (j = l - x; j <= l; j++) System.out.print(a[i][j] + "\t");
                                x++;
                                System.out.println();
                            }
                            break;
                        default:
                        System.out.println("SECIM DUZGUN OLUNMAYIB");
                        break;
                    }
                    break;
                default:
                    System.out.println("SECIM DUZGUN OLUNMAYIB");
                    break;
            }
        }
    }
}
