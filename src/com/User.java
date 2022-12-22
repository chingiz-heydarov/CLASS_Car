package com;

import java.time.LocalDate;

public class User {
    int id;
    String name;
    String surname;
    LocalDate bday;
    User(int id, String name, String surname, LocalDate bday){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.bday=bday;
    }
}
