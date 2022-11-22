package com.noyabr21;

import java.time.Period;

public abstract class Car {
    Engine engine;
    Gearbox gearbox;



    public void Remap(){
            int stage1=(engine.tq-engine.hp)*10/Specs.ratio;
            engine.hp+=stage1;
            //System.out.println(engine.hp);
    }

    public void WheelPower(){
        int loss;
        int percent=0;
        int wheelPower;
        if(gearbox.type.equals("DRY")) percent+=15;
        else if(gearbox.type.equals("DCT")) percent+=20;
        else {
            if(gearbox.gears<6) percent+=30;
            else percent+=25;
        }
        if(Chassis.classic) percent+=10;
        else percent+=5;
        if(Awd.trans.equals("Torsen")) percent+=5;
        loss=engine.hp*percent/100;
        wheelPower=engine.hp-loss;
        System.out.println("HP at the crank after remap: "+engine.hp+" and HP at the wheels: "+wheelPower);
    }

}

class Brand extends Car{
    String brandName;
    Chassis chassis;
    Brand(String brandName, Chassis chassis){
        this.brandName=brandName;
        this.chassis=chassis;
    }
}

class Model extends Brand{
    String model;

    Specs specs;
    Model(String brandName, String model, Engine engine, Gearbox gearbox,  Chassis chassis, Specs specs){
        super(brandName,chassis);
        this.model=model;
        this.engine=engine;
        this.gearbox=gearbox;
        this.specs=specs;
    }
}

