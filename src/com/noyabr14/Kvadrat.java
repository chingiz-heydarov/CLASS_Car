package com.noyabr14;

class Kvadrat implements Area {
    double a;

    Kvadrat(double x) {
        this.a = x;
    }

    @Override
    public void formula() {
        System.out.println(a * a);
    }
}