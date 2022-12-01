package com.dekabr1;


public class Remont<T> {
    T xarab;
    int cash = 0;

    Remont(T xarab) {
        this.xarab = xarab;
    }

    public Integer cashOfService() {

        if (xarab.getClass().equals(Engine.class)) {
            Engine engine = (Engine) xarab;
            if (engine.chain)
                cash += 500;
            if (engine.fazaregulyator) cash += 700;                    //engine
            if (engine.pistons) cash += 800 * engine.silindr;
            cash *= cash * engine.head;

        }
        if (xarab.getClass().equals(Gearbox.class)) {
            Gearbox gearbox = (Gearbox) xarab;

            if (gearbox.hydroblok) cash += 1000;
            if (gearbox.hydrotransformator) cash += 500;                 //gearbox
            if (gearbox.mechanics) cash += 2500;
            if (gearbox.clutch) cash += 1500;

        }
        if (xarab.getClass().equals(Awd.class)) {
            Awd awd = (Awd) xarab;
            if (awd.mufta) cash += 400;
            if (awd.razdatka) cash += 600;                           // awd
            if (awd.shrus) cash += 1000;
        }

        return cash;
    }
}


