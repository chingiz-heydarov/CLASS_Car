package com.noyabr17;

public class EngineTypeDetector {
    public static void main(String[] args) {
        VAG Golf = new VAG("Volkswagen", "Golf_mk7_GTI", new Engine(220, 350, 2000), new Gearbox(7, false));
        VAG Octavia = new VAG("Skoda", "Octavia_A7", new Engine(180, 250, 1800), new Gearbox(7, false));
        VAG Passat = new VAG("Volkswagen", "Passat_b8", new Engine(240, 500, 2000), new Gearbox(7, false));
        Audi RS6 = new Audi("RS6_C7", true, new Engine(560, 700, 4000), new Gearbox(8, true));
        Audi RS4 = new Audi("RS4_b8", true, new Engine(450, 420, 4200), new Gearbox(6, true));
        Audi RS3 = new Audi("RS3_8V", false, new Engine(400, 480, 2500), new Gearbox(7, false));
        Audi Allroad = new Audi("Allroad_55TDI", true, new Engine(344, 700, 3000), new Gearbox(8, true));
        Audi Q7 = new Audi("Q7", true, new Engine(500, 1000, 6000), new Gearbox(6, true));
        Bmw e91 = new Bmw("335d", 'e', new Engine(286, 580, 3000), new Gearbox(6, true));
        Bmw f20 = new Bmw("125d", 'f', new Engine(225, 450, 2000), new Gearbox(8, true));
        Bmw e87= new Bmw("130i", 'e', new Engine(252, 300, 3000), new Gearbox(6, true));
        Golf.detector();
        Octavia.detector();
        Passat.detector();
        RS6.detector();
        RS4.detector();
        RS3.detector();
        Allroad.detector();
        Q7.detector();
        e91.detector();
        f20.detector();
        e87.detector();
    }
}