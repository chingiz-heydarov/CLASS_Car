package com.noyabr14;

public class Polymorphism {
    public static void main(String args[]) {

        Area a5 = new Kvadrat(5.0);
        Kvadrat a7 = new Kvadrat(7);
        Daire r1 = new Daire(1);
        Daire r3 = new Daire(3);
        Daire r10 = new Daire(10);
        Romb d1 = new Romb(3, 4);
        Romb d2 = new Romb(5, 7);

        Area [] f = {r1, d2, a7, r3, d1, r10, a5};

        for (int i = 0; i < f.length; i++)
            f[i].formula();

    }
}






