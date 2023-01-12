package com.yanvar12ders;

import java.util.Random;

public class Rr {
    public static void main(String[] args) {
       Random random = new Random();

        random.ints(0, 101).limit(45).forEach(System.out::println);
    }
}
