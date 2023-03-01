package Barter;

import com.yanvar5ders.B;

import java.util.ArrayList;

public class Car {
    String brend, model, kuzov, fuel;
    Integer year, hp, probeq;
    Boolean korobka, awd, klassik;
    Double motor;

    ArrayList<Car> barters=new ArrayList<>(2);

    Car(String brend, String model, String kuzov, String fuel, Integer year, Integer hp, Integer probeq,
        Boolean korobka, Boolean awd, Boolean klassik, Double motor, ArrayList<Car> barters) {

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

