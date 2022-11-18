package com.noyabr17;

class Audi extends Car{

    Boolean quattro;

    public Audi( String model, boolean quattro, Engine engine, Gearbox gearbox){
        this.model=model;
        this.quattro=quattro;
        this.engine=engine;
        this.gearbox=gearbox;
    }
}
