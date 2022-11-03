package com.noyabr3;

public class Object1 {
    public static void main(String[] args) {

        String[] vehicle = {"vw passat", "seat leon", "vw jetta", "vw golf", "skoda octavia"};
        int[] power = {220, 180, 170, 235, 185};
        car[] massiv = new car[power.length];

   /*   massiv[0] = new car("vw passat", 220);
        massiv[1] = new car("seat leon", 180);
        massiv[2] = new car("vw jetta", 170);
        massiv[3] = new car("vw golf", 235);
        massiv[4] = new car("skoda octaiva", 185);  */


        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = new car();
            massiv[i].model = vehicle[i];
            massiv[i].hp = power[i];
        }

        int count;

        do {
            count = 0;
            for (int i = 0; i < massiv.length-1; i++) {
                if (massiv[i].hp > massiv[i + 1].hp) {
                    car b = massiv[i];
                    massiv[i] = massiv[i + 1];
                    massiv[i + 1] = b;
                    count++;
                }
            }
        } while (count != 0);

        for (int i = 0; i < 5; i++) {
            System.out.println(massiv[i].model + " " + massiv[i].hp);
        }
    }
}


class car {
    String model;
    int hp;


 /*   public car(String x, int y) {
        this.model = x;
        this.hp = y;
    }



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