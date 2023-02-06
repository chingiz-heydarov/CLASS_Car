package com.threads;


public class Thred extends Thread{

        public void run(int a){

            while(a<10){
                a++;
                System.out.println(a);
            }
        }
    }

    class Fred implements Runnable{
    int f;
        public void run(){
            while(f>2)f--;
            System.out.println(f);
        }
    }

    class Main{
        public static void main(String[] args) {
            int x=1;
            Fred frun=new Fred();
            Thred tex=new Thred();

            frun.run();
            tex.run(x);
            System.out.println(x);
        }
    }

