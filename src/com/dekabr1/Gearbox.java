package com.dekabr1;

public class Gearbox {
    boolean hydroblok;

    boolean clutch;

    boolean mechanics;
    boolean hydrotransformator;

    Gearbox(boolean hydroblok, boolean hydrotransformator, boolean mechanics, boolean clutch){
        this.hydrotransformator=hydrotransformator;
        this.hydroblok=hydroblok;
        this.clutch=clutch;
        this.mechanics=mechanics;
    }
}
