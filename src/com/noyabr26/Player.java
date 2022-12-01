package com.noyabr26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Player {
    String name;
    LocalDate birthday;

    Player(String name, LocalDate birthday){
        this.name=name;
        this.birthday=birthday;
//        birthday=birthday.format(DateTimeFormatter.ofPattern("dd MM yyyy"));
    }


    Player(String name, String birthday){
        this.name=name;
        this.birthday=LocalDate.parse(birthday,DateTimeFormatter.ofPattern("dd MM yyyy"));    // string=>date
    }

//    LocalDate  ofLocal (int year, int month, int day){
//
//        return LocalDate.of(year,month,day);
//     }

//    public static void main(String[] args) {
//        new Player("",LocalDate.now()).ofLocal(int year, int month, int day)
//    }

}
