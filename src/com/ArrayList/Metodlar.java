package com.ArrayList;

import java.util.ArrayList;

public class Metodlar {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        int[] aa = {3, 4, 7, 1, 4, 9};
        for (int temp : aa) a.add(temp);

        ArrayList<Integer> b = new ArrayList<>();
        int[] bb = {2, 8, 1, 3, 4, 3};
        for (int temp : bb) b.add(temp);

        ArrayList<Integer> result;

        ArrayList<Integer> tempA = (ArrayList<Integer>) a.clone();
        ArrayList<Integer> tempB = (ArrayList<Integer>) b.clone();

        result = sum(tempA, tempB);

        System.out.println("Kesicmesinde olan reqemler:");

        for (Integer z : result) System.out.print(z + "\t");

        System.out.println();

        result = antisum(b, a, tempB);

        System.out.println("Kesicmesinde olmayan reqemler:");

        for (Integer z : result) System.out.print(z + "\t");
    }


    static ArrayList<Integer> sum(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> sum = new ArrayList<>();
        for (int x : a) {
            if (b.contains(x)) {
                sum.add(x);
                b.remove(b.indexOf(x));
            }
        }
        return sum;
    }

    static ArrayList<Integer> antisum(ArrayList<Integer> b, ArrayList<Integer> a, ArrayList<Integer> tempB) {
        for (int x : b) {
            if (a.contains(x)) {

                a.remove(a.indexOf(x));
            }
        }
        tempB.addAll(a);
        return tempB;
    }
}



