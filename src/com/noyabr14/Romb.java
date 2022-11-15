package com.noyabr14;

class Romb implements Area {
    int d1;
    int d2;

    Romb(int x, int y) {
        this.d1 = x;
        this.d2 = y;
    }

    @Override
    public void formula() {
        System.out.println(d1 * d2 / 2);
    }
}
