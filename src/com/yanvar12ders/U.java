package com.yanvar12ders;

import java.util.stream.Stream;

public class U {
    public static void main(String[] args) {


        Stream.iterate(1, n -> n + 1).limit(5).map(x->Math.pow(x, x-1)).forEach(System.out::print);
        }

    }
