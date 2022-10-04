
package com.task;

import java.util.Scanner;

public class Task1October2 {

    public static void main(String[] args) {
        while (true) {
            System.out.println("---------Enter the value: ");
            Scanner console = new Scanner(System.in);
            int num = console.nextInt();
            int a = num, b = 0;

            //ededin reqemlerinin sayini tapmaq
            while (num > 10) {
                num = num / 10;
                b++;
            }

            int x = 0, z, m, ten_b, ten_x_p, ten_x;


            while (x - b <= 0) {

                ten_x_p = (int) Math.pow(10, (x + 1));

                ten_x = (int) Math.pow(10, x);

                ten_b = (int) Math.pow(10, b);


                m = (a % ten_x_p) / ten_x;

                z = a / ten_b;

                a = a % ten_b;

                b--;
                x++;

                if (x - b >= 1 && z == m) System.out.println("Polindrom");

                if (z != m) {
                    System.out.println("Polindrom deyil");
                    break;
                }
            }
        }
    }
}
