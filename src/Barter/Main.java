package Barter;

import com.yanvar5ders.B;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elan no1 = new Elan(new Brand(Volkswagen_Models.GOLF_GTI), 2015, 2.0,
                Body.XETCHBEK, false, 27000, 152000, true, FuelType.GASOLINE,
                new Barter(new Brand(Bmw_Models.e91), Body.UNIVERSAL, 3.0, false, FuelType.DIESEL),
                new Barter(new Brand(Infiniti_Models.FX50), Body.SUV, 5.0, true, FuelType.GASOLINE),
                new Barter(new Brand(Honda_Models.CIVIC), Body.XETCHBEK, 1.8, true, FuelType.GASOLINE));

        Elan no2 = new Elan(new Brand(Audi_Models.A6), 2016, 3.0, Body.FASTBEK, true,
                57000, 137500, true, FuelType.GASOLINE,
                new Barter(new Brand(Audi_Models.ALLROAD_A6), Body.UNIVERSAL, 3.0, false, FuelType.DIESEL),
                new Barter(new Brand(Audi_Models.S8), Body.SEDAN, 4.0, true, FuelType.GASOLINE));

        Elan no3 = new Elan(new Brand(Toyota_Models.MAJESTA), 1998, 4.0, Body.SEDAN, true,
                30000, 493523, true, FuelType.GASOLINE,
                new Barter(new Brand(Infiniti_Models.M56), Body.SEDAN, 5.6, true, FuelType.GASOLINE),
                new Barter(new Brand(Infiniti_Models.G37), Body.SEDAN, 3.7, true, FuelType.GASOLINE),
                new Barter(new Brand(Infiniti_Models.EX37), Body.SUV, 3.7, true, FuelType.GASOLINE));

        Elan no4 = new Elan(new Brand(Volvo_Models.XC70), 2014, 3.0, Body.UNIVERSAL,
                true, 35000, 190000, true, FuelType.GASOLINE,
                new Barter(new Brand(Volkswagen_Models.PASSAT), Body.UNIVERSAL, 2.0, true, FuelType.DIESEL));

        Elan no5 = new Elan(new Brand(Volvo_Models.S80), 2010, 4.4, Body.SEDAN,
                true, 22000, 280000, true, FuelType.GASOLINE,
                new Barter(new Brand(Volvo_Models.V90), Body.UNIVERSAL, 2.0, true, FuelType.HYBRID));

        Elan no7 = new Elan(new Brand(Bmw_Models.e53), 2005, 4.8, Body.SUV, true,
                23500, 313000, true, FuelType.GASOLINE,
                new Barter(new Brand(Toyota_Models.HIGHLANDER), Body.SUV, 3.5, true, FuelType.HYBRID),
                new Barter(new Brand(Toyota_Models.LAND_CRUISER), Body.SUV, 4.5, true, FuelType.DIESEL));

        Elan no6 = new Elan(new Brand(Honda_Models.CIVIC), 2014, 1.8, Body.XETCHBEK, false,
                21000, 180000, true, FuelType.GASOLINE,
                new Barter(new Brand(Volkswagen_Models.GOLF_GTI), Body.XETCHBEK, 2.0, true, FuelType.GASOLINE));



        List<Elan> elans = List.of(no1, no2, no3, no4, no5, no6, no7);


        List<Barter> yoursBarter = new ArrayList<>();

        if (no6.variant1 != null) yoursBarter.add(no6.variant1);
        if (no6.variant2 != null) yoursBarter.add(no6.variant2);
        if (no6.variant3 != null) yoursBarter.add(no6.variant3);



        for (Barter own_barter : yoursBarter) {
            for (Elan x_elan : elans) {
                if (own_barter.barter_brand.model == x_elan.brand.model && own_barter.kuzov == x_elan.kuzov &&
                        own_barter.engine_size == x_elan.engine_size && own_barter.fuelType == x_elan.fuelType && own_barter.auto_gearbox == x_elan.auto_gearbox) {
                    ArrayList<Barter> uygun_elan_barterlari = new ArrayList<>();
                    if (x_elan.variant1 != null) uygun_elan_barterlari.add(x_elan.variant1);
                    if (x_elan.variant2 != null) uygun_elan_barterlari.add(x_elan.variant2);
                    if (x_elan.variant3 != null) uygun_elan_barterlari.add(x_elan.variant3);
                    for (Barter x_barter : uygun_elan_barterlari) {
                        if (no6.brand.model == x_barter.barter_brand.model && no6.kuzov == x_barter.kuzov && no6.engine_size == x_barter.engine_size &&
                                no6.fuelType == x_barter.fuelType && no6.auto_gearbox == x_barter.auto_gearbox) {
                            System.out.println(x_elan);
                        }
                    }
                }
            }
        }


    }
}

