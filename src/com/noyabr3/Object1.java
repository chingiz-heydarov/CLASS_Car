package com.noyabr3;

public class Object1 {
    public static void main(String[] args) {

        car[] massiv = new car[5];

        massiv[0] = new car("vw passat", 220);
        massiv[1] = new car("seat leon", 180);
        massiv[2] = new car("vw jetta", 170);
        massiv[3] = new car("vw golf", 235);
        massiv[4] = new car("skoda octaiva", 185);

    /*
            car passat = new car();
            passat.model = "alltrack_b8";
            passat.hp = 220;

            car seat = new car();
            seat.model = "leon";
            seat.hp = 180;

            car jetta = new car();
            jetta.model = "GLI";
            jetta.hp = 211;

            car golf = new car();
            golf.model = "R_mk7";
            golf.hp = 310;

            car skoda = new car();
            skoda.model = "octavia";
            skoda.hp = 185;   */

        int count;

        do {
            count = 0;
            for (int i = 0; i < 4; i++) {
                if (massiv[i].hp > massiv[i + 1].hp) {
                    car b = massiv[i];
                    massiv[i] = massiv[i + 1];
                    massiv[i + 1] = b;
                    count++;
                }
            }
        } while (count != 0);

        for (int i = 0; i < 5; i++) {
            System.out.println(massiv[i].model+" "+massiv[i].hp);

        }

    }

    }


class car {
    String model;
    int hp;


    public car(String x, int y) {
        this.model = x;
        this.hp = y;
    }


  /*
  static int count;

   static int i=0;
    car(){
    count++;
       }

       car(){
           massiv[i]=new car();
        i++;
       }                            */

}