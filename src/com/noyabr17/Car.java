package com.noyabr17;

public class Car {
    Engine engine;
    Gearbox gearbox;
    String model;

     public void detector(){
        if(engine.Volume/engine.Torque>9) System.out.println(model+" ("+(double)engine.Volume/1000+")  "+"  -----  "+"Atmosfer muherriki");
        else{
            if((engine.Torque/ engine.HorsePower)*10<18) System.out.println(model+" ("+(double)engine.Volume/1000+")  "+"  -----  "+"Turbo benzin muherriki");
            else System.out.println(model+" ("+(double)engine.Volume/1000+")  "+"  -----  "+"Turbodizel muherriki");
        }
    }
}
