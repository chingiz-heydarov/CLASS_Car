package Barter;

import com.yanvar5ders.B;

public class Main {
    public static void main(String[] args) {
        Elan no1 = new Elan(new Brand(Volkswagen_Models.GOLF_GTI),  2015, 2.0,
                Body.XETCHBEK, false, 27000, 152000, true, FuelType.GASOLINE,
                new Barter(new Brand(BmwM.e91), Body.UNIVERSAL, 3.0, false, FuelType.DIESEL),
                new Barter(new Brand(InfinitiM.FX50), Body.SUV, 5.0, true, FuelType.GASOLINE));

        Elan no2 = new Elan(new Brand(Audi_Models.A6),  2016, 3.0, Body.FASTBEK, true,
                57000, 137500, true, FuelType.GASOLINE,
                new Barter(new Brand(Audi_Models.ALLROAD_A6), Body.UNIVERSAL, 3.0, false, FuelType.DIESEL),
                new Barter(new Brand(Audi_Models.S8), Body.SEDAN, 4.0, true, FuelType.GASOLINE));

        Elan no3 = new Elan(new Brand(Toyota_Models.MAJESTA),  1998, 4.0, Body.SEDAN, true,
                30000, 493523, true, FuelType.GASOLINE,
                new Barter(new Brand(InfinitiM.M56), Body.SEDAN, 5.6, true, FuelType.GASOLINE),
                new Barter(new Brand(InfinitiM.G37), Body.SEDAN, 3.7, true, FuelType.GASOLINE),
                new Barter(new Brand(InfinitiM.EX37), Body.SUV, 3.7, true, FuelType.GASOLINE));

        Elan no4 = new Elan(new Brand(VolvoM.XC70),  2014, 3.0, Body.UNIVERSAL,
                true, 35000, 190000, true, FuelType.GASOLINE,
                new Barter(new Brand(Volkswagen_Models.PASSAT), Body.UNIVERSAL, 2.0, true, FuelType.DIESEL));

        Elan no5 = new Elan(new Brand(VolvoM.S80),  2010, 4.4, Body.SEDAN,
                true, 22000, 280000, true, FuelType.GASOLINE,
                new Barter(new Brand(VolvoM.V90), Body.UNIVERSAL, 2.0, true, FuelType.HYBRID));

        Elan no6 =new Elan(new Brand(BmwM.e53), 2005, 4.8, Body.SUV, true,
                23500, 313000,true, FuelType.GASOLINE,
                new Barter(new Brand(Toyota_Models.HIGHLANDER), Body.SUV, 3.5, true,FuelType.HYBRID),
                new Barter(new Brand(Toyota_Models.LAND_CRUISER), Body.SUV, 4.5, true, FuelType.DIESEL));


        Brand volvo = new Brand(VolvoM.XC70);
        System.out.println(volvo.marka);
        System.out.println(no5.brand);
        System.out.println(no2.variant1.fuelType);
    }
}
