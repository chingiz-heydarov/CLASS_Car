package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Maint {
    public static void main(String[] args) {
        User u1 = new User(100, "Araz", "Arazov", LocalDate.of(1972, 6, 23));
        User u2 = new User(200, "Ad", "Adov", LocalDate.of(1932, 5, 23));
        User u3 = new User(300, "Tar", "Tarov", LocalDate.of(1950, 4, 2));
        User u4 = new User(400, "Su", "Duzlu", LocalDate.of(1944, 8, 3));
        User u5 = new User(500, "Ar", "Arli", LocalDate.of(1982, 10, 29));

        Card c1 = new Card("Araz Arazov", "1111 1111 1111 1111", LocalDate.of(2023, 6, 23), 111, 5000.0, 100);
        Card c2 = new Card("Ad Adov", "2222 2222 2222 2222", LocalDate.of(2025, 6, 15), 222, 56.0, 200);
        Card c3 = new Card("Tar Tarov", "3333 3333 3333 3333", LocalDate.of(2030, 3, 7), 333, 23434.4, 300);
        Card c4 = new Card("Su Duzlu", "4444 4444 4444 4444", LocalDate.of(2015, 6, 23), 444, 0.99, 400);
        Card c5 = new Card("Ar Arli", "5555 5555 5555 5555", LocalDate.of(2022, 12, 23), 555, 8232.54, 500);

        ArrayList<User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(c1);
        cards.add(c2);
        cards.add(c3);
        cards.add(c4);
        cards.add(c5);

        System.out.println("User Id daxil edin: ");
        Scanner sc = new Scanner(System.in);
        int sid = sc.nextInt();

        User utemp = null;

        for (User u : users) {
            if (sid == u.id) {
                utemp = u;
            }
        }

        Card ctemp = null;

        for (Card c : cards) {
            if (c.id == utemp.id) {
                ctemp = c;
            }
        }

        System.out.println("Kart nomresini daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        String snum  = scanner.nextLine();

        Card ct=null;

        for(Card c :cards){
            if(c.number.equals(snum)) {
                ct = c;
            }
        }

        System.out.println("Mebleg daxil edin: ");
        Scanner scan = new Scanner(System.in);
        int sbala = sc.nextInt();

        ctemp.balans=ctemp.balans-sbala;
        ct.balans= ct.balans+sbala;

        System.out.println("Gonderen kartin nomresi "+ctemp.balans);
        System.out.println("Gonderilen kartin balansi "+ct.balans);
    }
}
