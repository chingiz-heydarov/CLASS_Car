package com.noyabr29ders;

public class Task1 {
    public static void main(String[] args) {
        Car aa=new Car("aa");
        Car bb=new Car("bb");
        Car cc=new Car("cc");
        Car dd=new Car("dd");

        Box<Car> box1= new Box<>(aa);
        Box<Car> box2= new Box<>(bb);
        Box<Car> box3= new Box<>(cc);
        Box<Car> box4= new Box<>(dd);

        Box[] f= {box1,box2,box3,box4};

        for( Box ff : f){
            System.out.println(ff.toString());
        }
    }
}
