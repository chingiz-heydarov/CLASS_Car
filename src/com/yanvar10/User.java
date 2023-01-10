package com.yanvar10;

import java.time.LocalDate;

public class User {
    String name;
    String surname;
    int age;
    Double pa;
    Currency cur;
    User(String name, String surname, int age, Double pa, Currency cur){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.pa=pa;
        this.cur=cur;
    }
}

enum Currency{
   AZN,USD,EUR
}
