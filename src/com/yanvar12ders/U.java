package com.yanvar12ders;

import com.yanvar10.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class U {
    public static void main(String[] args) {

        List<Integer> lll = List.of(1, 4, 5, 6, 7);

        ArrayList<Integer> iter = new ArrayList<>();

        int z = lll.size();

        Stream.iterate(1, n -> n + 1).limit(z).forEach(iter::add);

        // lll.stream().map(x->Math.pow(x, iter.)

    }}


       // lll.stream().iterate(1, n -> n + 1).map(x->)

    //    Stream.iterate(1, n -> n + 1).limit(5).map(x->Math.pow(x, x-1)).forEach(System.out::print);

  //  }
