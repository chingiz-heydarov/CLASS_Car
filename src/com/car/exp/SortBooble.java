package com.car.exp;

import java.util.Scanner;

public class SortBooble {
    public static void main(String[] args) {
        System.out.println("Massivin olcusunu daxin edin: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a;
        a = new int[size];
        for (int m = 0; m < size; m++) {
            System.out.println("Reqemleri daxil edin ");
            Scanner scn = new Scanner(System.in);
            a[m] = scn.nextInt();
        }
            int count;
            do {
                count = 0;
                for (int i = 0; i < size - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        int b = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = b;
                        count++;
                    }
                }
            } while (count != 0);
            for (int z : a) {
                System.out.print(z + " ");
            }
        }
    }
