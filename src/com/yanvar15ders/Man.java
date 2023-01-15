package com.yanvar15ders;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Man {
    static int a=5;
    public static void main(String[] args) {
        Random random = new Random();

        //IntSummaryStatistics a=random.ints(100).limit(10).summaryStatistics();

        System.out.println(random.ints(100).limit(10).summaryStatistics());

        IntSummaryStatistics intSummaryStatistics = Stream.generate(() -> a++).limit(10).mapToInt(a->Integer.parseInt("12")).summaryStatistics();

    /*    double average=random.ints(100).limit(10).summaryStatistics().getAverage();
        System.out.println("aver= "+average);
        int max=random.ints(100).limit(10).summaryStatistics().getMax();
        System.out.println("max= "+max);
        int min=random.ints(100).limit(10).summaryStatistics().getMin();
        System.out.println("min= "+min);
        long sum=random.ints(100).limit(10).summaryStatistics().getSum();
        System.out.println("sum= "+sum);  */

    }
}
