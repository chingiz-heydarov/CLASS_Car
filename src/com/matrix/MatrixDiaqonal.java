package com.matrix;

public class MatrixDiaqonal {
    public static void main(String[] args) {
        int a[][]={{1,3,7,6,1},{8,1,2,1,5},{3,5,1,9,6},{2,1,3,1,0},{1,4,7,3,1}};
        /*     1  3  7  6  1
               8  1  2  1  5
               3  5  1  9  6
               2  1  3  1  0
               1  4  7  3  1    */
        int length=a.length-1;
        int primary=0, secondary=0;
        for(int i=0,j=0; i<=length; i++,j++){
            primary=primary+a[i][j];
            secondary=secondary+a[i][length-j];
        }
        if(length%2==0) System.out.println(primary+secondary-a[length/2][length/2]);
        else System.out.println(primary+secondary);
    }
}
