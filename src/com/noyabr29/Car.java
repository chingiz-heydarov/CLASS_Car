package com.noyabr29;

import java.time.LocalDate;
import java.util.Date;

public class Car {

    String model;
    String vin;
    LocalDate year;
    Car(String model, String vin, LocalDate year){
        if(vin.length()==17) this.vin=vin;
        this.year=year;
        this.model=model;
    }
}
