package com.dekabr22ders;

import java.time.LocalDate;

public class Card {
    String hname;
    String number;
    LocalDate exp;
    int cvv;
    double balans;

    int id;
    Card(String hname, String number, LocalDate exp, int cvv, double balans, int id){

        this.hname=hname;
        this.number=number;
        this.exp=exp;
        this.cvv=cvv;
        this.balans=balans;
        this.id=id;
    }
}
