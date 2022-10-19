package com.matrix;


public class MatrixSpiral {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4}, {10, 20, 30, 40}, {100, 200, 300, 400}, {1000, 2000, 3000, 4000}};
        int len=a.length-1, sum=0, i, j;

             for( j=0, i=0; j<=len; j++) {
               System.out.println("a["+i+"]["+j+"]="+a[i][j]);
               sum+=a[i][j];
             }
        for (int x = 1; x <= a.length/2; x++){
            int m=x-1;
           for(i=x, j=len-m; i<=len-m; i++) {
               System.out.println("a["+i+"]["+j+"]="+a[i][j]);
               sum += a[i][j];
           }
            for(j=len-x, i=len-m; j>=m; j--) {
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);
                sum+=a[i][j];
            }
            for(i=len-x, j=m; i>=x; i--) {
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);
                sum+=a[i][j];
            }
           for(j=x, i=x; j<=len-x; j++) {
               System.out.println("a["+i+"]["+j+"]="+a[i][j]);
               sum+=a[i][j];
           }
        }
        System.out.println();
        System.out.println(sum);
    }
}