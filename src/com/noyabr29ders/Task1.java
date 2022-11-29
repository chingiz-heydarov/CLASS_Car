package com.noyabr29ders;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        Box<String> word=new Box<>("word", "abc");
        Box<Integer> count=new Box<>("count",5);
        Box<Double> fload=new Box<>("double",6.0);
        Box<Character> ch=new Box<>("character",'g');
        Box[] f= {word, count, fload, ch};
        for( Box ff : f){
            System.out.println(ff.name);
        }
    }
}
