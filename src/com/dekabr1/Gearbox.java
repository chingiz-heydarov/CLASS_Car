package com.dekabr1;

public class Gearbox {
    boolean hydroblok;
    boolean mechatronic;
    boolean dryclutch;
    boolean wetclutch;
    boolean planetGear;
    boolean hydrotransformator;

    boolean konus;

    String chain;
    int gear;
    Gearbox(boolean hydroblok, boolean hydrotransformator, boolean planetGear){
        this.hydrotransformator=hydrotransformator;
        this.hydroblok=hydroblok;
        this.planetGear=planetGear;
    }
    Gearbox(boolean mechatronic, boolean wetclutch, int gear){
        if(gear>2 && gear<5) this.gear=gear;
        this.mechatronic=mechatronic;
        this.wetclutch=wetclutch;
    }
    Gearbox(boolean mechatronic, boolean dryclutch){
        this.mechatronic=mechatronic;
        this.dryclutch=dryclutch;
    }
    Gearbox(boolean konus, String chain){
        this.konus=konus;
        this.chain=chain;
    }
}
