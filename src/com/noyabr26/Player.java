package com.noyabr26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Player {
    String name;
    LocalDate birthday;

    Player(String name, LocalDate birthday){
        this.name=name;
        this.birthday=LocalDate.of(int year, int month, int day);
        birthday=birthday.format(DateTimeFormatter.ofPattern("dd MM yyyy"));
    }
}
