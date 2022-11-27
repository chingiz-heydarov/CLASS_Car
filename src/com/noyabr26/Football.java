package com.noyabr26;

import java.time.LocalDate;
import java.util.Date;

public class Football {
    public static void main(String[] args) {

        int age, playerYear, playerMonth, playerDay;

        Player Zidan = new Player("Zidan", LocalDate.of(1972, 6, 23));
        Player Maldini = new Player("Maldini", "26 06 1968");
        Player Rooney = new Player("Rooney", "24 10 1985");

        Player[] p = {Zidan, Maldini, Rooney};

        LocalDate today = LocalDate.now();

        int currentYear = today.getYear();
        int currentMonth = today.getMonthValue();
        int currentDay = today.getDayOfMonth();

        for (Player z : p) {
            playerYear = z.birthday.getYear();
            playerMonth = z.birthday.getMonthValue();
            playerDay = z.birthday.getDayOfMonth();

            if (playerMonth > currentMonth)
                age = currentYear - playerYear;

            else if (playerMonth == currentMonth) {
                if (currentDay > playerDay) age = currentYear - playerYear - 1;
                else age = currentYear - playerYear;
            } else age = currentYear - playerYear - 1;
            System.out.println(z.name + " oyuncunun " + age + " yasi var.");
        }

    }

}

