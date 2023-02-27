package Barter;

import java.util.ArrayList;

public class Car {
    String brend, model, kuzov, fuel;
    int year, hp, probeq;
    boolean korobka, awd, klassik;
    double motor;

    ArrayList<Car> barters=new ArrayList<>(2);

    Car(String brend, String model, String kuzov, String fuel, int year, int hp, int probeq, boolean korobka, boolean awd, boolean klassik,
        double motor, ArrayList<Car> barters) {

        this.brend = brend;
        this.model = model;
        this.kuzov = kuzov;
        this.fuel = fuel;
        this.year = year;
        this.hp = hp;
        this.probeq = probeq;
        this.korobka = korobka;
        this.awd = awd;
        this.klassik = klassik;
        this.motor = motor;
        this.barters = barters;
    }
}

