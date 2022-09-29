package com.car.exp;

import java.lang.String;
import java.util.Date;

public class student {
    int boy;
    int ceki;

    public static void main(String[] args) {
        student oglan = new student();
        oglan.boy = 180;
        oglan.ceki = 70;

        student qiz = new student();
        qiz.boy = 164;
        qiz.ceki = 56;

        oglan = qiz;
        System.out.println("oglanin boyu qiz boyu qeder oldu - " + oglan.boy);

        qiz.boy++;

        System.out.println("oglanin boyu qiz boyu ile beraber qalir - " + oglan.boy);

        int o = 80;
        int q = 60;

        o = q;    //  o=60

        ++q;
        System.out.println("o=" + o);
    }
}