package com.dekabr29ders;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        User a = new User("Ar", "Arov", LocalDate.of(1980, 9, 8), LocalDate.of(2011, 11, 2));
        User b = new User("Br", "Brov", LocalDate.of(1982, 12, 1), LocalDate.of(2023, 3, 20));
        User c = new User("Co", "Coev", LocalDate.of(1990, 11, 7), LocalDate.of(2017, 8, 20));
        User d = new User("De", "Deaev", LocalDate.of(1997, 9, 4), LocalDate.of(2029, 10, 29));
        User e = new User("Ej", "Ekov", LocalDate.of(1994, 3, 19), LocalDate.of(2022, 12, 2));

        ArrayList<User> vv = new ArrayList<>();
        vv.add(a);
        vv.add(b);
        vv.add(c);
        vv.add(d);
        vv.add(e);

        LocalDate today = LocalDate.now();
//
//        Consumer<User> consumer = x -> {
//            if (today.isBefore(x.expdate)) {
//                System.out.println(x.name+"\t"+ x.surname);
//            }
//        };
//
        Consumer<User> consumer = new Consumer<User>() {
            @Override
            public void accept(User user) {
                if (today.isBefore(user.expdate)) {
                System.out.println(user.name+"\t"+ user.surname);
            }

        }};
        vv.forEach(consumer);





    /*    Test test = (User) -> System.out.println(User.name+"\t"+ User.surname);

        for (User z : vv) {
            if (today.isBefore(z.expdate)) {
                test.expire(z);
            }
        }  */
    }
}

//@FunctionalInterface
//public interface Consumer<T> {
//    void accept(T t);
//}
interface Test{
    void expire(User u);
}