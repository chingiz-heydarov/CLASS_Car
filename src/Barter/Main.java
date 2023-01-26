package Barter;

import com.yanvar5ders.B;

public class Main {
    public static void main(String[] args) {
  /*      Elan no1 = new Elan(new Volkswagen(Volkswagen_Models.GOLF_GTI), 1, 2015, 2.0,
                Body.XETCHBEK, false, 27000, 152000, true,  FuelType.GASOLINE,
                new Barter(new BMW(BmwM.e91), Body.UNIVERSAL, 3.0, false, FuelType.DIESEL),
                new Barter(new Infiniti(InfinitiM.FX50), Body.SUV, 5.0, true, FuelType.GASOLINE));

        Elan no2 = new Elan(new Audi(Audi_Models.A6), 2, 2016, 3.0, Body.FASTBEK, true,
                57000, 137500, true,  FuelType.GASOLINE,
                new Barter(new Audi(Audi_Models.ALLROAD_A6), Body.UNIVERSAL, 3.0, false, FuelType.DIESEL),
                new Barter(new Audi(Audi_Models.S8), Body.SEDAN, 4.0, true, FuelType.GASOLINE));

        Elan no3 = new Elan(new Toyota(Toyota_Models.MAJESTA), 3, 1998, 4.0, Body.SEDAN, true,
                30000, 493523, true,  FuelType.GASOLINE,
                new Barter(new Infiniti(InfinitiM.M56), Body.SEDAN, 5.6, true, FuelType.GASOLINE),
                new Barter(new Infiniti(InfinitiM.G37), Body.SEDAN, 3.7, true, FuelType.GASOLINE),
                new Barter(new Infiniti(InfinitiM.EX37), Body.SUV, 3.7, true, FuelType.GASOLINE));

        Elan no4=new Elan(new Brand(VolvoM.XC70), 4, 2014, 3.0, Body.UNIVERSAL,
                true, 35000, 190000, true, FuelType.GASOLINE,
        new Barter(new Volkswagen(Volkswagen_Models.PASSAT), Body.UNIVERSAL, 2.0, true, FuelType.DIESEL));*/

        Elan no5= new Elan(new Brand(VolvoM.S80), 5, 2010, 4.4, Body.SEDAN,
                true, 22000, 280000, true, FuelType.GASOLINE,
                new Barter(new Brand(VolvoM.V90), Body.UNIVERSAL, 2.0, true, FuelType.HYBRID));

Brand volvo=new Brand(VolvoM.XC70);
        System.out.println(volvo.marka);
       System.out.println(no5.brand);
      //  System.out.println(no2.variant1.fuelType);
    }
}
