package com.car.exp;

public class car1 {
    int hp;
    boolean awd;

    public static void main(String[] args) {
        car1 bmw = new car1();
        bmw.hp = 286;
        bmw.awd = false;
        if (bmw.awd == true) {
            System.out.println("the power of e90 335d is " + bmw.hp + " hp, all wd");
        }
        else {
            System.out.println("the power of e90 335d is " +bmw.hp + " hp, rear wd");
        }
    }
}
