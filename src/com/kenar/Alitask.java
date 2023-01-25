package com.kenar;

public class Alitask {
    public static void main(String[] args) {
        double s=900;
        int x=200;
        int vx=35;
        int count=1;
        double sm=0;
        double t=0;
        do{
            t=s/(x+vx);
            sm+=x*t;
            s=s-t*(2*vx+5);
            count++;
            if(count%2==0) vx=40;
            else vx=35;
        }while(s>0.1);
        System.out.println(sm);
    }
}
