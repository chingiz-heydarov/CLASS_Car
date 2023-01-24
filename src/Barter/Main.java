package Barter;

public class Main {
    public static void main(String[] args) {
 Elan no1=new Elan(new Volkswagen(Volkswagen.brandName, Volkswagen_Models.GOLF_GTI), 1,2015,2.0,Body.XETCHBEK,false,27000, 152000, true);
Elan no2=new Elan(new Audi(Audi.brandName, Audi_Models.A6), 2, 2016, 3.0, Body.FASTBEK, true, 57000, 137500, true);

 //Elan elan1=new Elan(new Volkswagen(Brand.,Volkswagen_Models.GOLF_GTI),1,2015,2.0,Body.XETCHBEK,false,27000, 152000, true);
System.out.println(no2.brand);
System.out.println();
    }
}
