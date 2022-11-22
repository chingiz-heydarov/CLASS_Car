package com.noyabr21;

public class Engine {
    int hp;
    int tq;
    int vl;
    Engine(int hp, int tq, int vl){
        this.hp=hp;
        this.tq=tq;
        this.vl=vl;
    }
    Engine(){};
}

class Specs extends Engine{
    static int ratio;
    static boolean charger;
    boolean gdi;
    boolean vvt;
    boolean vvl;
    Specs(int hp, int tq, int vl, int ratio, boolean charger){
        super(hp, tq, vl);
        this.ratio=ratio;
        this.charger=charger;
    }
    Specs(int ratio){
        super();
        this.ratio=ratio;
    }
}
