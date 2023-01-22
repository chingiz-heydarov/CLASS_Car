package com.Thredders;

import com.Thred;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = List.of(new Card("Aga", "9000", 500, LocalDate.of(2023, 8, 19)),
                new Card("Bar", "8008", 91, LocalDate.of(2025, 1, 2)),
                new Card("Gto", "3333", 90111, LocalDate.of(2024, 9, 5)),
                new Card("Or", "5555", 43, LocalDate.of(2024, 9, 9)));

        HashMap<String, Integer> maas = new HashMap<>();

        maas.put("9000", 2200);
        maas.put("8008", 670);
        maas.put("3333", 4500);
        maas.put("5555", 800);

        Thread m1 = new Thread(
                () -> {
                    for (Card z : cards) z.balance += maas.get(z.cardNumber);

                }
        );
        m1.start();

        Thread m2 = new Thread(
                () -> {
                    for (Card z : cards) System.out.println(z.balance);
                }
        );
        m2.start();

    }

}

