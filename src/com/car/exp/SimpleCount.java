package com.car.exp;

public class SimpleCount {
    public static void main(String[] args){
        int a=1;
        while(a<100){
            int b=2;
            System.out.println(1);
            while(b<a){
                if(a%b!=0){
                    b++;
                }
                else break;
                if(a-b==1)  System.out.println(a);
            }
            a++;
        }
    }
}
