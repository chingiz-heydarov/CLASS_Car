package Barter;

public class Bartor extends Car {

    Bartor(String brend, String model, String kuzov, String fuel, int year, int hp, int probeq,
           boolean korobka, boolean awd, boolean klassik, double motor) {
        this.brend=brend;
        this.model=model;
        this.kuzov=kuzov;
        this.fuel=fuel;
        this.year=year;
        this.hp=hp;
        this.probeq=probeq;
        this.korobka=korobka;
        this.awd=awd;
        this.klassik=klassik;
        this.motor=motor;

        // super(brend, model, kuzov, fuel, hp, year, probeq, awd, klassik, korobka, motor);
    }
}
