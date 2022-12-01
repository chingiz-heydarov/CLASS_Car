package com.dekabr1;

public class Kassa {
    public static void main(String[] args) {

        Engine cdab= new Engine(4, 1, true, false, true);
        Engine n47d20= new Engine(4, 1, true, false, false);
        Engine m272=new Engine(6, 2, true, true, true);
        Engine m271=new Engine(4, 1, true,true,false);
        Engine n54b30=new Engine(6, 1, false, false, true);
        Engine n63b44=new Engine(8, 2, false, false, true);
        Engine ea837= new Engine(6, 2, false, false, true);

        Gearbox jf011e = new Gearbox(false, false, true, false);
        Gearbox multitronic= new Gearbox(true, false, true, false);
        Gearbox gm6t30= new Gearbox(true, true, true, false);
        Gearbox g7tronic=new Gearbox(true, false, false, false);
        Gearbox tf80sc= new Gearbox(true, false, false, false);
        Gearbox OAM= new Gearbox(true, false, true, true);
        Gearbox DCT6= new Gearbox(true, false, false, true);
        Gearbox DQ250= new Gearbox(false, false, false, true);
        Gearbox DP0= new Gearbox(true, true, false, false);

        Awd parttime= new Awd(false, true, false);
        Awd xdrive= new Awd(true, false, true);
        Awd matic4 = new Awd(true, true, false);
        Awd haldex = new Awd(true, false, false);
        Awd TerrainResponse = new Awd(false, true, false);

        Remont<Engine> ea888 = new Remont<>(cdab);
        Remont<Engine> e90= new Remont<>(n47d20);
        Remont<Engine> w212= new Remont<>(m272);
        Remont<Engine> w204= new Remont<>(m271);
        Remont<Engine> e60= new Remont<>(n54b30);
        Remont<Engine> f10= new Remont<>(n63b44);
        Remont<Engine> audi= new Remont<>(ea837);

        Remont<Gearbox> nissan= new Remont<>(jf011e);
        Remont<Gearbox> nonquattro= new Remont<>(multitronic);
        Remont<Gearbox> gm= new Remont<>(gm6t30);
        Remont<Gearbox> w203= new Remont<>(g7tronic);
        Remont<Gearbox> aisin= new Remont<>(tf80sc);
        Remont<Gearbox> dq200= new Remont<>(OAM);
        Remont<Gearbox> getrag= new Remont<>(DCT6);
        Remont<Gearbox> vag= new Remont<>(DQ250);
        Remont<Gearbox> PSR= new Remont<>(DP0);

        Remont<Awd> mitsu = new Remont<>(parttime);
        Remont<Awd> bmw = new Remont<>(xdrive);
        Remont<Awd> volvo = new Remont<>(haldex);
        Remont<Awd> mercedes = new Remont<>(matic4);
        Remont<Awd> landrover = new Remont<>(TerrainResponse);


        System.out.println(nissan.cashOfService());
        System.out.println(mitsu.cashOfService());
        System.out.println(e90.cashOfService());
        System.out.println();
        System.out.println();
        System.out.println();

        }

    }

