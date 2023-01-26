package com.yanvar24ders;

public class Count {
    int x;
    int metod () throws InterruptedException {
        for (int i = 0;; i++){
            x++;
            if(x==5) wait();
            notify();
        }

    }


}
