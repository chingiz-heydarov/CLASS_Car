package com.ders17;

abstract class Fiqure {
    public abstract double area();
}

abstract class Triangle extends Fiqure{
    int a;
    int b;
    int c;
  //  Triangle(){};

}

class Duzbucaq extends Triangle{
    Duzbucaq(int a, int b, int c){
        if(a*a+b*b==c*c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public double area() {
        return a*b/2;
    }
}


class BerTeref extends Triangle{
    BerTeref(int a){
            this.a = a;
    }

    @Override
    public double area() {
        return a/4*a*Math.pow(3,1/2);
    }
}

class BerYan extends Triangle{
    BerYan(int a, int b){

            this.a = a;
            this.b = b;
    }

    @Override
    public double area() {
        double p=a+b/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-a));
    }
}


