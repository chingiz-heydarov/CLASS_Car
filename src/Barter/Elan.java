package Barter;


import com.yanvar5ders.B;

import java.time.LocalDate;

public class Elan {
    int year, price, mileage;
    double engine_size;
    boolean auto_gearbox, awd;
    Body kuzov;
    FuelType fuelType;
    Brand brand;

    Barter variant1, variant2, variant3;



    Elan(Brand brand, int year, double engine_size, Body kuzov,
         boolean awd, int price, int mileage, boolean auto_gearbox, FuelType fuelType, Barter b1){

        this.auto_gearbox=auto_gearbox;
        this.brand=brand;
        if(year>1970 && year<2023) {
            this.year = year;
        }
        else System.out.println("Wrong year");
        this.kuzov=kuzov;
        this.awd=awd;
        if(price>0) {
            this.price = price;
        }
        if(engine_size>0.1 && engine_size<8.0) {
            this.engine_size = engine_size;
        }
        this.mileage=mileage;
        this.fuelType=fuelType;
        this.variant1=b1;
    }


    Elan(Brand brand, int year, double engine_size, Body kuzov,boolean awd,int price,
         int mileage, boolean auto_gearbox, FuelType fuelType,  Barter b1,  Barter b2){
        this.auto_gearbox=auto_gearbox;
        this.brand=brand;
        if(year>1970 && year<2023) {
            this.year = year;
        }
        else System.out.println("Wrong year");
        this.kuzov=kuzov;
        this.awd=awd;
        if(price>0) {
            this.price = price;
        }
        if(engine_size>0.1 && engine_size<8.0) {
            this.engine_size = engine_size;
        }
        this.mileage=mileage;
        this.fuelType=fuelType;
        this.variant1=b1;
        this.variant2=b2;
    }


    Elan(Brand brand, int year, double engine_size, Body kuzov,boolean awd,
         int price,int mileage, boolean auto_gearbox,  FuelType fuelType, Barter b1, Barter b2, Barter b3){
        this.auto_gearbox=auto_gearbox;
        this.brand=brand;
        if(year>1970 && year<2023) {
            this.year = year;
        }
        else System.out.println("Wrong year");
        this.kuzov=kuzov;
        this.awd=awd;
        if(price>0) {
            this.price = price;
        }
        if(engine_size>0.1 && engine_size<8.0) {
            this.engine_size = engine_size;
        }
        this.mileage=mileage;
        this.fuelType=fuelType;
        this.variant1=b1;
        this.variant2=b2;
        this.variant3=b3;
    }


    @Override
    public String toString() {
        return "Elan{" +
                "brand=" + brand +
                ", price=" + price +
                ", mileage=" + mileage +
                ", engine_size=" + engine_size +
                ", auto_gearbox=" + auto_gearbox +
                ", awd=" + awd +
                ", kuzov=" + kuzov +
                ", fuelType=" + fuelType +
                ", year=" + year +
                ", \nvariant1=" + variant1 +
                ", \nvariant2=" + variant2 +
                ", \nvariant3=" + variant3 +
                '}';
    }
}

enum Marka{
    VOLKSWAGEN,TOYOTA,AUDI,INFINITI,BMW,HONDA,VOLVO, MERCEDES;
}

enum Body{
    SEDAN,UNIVERSAL,LIFTBEK,XETCHBEK,KABRIOLET,RODSTER,MINIVEN,SUV,LIMUZIN,FASTBEK,KUPE,VAN,FURQON,PIKAP;
}

enum FuelType{
    GASOLINE, DIESEL, HYBRID;
}

enum Mercedes_Models implements Modelable{
    A_CLASS,B_CLASS,C_CLASS,E_CLASS,S_CLASS,R_CLASS,ML,GL,GLS,GLE,CLS,CL,GT_AMG,X_CLASS,G_CLASS,VIANO,VITO,CLA,GLB,GLC,GLK,SLK;
}

enum Volkswagen_Models implements Modelable{
    GOLF,TIGUAN,JETTA,PASSAT,TOURAN,SHARAN,TOUAREG,MULTIVAN,TRANSPORTER,PHAETON,ATLAS,POLO,GOLF_R,GOLF_GTI,CARAVELLE,AMAROK,ARTEON,CC,BEETLE,CADDY,SCIROCCO,TAOS;
}

enum Audi_Models implements Modelable{
    A1,A2,A3,A4,A5,A6,A7,A8,S1,S3,S4,S5,S6,S7,S8,RS3,RS4,RS5,RS6,RS7,S8_PLUS,Q2,Q3,Q4,Q5,Q7,Q8,RSQ3,RSQ5,RSQ8,ALLROAD_A4,ALLROAD_A6,R8,TT,TTS,TTRS;
}

enum Toyota_Models implements Modelable{
    CHASER,MARK_2,ARISTO,CRESTA,MAJESTA,CROWN,CELSIOR,VENZA,SUPRA,TUNDRA,SEQUOIA,RAV4,PRIUS,YARIS,YARIS_GR,PRADO,LAND_CRUISER,CAMRY,AVALON,COROLLA,HIGHLANDER,HILUX,FORTUNER,CORONA,AVENSIS,ALPHARD,C_HR,CELICA,GT86,HARRIER,FJ_CRUISER,VITZ,CARINA,CALDINA;
}

enum Infiniti_Models implements Modelable{
    EX35,EX37,FX37,FX35,G37,G35,FX50,FX56,M56,M37;
}

enum Bmw_Models implements Modelable{
    e87,e90,e91,e92,e93,e81,e39,e46,e34,e32,e30,e36,e60,e65,e53,F20;
}

enum Honda_Models implements Modelable{
    ACCORD,CIVIC,PRELUDE,INTEGRA,CITY,PILOT,HRV,FIT,S2000;
}

enum Volvo_Models implements Modelable{
    S80,S60,S40,S90,V50,V70,V90,XC70,XC60,XC90,XC40,C30,C50;
}

interface Modelable{};
