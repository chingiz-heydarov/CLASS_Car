package com.noyabr14;

public class Polymorphyzm {
    public static void main (String args[]){

        kvadrat a5=new kvadrat(5.0);
        kvadrat a7=new kvadrat(7);
        kruq r1=new kruq(1);
        kruq r3=new kruq(3);
        kruq r10=new kruq(10);
        romb d1=new romb(3,4);
        romb d2=new romb(5,7);

figure[] f={r1, d2, a7, r3, d1, r10, a5};

 for(int i=0; i<f.length; i++)f[i].formula();

    }
}

abstract class figure implements area{
double s;
    public abstract void formula();
}

class kvadrat extends figure {
    double a;
     kvadrat(double x){
         this.a=x;
     }
     public void formula(){
         System.out.println(a*a);
    }
}

class kruq extends figure{
    int r;
    kruq(int x){
       this.r=x;
    }
    public void formula(){

         System.out.println(Math.PI*r*r);
    }
}


class romb extends figure{
    int d1;
    int d2;
    romb (int x, int y){
        this.d1=x;
        this.d2=y;
    }
    public void formula(){
        System.out.println(d1*d2/2);
    }
}

interface area{
    void formula();
}