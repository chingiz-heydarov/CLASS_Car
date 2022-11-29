package com.noyabr29ders;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        X aa=new X("aa");
        X bb=new X("bb");
        X cc=new X("cc");
        X dd=new X("dd");


        X[] f= {aa,bb,cc,dd};

        for( X ff : f){
            System.out.println(ff.toString());
        }
    }
}
