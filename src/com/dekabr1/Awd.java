package com.dekabr1;

public class Awd {
    boolean razdatka;
    boolean reduktor;
    boolean shrus;
    boolean mufta;
    Awd(boolean razdatka, boolean reduktor){
        this.razdatka=razdatka;
        this.reduktor=reduktor;
    }
    Awd(boolean mufta){
        this.mufta=mufta;
    }
    Awd(boolean mufta, boolean reduktor, boolean shrus){
        this.mufta=mufta;
        this.reduktor=reduktor;
        this.shrus=shrus;
    }
}
