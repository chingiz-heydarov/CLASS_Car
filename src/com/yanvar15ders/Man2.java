package com.yanvar15ders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Man2 {
    public static void main(String[] args) {

        List<Integer> a = List.of(1,2,3,4,2);


        List<Integer> b = List.of(2,6,4,1,2);


        int c[] = a.stream().flatMapToInt(IntStream::of).filter(x->x>10).sorted().distinct().toArray();

        for (int z : c) {
            System.out.println(z);
        }
    }
}
