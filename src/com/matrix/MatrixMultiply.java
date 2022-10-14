package com.matrix;

public class MatrixMultiply {
    public static void main(String[] args) {
       // int a[][] = {{2, 2}, {3, 3}};
       // int b[][] = {{1, 5}, {1, 5}};
        int a[][] = {{1,0,3},{2,1,0},{0,4,0}};
        int b[][] = {{1,2,0},{0,1,1},{0,2,1}};

          /*         2  2      1  5         1  0  3      1  2  0
                     3  3      1  5         2  1  0      0  1  1
                                            0  4  0      0  2  1         */

        //int c[][] = {{0, 0}, {0, 0}};
        int c[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int length = a.length - 1;
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= length; j++) {
                for (int k = 0; k <= length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    }

