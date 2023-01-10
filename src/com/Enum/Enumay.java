/*package com.Enum;

import java.util.Scanner;

public class Enumay {
    public static void main(String[] args) {
        while (true) {

            int ay;

            while (true) {
                System.out.println("Ayin nomresini daxil edin: ");
                Scanner scn = new Scanner(System.in);
                ay = scn.nextInt();
                if (ay > 0 && ay < 13) break;
                else System.out.println("Bu nomreli ay movcud deyil.");
            }


            System.out.println(" EN/AZ/RU/TR formatinda dili secib daxil edin: ");
            Scanner sc = new Scanner(System.in);
            Language dil = Language.valueOf(sc.nextLine());

            Month[] mm = Month.values();

            for (Month z : mm) {
                if (z.number == ay) {
                    switch (dil) {
                        case EN -> System.out.println(z);
                        case AZ -> System.out.println(z.az);
                        case RU -> System.out.println(z.ru);
                        case TR -> System.out.println(z.tr);
                    }
                    System.out.println("---------------------------------------------------------");
                }
            }
        }

    }
}

enum Language {
    AZ, EN, TR, RU;
}

enum Month {
    JANUARY(1, "Yanvar", "Январь", "Ocak"), FEBRUARY(2, "Fevral", "Февраль", "Subat"),
    MARCH(3, "Mart", "Март", "Mart"),
    APRIL(4, "Aprel", "Апрель", "Nisan"),
    MAY(5, "May", "Май", "Mayis"),
    JUNE(6, "Iyun", "Июнь", "Haziran"),
    JULY(7, "Iyul", "Июль", "Temmuz"),
    AUGUST(8, "Avqust", "Август", "Agustos"),
    SEPTEMBER(9, "Sentyabr", "Сентябрь", "Eylul"),
    OCTOBER(10, "Oktyabr", "Октябрь", "Ekim"),
    NOVEMBER(11, "Noyabr", "Ноябрь", "Kasim"),
    DECEMBER(12, "Dekabr", "Декабрь", "Aralik");

    final int number;
    final String az;
    final String ru;
    final String tr;


    Month(int number, String az, String ru, String tr) {
        this.number = number;
        this.az = az;
        this.ru = ru;
        this.tr = tr;
    }

}
*/