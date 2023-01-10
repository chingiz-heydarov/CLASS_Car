package com.yanvar10;

import java.time.LocalDate;

public class Card {
    String holder;


    LocalDate expdate;
    Card(String holder,  LocalDate expdate){
        this.holder=holder;


        this.expdate=expdate;
    }
}

