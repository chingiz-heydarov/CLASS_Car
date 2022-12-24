package com.rekursiya;

import java.util.Scanner;

public class Rekurs {
    public static void main(String[] args) {

        while(true) {
            System.out.println("reqem daxil edin: ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            System.out.println(faktorial(x));
        }
    }

    static int faktorial(int z){
        if(z<0) {
            System.out.println("wrong entry");
            return -1;
        }
        if(z==1 || z==0){
            return z;

        }
        return z*faktorial(z-1);
    }
}
