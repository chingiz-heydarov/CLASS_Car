package com.dekabr6;

import java.util.ArrayList;

public class Intellekt {
    public static void main(String[] args) {

        ArrayList<Employee> a= new ArrayList<>();

        a.add(new AA(38, 86, 17, false));
        a.add(new AA(46, 93, 22, true));
        a.add(new AA(52, 76, 31, true));
        a.add( new AA(34, 95, 11, false));
        a.add(new Office(29, 88, 9, true));
        a.add(new Office(37, 85, 8, true));
        a.add(new Office(25, 103, 8, false));
        a.add(new Office(27, 118, 9, false));
        a.add(new Biznes(38, 73, false));
        a.add(new Biznes(50, 108, true));
        a.add(new Biznes(33, 99, true));


        int count;
        do {
            count = 0;
            for (int i = 0; i < a.size()-1; i++) {
                if (a.get(i).iq > a.get(i+1).iq) {

                    a.add(i, a.get(i+1));
                    a.remove(i+2);
                    count++;
                }
            }
        } while (count != 0);


        for (Employee z : a) {
            System.out.print(z.iq + "\t");
        }
    }
}
