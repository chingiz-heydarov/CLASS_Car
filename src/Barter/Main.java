package Barter;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ParseException {


        System.out.println("---------- Brendi secin: ----------");

        Sql.selekt(null, null, null, null, null, null, null);


        Scanner scan_brend = new Scanner(System.in);
        String brend = scan_brend.next();


        System.out.println("--------- Modeli secin: ---------");

        Sql.selekt(brend, null, null, null, null, null, null);


        Scanner scan_model = new Scanner(System.in);
        String model = scan_model.next();

        System.out.println("--------- Istehsal ilini daxil edin: ---------");

        Scanner scan_year = new Scanner(System.in);
        int year = scan_year.nextInt();

        String year_string = "07-07-" + year;


        System.out.println("---------- Muherrikin hecmini secin: ----------");

        Sql.selekt(null, model, null, null, year_string, null, null);


        Scanner scan_engine = new Scanner(System.in);
        double motor = scan_engine.nextDouble();


        System.out.println("--------- Govdesini daxil edin: --------");

        Sql.selekt(null, model, null, motor, year_string, null, null);


        Scanner scan_body = new Scanner(System.in);
        String kuzov = scan_body.next();


        System.out.println("--------- Modelde movcud olan karobka tipleri: ---------");

        Sql.selekt(null, model, kuzov, motor, year_string, null, null);


        System.out.println("---------- Avtomobil suret qutusunu avtomatik yaxud mexaniki oldugunu qeyd edin." +
                " Avtomtik oldugu teqdirde 'a' herfini, mexaniki 'm' herfini daxil edin. ----------");


        Scanner scan_gearbox = new Scanner(System.in);
        String auto_string = scan_gearbox.next();

        char char_auto = auto_string.charAt(0);

        boolean korobka = false;

        switch (char_auto) {
            case 'a':
                korobka = true;
                break;
            case 'm':
                korobka = false;
                break;
        }

        System.out.println("---------- Modelin shassi variantlari: ---------");

        Sql.selekt(null, model, kuzov, motor, year_string, auto_string, null);


        System.out.println("Avtomobil dordceken sistemi ile techiz olunubsa, '4' daxil edin, eks halda '2' daxil edin.");

        Scanner scan_awd = new Scanner(System.in);

        String awd_string = "" + scan_awd.next();


        char awd_char = awd_string.charAt(0);

        boolean awd;

        switch (awd_char) {
            case '4':
                awd = true;
                break;
            case '2':
                awd = false;
                break;
            default: {
                awd = false;
                System.out.println("Sehv secim.");
            }
        }

        System.out.println("Avtomobilin yurusunu daxil edin:");

        Scanner scan_mileage = new Scanner(System.in);
        int probeq = scan_mileage.nextInt();


        Boolean klassik = (Boolean) Sql.little(model, null, null, null);


        int hp = (int) Sql.little(model, year_string, motor, "hp");

        String fuel = (String) Sql.little(model, year_string, motor, "fuel");

        Integer car_id=Sql.insert(brend, model, motor, kuzov, klassik, korobka, awd, probeq, fuel, hp, year,null);     //       INSERT CAR

        System.out.println("Barter etmek ile istediyiniz avtomobilin modelini daxil edin:");     // BARTER-1

        Sql.selekt(null, null, null, null, null, null, null);


        Scanner scan_brendb = new Scanner(System.in);
        String barter_brend = scan_brendb.next();


        System.out.println("--------- Modeli secin: ---------");

        Sql.selekt(barter_brend, null, null, null, null, null, null);


        Scanner scan_modelb = new Scanner(System.in);
        String barter_model = scan_modelb.next();

        System.out.println("--------- Istehsal ilini daxil edin: ---------");

        Scanner scan_yearb = new Scanner(System.in);
        int barter_year = scan_yearb.nextInt();

        String barter_year_string = "07-07-" + year;


        System.out.println("---------- Muherrikin hecmini secin: ----------");

        Sql.selekt(null, barter_model, null, null, barter_year_string, null, null);


        Scanner scan_engineb = new Scanner(System.in);
        double barter_motor = scan_engineb.nextDouble();


        System.out.println("--------- Govdesini daxil edin: --------");

        Sql.selekt(null, barter_model, null, barter_motor, barter_year_string, null, null);


        Scanner scan_bodyb = new Scanner(System.in);
        String barter_kuzov = scan_bodyb.next();


        System.out.println("--------- Modelde movcud olan karobka tipleri: ---------");

        Sql.selekt(null, barter_model, barter_kuzov, barter_motor, barter_year_string, null, null);


        System.out.println("---------- Avtomobil suret qutusunu avtomatik yaxud mexaniki oldugunu qeyd edin." +
                " Avtomtik oldugu teqdirde 'a' herfini, mexaniki 'm' herfini daxil edin. ----------");


        Scanner scan_gearboxb = new Scanner(System.in);
        String barter_auto_string = scan_gearboxb.next();

        char char_autob = barter_auto_string.charAt(0);

        boolean barter_korobka = false;

        switch (char_autob) {
            case 'a':
                barter_korobka = true;
                break;
            case 'm':
                barter_korobka = false;
                break;
        }

        System.out.println("---------- Modelin shassi variantlari: ---------");

        Sql.selekt(null, barter_model, barter_kuzov, barter_motor, barter_year_string, barter_auto_string, null);


        System.out.println("Avtomobil dordceken sistemi ile techiz olunubsa, '4' daxil edin, eks halda '2' daxil edin.");

        Scanner scan_awdb = new Scanner(System.in);

        String barter_awd_string = "" + scan_awdb.next();


        char barter_awd_char = barter_awd_string.charAt(0);

        boolean barter_awd;

        switch (barter_awd_char) {
            case '4':
                barter_awd = true;
                break;
            case '2':
                barter_awd = false;
                break;
            default: {
                barter_awd = false;
                System.out.println("Sehv secim.");
            }
        }

        System.out.println("Avtomobilin yurusunu daxil edin:");

        Scanner scan_mileageb = new Scanner(System.in);
        int barter_probeq = scan_mileageb.nextInt();


        Boolean barter_klassik = (Boolean) Sql.little(barter_model, null, null, null);


        int barter_hp = (int) Sql.little(barter_model, barter_year_string, barter_motor, "hp");

        String barter_fuel = (String) Sql.little(barter_model, barter_year_string, barter_motor, "fuel");

        Sql.insert(barter_brend, barter_model, barter_motor, barter_kuzov, barter_klassik, barter_korobka, barter_awd,
                barter_probeq, barter_fuel, barter_hp, barter_year,car_id);


        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        Body current_body = null;

        outer:
        while (true) {
            System.out.println("Govdesini daxil edin: ");


            List<Body> bodyList = Arrays.asList(Body.values());

            for (Body kuzovd : bodyList) {
                current_body = kuzovd;
                if (kuzov.equals(kuzov.toString())) break outer;
            }
        }

        System.out.println("Avtomobil dordceken sistemi ile techiz olunubsa, '+' daxil edin, eks halda '-' daxil edin.");


        System.out.println("Avtomobilin qiymetini daxil edin:");

        Scanner scan_price = new Scanner(System.in);
        int current_price = scan_price.nextInt();


        System.out.println("Avtomobil suret qutusunu avtomatik yaxud mexaniki oldugunu qeyd edin." +
                " Avtomtik oldugu teqdirde 'a' herfini, mexaniki 'm' herfini daxil edin.");


        FuelType current_fuel = null;

        outer:
        while (true) {
            System.out.println("Yanacaq novunu daxil edin: ");

            Scanner scan_fuel = new Scanner(System.in);
            String curr_fuel = scan_fuel.next().toUpperCase();

            List<FuelType> fuelList = Arrays.asList(FuelType.values());


            for (FuelType ffuel : fuelList) {
                current_fuel = ffuel;
                if (curr_fuel.equals(fuel.toString())) break outer;
            }
        }

        System.out.println("Barter etmek ile istediyiniz avtomobilin modelini daxil edin:");

        Scanner scan_barter1_model = new Scanner(System.in);
        String current_barter1_model = scan_barter1_model.next().toUpperCase();

        Brand current_barter_brand = brand_detector(current_barter1_model);

        System.out.println(current_barter_brand.marka + " " + current_barter_brand.model);

        Body current_barter_body = null;

        outer:
        while (true) {
            System.out.println("Modelin govdesini daxil edin:");

            Scanner scan_barter_body = new Scanner(System.in);
            String cur_barter_body = scan_barter_body.next().toUpperCase();

            List<Body> bodyList = Arrays.asList(Body.values());

            for (Body kuzova : bodyList) {
                current_barter_body = kuzova;
                if (cur_barter_body.equals(kuzov.toString())) break outer;
            }
        }

        System.out.println("Muherrikin hecmini daxil edin: ");

        Scanner scan_barter_engine = new Scanner(System.in);
        double current_barter_engine = scan_barter_engine.nextDouble();

        System.out.println("Avtomobil suret qutusunu avtomatik yaxud mexaniki oldugunu qeyd edin." +
                " Avtomtik oldugu teqdirde 'a' herfini, mexaniki 'm' herfini daxil edin.");


        Scanner scan_barter_gearbox = new Scanner(System.in);
        char current_barter_gearbox_scan = scan_barter_gearbox.next().charAt(0);

        boolean current_barter_gearbox;

        switch (current_barter_gearbox_scan) {
            case 'a':
                current_barter_gearbox = true;
                break;
            case 'm':
                current_barter_gearbox = false;
                break;
            default:
                current_barter_gearbox = false;
                System.out.println("Sehv secim.");
        }

        FuelType current_barter_fuel = null;

        outer:
        while (true) {

            System.out.println("Yanacaq novunu daxil edin: ");

            Scanner scan_barter_fuel = new Scanner(System.in);
            String curr_barter_fuel = scan_barter_fuel.next().toUpperCase();


            List<FuelType> fuelList = Arrays.asList(FuelType.values());

            for (FuelType ffuel : fuelList) {
                current_barter_fuel = ffuel;
                if (curr_barter_fuel.equals(fuel.toString())) break outer;
            }
        }

        Barter current_variant1 = new Barter(current_barter_brand, current_barter_body, current_barter_engine, current_barter_gearbox, current_barter_fuel);

        System.out.println("ikinci barter varinatinizi olacaq? '+' tesdiq ucun, '-' inkar ucun daxil edin");


        Scanner scan_tesdiq = new Scanner(System.in);
        char tesdiq = scan_tesdiq.next().charAt(0);

        boolean musbet;

        switch (tesdiq) {
            case '+':
                musbet = true;
                break;
            case '-':
                musbet = false;
                break;
            default:
                musbet = false;
                System.out.println("Sehv secim.");
        }

        Elan current_elan = null;

        if (!musbet) current_elan = new Elan(current_barter_brand, 2, motor, current_body, awd,
                current_price, probeq, awd, current_fuel, current_variant1);

        else {
            System.out.println("Barter etmek ile istediyiniz avtomobilin modelini daxil edin:");

            Scanner scan_barter2_model = new Scanner(System.in);
            String current_barter2_model = scan_barter2_model.next().toUpperCase();

            Brand current_barter2_brand = brand_detector(current_barter2_model);

            System.out.println(current_barter2_brand.marka + " " + current_barter2_brand.model);

            Body current_barter2_body = null;

            outer:
            while (true) {
                System.out.println("Modelin govdesini daxil edin:");

                Scanner scan_barter2_body = new Scanner(System.in);
                String cur_barter2_body = scan_barter2_body.next().toUpperCase();

                List<Body> bodyList = Arrays.asList(Body.values());

                for (Body kuzovd : bodyList) {
                    current_barter2_body = kuzovd;
                    if (cur_barter2_body.equals(kuzov.toString())) break outer;
                }
            }

            System.out.println("Muherrikin hecmini daxil edin: ");

            Scanner scan_barter2_engine = new Scanner(System.in);
            double current_barter2_engine = scan_barter2_engine.nextDouble();

            System.out.println("Avtomobil suret qutusunu avtomatik yaxud mexaniki oldugunu qeyd edin." +
                    " Avtomtik oldugu teqdirde 'a' herfini, mexaniki 'm' herfini daxil edin.");


            Scanner scan_barter2_gearbox = new Scanner(System.in);
            char current_barter2_gearbox_scan = scan_barter2_gearbox.next().charAt(0);

            boolean current_barter2_gearbox;

            switch (current_barter2_gearbox_scan) {
                case 'a':
                    current_barter2_gearbox = true;
                    break;
                case 'm':
                    current_barter2_gearbox = false;
                    break;
                default:
                    current_barter2_gearbox = false;
                    System.out.println("Sehv secim.");
            }

            FuelType current_barter2_fuel = null;

            outer:
            while (true) {

                System.out.println("Yanacaq novunu daxil edin: ");

                Scanner scan_barter2_fuel = new Scanner(System.in);
                String curr_barter2_fuel = scan_barter2_fuel.next().toUpperCase();


                List<FuelType> fuelList = Arrays.asList(FuelType.values());

                for (FuelType ffuel : fuelList) {
                    current_barter2_fuel = ffuel;
                    if (curr_barter2_fuel.equals(fuel.toString())) break outer;
                }
            }

            Barter current_variant2 = new Barter(current_barter2_brand, current_barter2_body,
                    current_barter2_engine, current_barter2_gearbox, current_barter2_fuel);


            System.out.println("Ucuncu barter varinatinizi olacaq? '+' tesdiq ucun, '-' inkar ucun daxil edin");

            Scanner scan_tesdiq2 = new Scanner(System.in);
            char tesdiq2 = scan_tesdiq2.next().charAt(0);

            boolean musbet2;

            switch (tesdiq2) {
                case '+':
                    musbet2 = true;
                    break;
                case '-':
                    musbet2 = false;
                    break;
                default:
                    musbet2 = false;
                    System.out.println("Sehv secim.");
            }

            if (!musbet2)
                current_elan = new Elan(current_barter_brand, 1994, motor, current_body, awd,
                        current_price, probeq, awd, current_fuel, current_variant1, current_variant2);
            else {
                System.out.println("Barter etmek ile istediyiniz avtomobilin modelini daxil edin:");

                Scanner scan_barter3_model = new Scanner(System.in);
                String current_barter3_model = scan_barter3_model.next().toUpperCase();

                Brand current_barter3_brand = brand_detector(current_barter3_model);

                System.out.println(current_barter3_brand.marka + " " + current_barter3_brand.model);

                Body current_barter3_body = null;

                outer:
                while (true) {
                    System.out.println("Modelin govdesini daxil edin:");

                    Scanner scan_barter3_body = new Scanner(System.in);
                    String cur_barter3_body = scan_barter3_body.next().toUpperCase();

                    List<Body> bodyList = Arrays.asList(Body.values());

                    for (Body kuzovd : bodyList) {
                        current_barter3_body = kuzovd;
                        if (cur_barter3_body.equals(kuzov.toString())) break outer;
                    }
                }

                System.out.println("Muherrikin hecmini daxil edin: ");

                Scanner scan_barter3_engine = new Scanner(System.in);
                double current_barter3_engine = scan_barter3_engine.nextDouble();

                System.out.println("Avtomobil suret qutusunu avtomatik yaxud mexaniki oldugunu qeyd edin." +
                        " Avtomtik oldugu teqdirde 'a' herfini, mexaniki 'm' herfini daxil edin.");


                Scanner scan_barter3_gearbox = new Scanner(System.in);
                char current_barter3_gearbox_scan = scan_barter3_gearbox.next().charAt(0);

                boolean current_barter3_gearbox;

                switch (current_barter3_gearbox_scan) {
                    case 'a':
                        current_barter3_gearbox = true;
                        break;
                    case 'm':
                        current_barter3_gearbox = false;
                        break;
                    default:
                        current_barter3_gearbox = false;
                        System.out.println("Sehv secim.");
                }

                FuelType current_barter3_fuel = null;

                outer:
                while (true) {

                    System.out.println("Yanacaq novunu daxil edin: ");

                    Scanner scan_barter3_fuel = new Scanner(System.in);
                    String curr_barter3_fuel = scan_barter3_fuel.next().toUpperCase();


                    List<FuelType> fuelList = Arrays.asList(FuelType.values());

                    for (FuelType ffuel : fuelList) {
                        current_barter3_fuel = ffuel;
                        if (curr_barter3_fuel.equals(fuel.toString())) break outer;
                    }
                }

                Barter current_variant3 = new Barter(current_barter3_brand, current_barter3_body,
                        current_barter3_engine, current_barter3_gearbox, current_barter3_fuel);

                current_elan = new Elan(current_barter_brand, 1994, motor, current_body, awd,
                        current_price, probeq, awd, current_fuel, current_variant1, current_variant2, current_variant3);
            }
        }

        Elan no1 = new Elan(new Brand(Volkswagen_Models.GOLF_GTI), 2015, 2.0,
                Body.XETCHBEK, false, 27000, 152000, true, FuelType.GASOLINE,
                new Barter(new Brand(Bmw_Models.e91), Body.UNIVERSAL, 3.0, false, FuelType.DIESEL),
                new Barter(new Brand(Infiniti_Models.FX50), Body.SUV, 5.0, true, FuelType.GASOLINE),
                new Barter(new Brand(Honda_Models.CIVIC), Body.XETCHBEK, 2.0, true, FuelType.GASOLINE));


        List<Elan> elans = List.of(no1);

        List<Barter> yoursBarter = new ArrayList<>();

        if (current_elan.variant1 != null) yoursBarter.add(current_elan.variant1);
        if (current_elan.variant2 != null) yoursBarter.add(current_elan.variant2);
        if (current_elan.variant3 != null) yoursBarter.add(current_elan.variant3);


        for (Barter own_barter : yoursBarter) {
            for (Elan x_elan : elans) {
                if (own_barter.barter_brand.model == x_elan.brand.model &&
                        own_barter.kuzov == x_elan.kuzov &&
                        own_barter.engine_size == x_elan.engine_size &&
                        own_barter.fuelType == x_elan.fuelType &&
                        own_barter.auto_gearbox == x_elan.auto_gearbox) {

                    ArrayList<Barter> uygun_elan_barterlari = new ArrayList<>();

                    if (x_elan.variant1 != null) uygun_elan_barterlari.add(x_elan.variant1);
                    if (x_elan.variant2 != null) uygun_elan_barterlari.add(x_elan.variant2);
                    if (x_elan.variant3 != null) uygun_elan_barterlari.add(x_elan.variant3);

                    for (Barter x_barter : uygun_elan_barterlari) {
                        if (current_elan.brand.model == x_barter.barter_brand.model &&
                                current_elan.kuzov == x_barter.kuzov &&
                                current_elan.engine_size == x_barter.engine_size &&
                                current_elan.fuelType == x_barter.fuelType &&
                                current_elan.auto_gearbox == x_barter.auto_gearbox) {
                            System.out.println(x_elan);
                        }
                    }
                }
            }
        }
    }


    static Brand brand_detector(String scanned_modelname) {

        List<Modelable> all_models = new ArrayList<>();

        List<Volkswagen_Models> volkswagen_models_array = Arrays.asList(Volkswagen_Models.values());
        List<Bmw_Models> bmw_models_array = Arrays.asList(Bmw_Models.values());
        List<Infiniti_Models> infiniti_models_array = Arrays.asList(Infiniti_Models.values());
        List<Toyota_Models> toyota_models_array = Arrays.asList(Toyota_Models.values());
        List<Honda_Models> honda_models_array = Arrays.asList(Honda_Models.values());
        List<Mercedes_Models> mercedes_models_array = Arrays.asList(Mercedes_Models.values());
        List<Volvo_Models> volvo_models_array = Arrays.asList(Volvo_Models.values());
        List<Audi_Models> audi_models_array = Arrays.asList(Audi_Models.values());

        all_models.addAll(volvo_models_array);
        all_models.addAll(volkswagen_models_array);
        all_models.addAll(bmw_models_array);
        all_models.addAll(infiniti_models_array);
        all_models.addAll(toyota_models_array);
        all_models.addAll(honda_models_array);
        all_models.addAll(mercedes_models_array);
        all_models.addAll(audi_models_array);

        int c = 1;

        for (Modelable model : all_models) {
            if (scanned_modelname.equals(model.toString())) break;
            c++;
        }

        Brand your_brand = null;

        if (c < 14) {
            for (Volvo_Models model : volvo_models_array) {
                if (scanned_modelname.equals(model.toString())) your_brand = new Brand(model);
            }
        } else if (c < 36) {
            for (Volkswagen_Models model : volkswagen_models_array) {
                if (scanned_modelname.equals(model.toString())) your_brand = new Brand(model);
            }
        } else if (c < 52) {
            for (Bmw_Models model : bmw_models_array) {
                if (scanned_modelname.equals(model.toString())) your_brand = new Brand(model);
            }
        } else if (c < 62) {
            for (Infiniti_Models model : infiniti_models_array) {
                if (scanned_modelname.equals(model.toString())) your_brand = new Brand(model);
            }
        } else if (c < 96) {
            for (Toyota_Models model : toyota_models_array) {
                if (scanned_modelname.equals(model.toString())) your_brand = new Brand(model);
            }
        } else if (c < 105) {
            for (Honda_Models model : honda_models_array) {
                if (scanned_modelname.equals(model.toString())) your_brand = new Brand(model);
            }
        } else if (c < 127) {
            for (Mercedes_Models model : mercedes_models_array) {
                if (scanned_modelname.equals(model.toString())) your_brand = new Brand(model);
            }
        } else {
            for (Audi_Models model : audi_models_array) {
                if (scanned_modelname.equals(model.toString())) your_brand = new Brand(model);
            }
        }
        return your_brand;
    }
}





