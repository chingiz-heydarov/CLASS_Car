package com.dekabr29ders;

import java.time.LocalDate;

public class User {
    String name;
    String surname;
    LocalDate birthday;
    LocalDate expdate;
    User(String name, String surname, LocalDate birthday, LocalDate expdate){
        this.name=name;
        this.surname=surname;
        this.birthday=birthday;
        this.expdate=expdate;
    }
}
