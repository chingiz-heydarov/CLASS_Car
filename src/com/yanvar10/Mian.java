package com.yanvar10;


import java.time.LocalDate;
import java.util.ArrayList;

public class Mian {
    public static void main(String[] args) {
        User a = new User("Ar", "Arov", 34, 50.0, Currency.EUR);
        User b = new User("Br", "Brov", 15, 10.60, Currency.USD);
        User c = new User("Co", "Coev", 55, 18.44, Currency.AZN);
        User d = new User("De", "Deaev", 45, 22.40, Currency.AZN);
        User e = new User("Ej", "Ekov", 19, 4.9, Currency.EUR);

        ArrayList<User> users=new ArrayList<>();

        users.add(a);
        users.add(b);
        users.add(c);
        users.add(d);
        users.add(e);

        ArrayList<User> sort=new ArrayList<>();

        users.stream().filter(age->age.age>17).filter(cash->cash.pa>=20).forEach(sort::add);

        for (User z: sort) {
            new Card(z.name+z.surname, LocalDate.now().plusYears(3));
            System.out.println(new Card(z.name+" "+z.surname, LocalDate.now().plusYears(3)).holder);
            System.out.println(new Card(z.name+" "+z.surname, LocalDate.now().plusYears(3)).expdate);
        }
    }
}
