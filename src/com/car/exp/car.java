package com.car.exp;

public class car {
    int hp;
    int tq;
    double volume;
    int gear;
    public car (int hp, int tq, double volume, int gear){
        this.hp=hp;
        this.tq=tq;
        this.volume=volume;
        this.gear=gear;
    }
    public static void main(String[] args) {
        car passat = new car(220, 350, 2.0, 7);

        System.out.println(passat.hp);
    }
}
