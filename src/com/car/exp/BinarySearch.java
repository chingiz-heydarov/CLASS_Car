package com.car.exp;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

        public static void main(String[] args) {
            while (true) {
                System.out.println("------reqemi daxil edin------");
                Scanner reqem = new Scanner(System.in);
                int n = reqem.nextInt();
                int f[] = {0,1,1,2,3,5,8,13,21,34,55,89};

                System.out.println("Metodun isleme naeticesi: "+Arrays.binarySearch(f,n));
                for (int i = 0; i < f.length; i++) {
                    if (f[i] == n) {
                        System.out.println(i + " yerine qoyula bbiler!");
                        break;
                    }
                    if (f[i] > n) {
                        System.out.println("Massivde yoxdur, f.binarySearch (f,"+n+") = "+(-i-1));
                        break;
                    }
                    if(f.length-i==1) System.out.println("Massivde yoxdur, f.binarySearch (f,"+n+") = "+(-i-2));
                }
            }
        }
    }

