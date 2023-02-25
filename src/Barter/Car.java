package Barter;

public class Car {
    String brend,model,kuzov,fuel;
    int year,hp,probeq;
    boolean korobka,awd,klassik;
    double motor;

    Bartor variant1;

    Bartor variant2;

    Bartor variant3;

    Car(){};

//    Car(String brend,String model,String kuzov,String fuel,int year,int hp,int probeq,boolean korobka,boolean awd,boolean klassik,double motor){
//        this.brend=brend;
//        this.model=model;
//        this.kuzov=kuzov;
//        this.fuel=fuel;
//        this.year=year;
//        this.hp=hp;
//        this.probeq=probeq;
//        this.korobka=korobka;
//        this.awd=awd;
//        this.klassik=klassik;
//        this.motor=motor;
//    }

    Car(String brend,String model,String kuzov,String fuel,int year,int hp,int probeq,boolean korobka,boolean awd,boolean klassik,double motor,
        Bartor variant1){
        this.brend=brend;
        this.model=model;
        this.kuzov=kuzov;
        this.fuel=fuel;
        this.year=year;
        this.hp=hp;
        this.probeq=probeq;
        this.korobka=korobka;
        this.awd=awd;
        this.klassik=klassik;
        this.motor=motor;
        this.variant1=variant1;
    }

    Car(String brend,String model,String kuzov,String fuel,int year,int hp,int probeq,boolean korobka,boolean awd,boolean klassik,double motor,
        Bartor variant1, Bartor variant2){
        this.brend=brend;
        this.model=model;
        this.kuzov=kuzov;
        this.fuel=fuel;
        this.year=year;
        this.hp=hp;
        this.probeq=probeq;
        this.korobka=korobka;
        this.awd=awd;
        this.klassik=klassik;
        this.motor=motor;
        this.variant1=variant1;
        this.variant2=variant2;
    }

    Car(String brend,String model,String kuzov,String fuel,int year,int hp,int probeq,boolean korobka,boolean awd,boolean klassik,double motor,
        Bartor variant1,Bartor variant2,Bartor variant3){
        this.brend=brend;
        this.model=model;
        this.kuzov=kuzov;
        this.fuel=fuel;
        this.year=year;
        this.hp=hp;
        this.probeq=probeq;
        this.korobka=korobka;
        this.awd=awd;
        this.klassik=klassik;
        this.motor=motor;
        this.variant1=variant1;
        this.variant2=variant2;
        this.variant3=variant3;
    }
}


