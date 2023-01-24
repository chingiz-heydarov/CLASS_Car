package com.Thredders;

import java.time.LocalDate;

public class Card {
    String holderName;
    String cardNumber;
    int balance;
    LocalDate expDate;

    Card(String holderName, String cardNumber, int balance, LocalDate expDate) {
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.holderName = holderName;
    }
}
