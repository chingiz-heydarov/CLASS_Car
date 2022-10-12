package com.car.exp;

import java.util.Scanner;

public class SortSimple {
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
            int k = 0;                                    // k - tapilan minimal reqem qoyulacaq yerinin nomresi
            for (int j = 0; j < size; j++) {                // j - minimal reqem oldugunun yoxlanan yerinin nomresi
                for (int i = j + 1; i < size; i++) {          // a[j] ile massivin qalan reqemleri muqayise olunur
                    if (size - i == 1 && a[j] < a[i]) {         // a[j] minimal reqemdirse a[k]-nin yerine qoyulur
                        int b = a[k];
                        a[k] = a[j];
                        a[j] = b;
                        k++;
                        j = k - 1;
                    }
                    if (size - i == 1 && a[j] > a[i]) {        // a[j] axirinci a[i]-den boyukdurse, a[i] a[k]-nin yerine qoyulur
                        int b = a[k];
                        a[k] = a[i];
                        a[i] = b;
                        k++;
                        j = k - 1;
                    }
                    if (a[j] > a[i]) break;                 // a[j] her hansi a[i]-den boyukdurse, demeli minimal reqem deyil
                }
            }
            for (int z : a) {
                System.out.print(z + " ");
            }
        }
    }

