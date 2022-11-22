package com.noyabr21;

import java.util.prefs.BackingStoreException;

public class ChipTuning {
    public static void main(String args[]) {

        Brand Audi = new Brand("Audi", new Chassis());
        Brand VAG = new Brand("Skoda", new Chassis());
        Brand Bmw = new Brand("BMW", new Chassis());

        Awd Quattro = new Awd("Torsen", true);
        Awd awd = new Awd("Haldex", false);
        Awd xdrive = new Awd("Rwd", true);

        Engine CJSA = new Engine(180, 250, 1800);
        Engine CREC = new Engine(330, 440, 3000);
        Engine N20b20 = new Engine(245, 350, 2000);
        Engine B58B30 = new Engine(326, 500, 3000);

        Gearbox ZF8HP45 = new Gearbox(8, "ZF", "Hydro");
        Gearbox Getrag = new Gearbox(6, "Getrag", "DRY");
        Gearbox DQ381 = new Gearbox(7, "BorgWarner", "DCT");
        Gearbox DL501 = new Gearbox(7, "BorgWarner", "DCT");

        Specs B_series = new Specs(11);
        Specs N_series = new Specs(10);
        Specs EA888= new Specs(9);
        Specs EA837= new Specs(11);

        Model Audi_A7 = new Model(Audi.brandName, "A7", CREC, DL501, Quattro, EA837);
        Model f30 = new Model(Bmw.brandName, "328i", N20b20, ZF8HP45, xdrive, N_series);
        Model Octavia = new Model(VAG.brandName, "Octavia_A7", CJSA, DQ381, awd, EA888);
        Model f20 = new Model(Bmw.brandName, "140i", B58B30, Getrag, xdrive, B_series);

        Car[] novbe = new Car[4];
        novbe[0] = Audi_A7;
        novbe[1] = f30;
        novbe[2] = Octavia;
        novbe[3] = f20;

        for (Car z : novbe) {
            z.Remap();
            z.WheelPower();
        }

    }
}
