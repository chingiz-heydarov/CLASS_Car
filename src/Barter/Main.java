package Barter;

import com.yanvar5ders.B;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ParseException {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        Connection connection = DriverManager.getConnection(url, "postgres", "postgres");


        PreparedStatement statbrend = connection.prepareStatement("select distinct brend from barter.x ");
        ResultSet resbrend = statbrend.executeQuery();

        while (resbrend.next()) {
            String brend = resbrend.getString("brend");       //       -------------BREND------------
            System.out.println(brend);
        }

        System.out.println("--------- Brendi secin: ----------");

        Scanner scan_brend = new Scanner(System.in);
        String brend = scan_brend.next();


        PreparedStatement statmodel = connection.prepareStatement("select distinct model from barter.x where brend= ?");
        statmodel.setString(1, brend);
        ResultSet resmodel = statmodel.executeQuery();

        System.out.println("--------- Modeli secin: ---------");                  //-------------------MODEL--------------

        while (resmodel.next()) {
            String model = resmodel.getString("model");
            System.out.println(model);
        }

        Scanner scan_model = new Scanner(System.in);
        String model = scan_model.next();

        System.out.println("--------- Istehsal ilini daxil edin: --------- ");

        Scanner scan_year = new Scanner(System.in);
        int your_year = scan_year.nextInt();

        String year_string = "07-07-" + your_year;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date year_date = dateFormat.parse(year_string);                                    // ----------GENERATION (YEAR) ---------------

        java.sql.Date sqlDate = new java.sql.Date(year_date.getTime());

        PreparedStatement statmotor = connection.prepareStatement("select distinct value from barter.x where model= ? and begin_year< ? " +
                "and end_year> ?");

        statmotor.setString(1, model);                         // -----------------MOTOR---------------
        statmotor.setDate(2, sqlDate);
        statmotor.setDate(3, sqlDate);

        ResultSet resmotor = statmotor.executeQuery();

        System.out.println("----------- Movcud olan motorlar: -----------");

        while (resmotor.next()) {
            double value = resmotor.getDouble("value");
            System.out.println(value);
        }



        System.out.println("---------- Muherrikin hecmini secin: ----------");

        Scanner scan_engine = new Scanner(System.in);
        double motor = scan_engine.nextDouble();

        PreparedStatement statkuzov=connection.prepareStatement("select distinct kuzov from barter.x where model= ? and" +
                " begin_year< ? and end_year> ? and value= ?\n");

        statkuzov.setString(1, model);          // ------------------KUZOV-------------
        statkuzov.setDate(2, sqlDate);
        statkuzov.setDate(3, sqlDate);
        statkuzov.setDouble(4,motor);


        ResultSet reskuzov=statkuzov.executeQuery();

        System.out.println("----------- Movcud olan kuzov tipleri: ----------");

        while (reskuzov.next()){
            String kuzov=reskuzov.getString("kuzov");
            System.out.println(kuzov);
        }


        System.out.println("--------- Govdesini daxil edin: --------");

        Scanner scan_body = new Scanner(System.in);
        String kuzov = scan_body.next();


        PreparedStatement statauto = connection.prepareStatement("select distinct auto from barter.x where model= ?\n" +
                "and begin_year< ? and end_year> ? and value= ? and kuzov= ?\n");

        statauto.setString(1, model);
        statauto.setDate(2, sqlDate);
        statauto.setDate(3, sqlDate);
        statauto.setDouble(4,motor);
        statauto.setString(5,kuzov);

        ResultSet resauto=statauto.executeQuery();

        System.out.println("--------- Modelde movcud olan korobka tipleri: ---------");

        while (resauto.next()){
            boolean auto=resauto.getBoolean("auto");
            if(auto) System.out.println("avtomat");
            else System.out.println("mexanika");
        }

        System.out.println("---------- Avtomobil suret qutusunu avtomatik yaxud mexaniki oldugunu qeyd edin." +
                " Avtomtik oldugu teqdirde 'a' herfini, mexaniki 'm' herfini daxil edin. ----------");


        Scanner scan_gearbox = new Scanner(System.in);
        char scan_auto = scan_gearbox.next().charAt(0);

        boolean auto;

        switch (scan_auto) {
            case 'a':
                auto = true;
                break;
            case 'm' :
                auto = false;
                break;
            default : {
                auto = false;
                System.out.println("---------- Sehv secim. Avtomobilin suret qutusu mexanika kimi qeyd olunacaq. ----------");
            }
        }


        PreparedStatement statawd =connection.prepareStatement("select distinct awd from barter.x where model= ?" +
                "                and begin_year< ? and end_year> ? and value= ? and kuzov= ? and auto= ?");

        statawd.setString(1, model);
        statawd.setDate(2, sqlDate);
        statawd.setDate(3, sqlDate);
        statawd.setDouble(4,motor);
        statawd.setString(5,kuzov);
        statawd.setBoolean(6,auto);

        ResultSet resawd=statawd.executeQuery();

        System.out.println("---------- Modelin shassi variantlari: ---------");

        while (resawd.next()){
            boolean awd=resawd.getBoolean("awd");
            if(awd) System.out.println("4x4");
            else System.out.println("4x2");
        }

        System.out.println("Avtomobil dordceken sistemi ile techiz olunubsa, '+' daxil edin, eks halda '-' daxil edin.");

        Scanner scan_awd = new Scanner(System.in);
        char current_awd_scan = scan_awd.next().charAt(0);

        boolean awd;

        switch (current_awd_scan) {
            case '+' :
                awd = true;
                break;
            case '-' :
                awd = false;
                break;
            default : {
                awd = false;
                System.out.println("Sehv secim.");
            }
        }








        System.out.println("-----------------------------------------------------------------------------------------------");

        Body current_body = null;

        outer:
        while (true) {
            System.out.println("Govdesini daxil edin: ");

        //    Scanner scan_body = new Scanner(System.in);
         //   String cur_body = scan_body.next().toUpperCase();

            List<Body> bodyList = Arrays.asList(Body.values());

            for (Body kuzovd : bodyList) {
                current_body = kuzovd;
                if (kuzov.equals(kuzov.toString())) break outer;
            }
        }

        System.out.println("Avtomobil dordceken sistemi ile techiz olunubsa, '+' daxil edin, eks halda '-' daxil edin.");

//        Scanner scan_awd = new Scanner(System.in);
//        char current_awd_scan = scan_awd.next().charAt(0);
//
//        boolean current_awd;
//
//        switch (current_awd_scan) {
//            case '+':
//                current_awd = true;
//                break;
//            case '-':
//                current_awd = false;
//                break;
//            default:
//                current_awd = false;
//                System.out.println("Sehv secim.");
//        }


        System.out.println("Avtomobilin qiymetini daxil edin:");

        Scanner scan_price = new Scanner(System.in);
        int current_price = scan_price.nextInt();

        System.out.println("Avtomobilin yurusunu daxil edin:");

        Scanner scan_mileage = new Scanner(System.in);
        int current_mileage = scan_mileage.nextInt();

        System.out.println("Avtomobil suret qutusunu avtomatik yaxud mexaniki oldugunu qeyd edin." +
                " Avtomtik oldugu teqdirde 'a' herfini, mexaniki 'm' herfini daxil edin.");


    //    Scanner scan_gearbox = new Scanner(System.in);
     //   char current_gearbox_scan = scan_gearbox.next().charAt(0);

//        boolean current_gearbox;
//
//        switch (current_gearbox_scan) {
//            case 'a':
//                current_gearbox = true;
//                break;
//            case 'm':
//                current_gearbox = false;
//                break;
//            default:
//                current_gearbox = false;
//                System.out.println("Sehv secim. Avtomobilin suret qutusu mexanika kimi qeyd olunacaq.");
//        }

        FuelType current_fuel = null;

        outer:
        while (true) {
            System.out.println("Yanacaq novunu daxil edin: ");

            Scanner scan_fuel = new Scanner(System.in);
            String curr_fuel = scan_fuel.next().toUpperCase();

            List<FuelType> fuelList = Arrays.asList(FuelType.values());


            for (FuelType fuel : fuelList) {
                current_fuel = fuel;
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

            for (FuelType fuel : fuelList) {
                current_barter_fuel = fuel;
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
                current_price, current_mileage, auto, current_fuel, current_variant1);

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

                for (FuelType fuel : fuelList) {
                    current_barter2_fuel = fuel;
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
                        current_price, current_mileage, auto, current_fuel, current_variant1, current_variant2);
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

                    for (FuelType fuel : fuelList) {
                        current_barter3_fuel = fuel;
                        if (curr_barter3_fuel.equals(fuel.toString())) break outer;
                    }
                }

                Barter current_variant3 = new Barter(current_barter3_brand, current_barter3_body,
                        current_barter3_engine, current_barter3_gearbox, current_barter3_fuel);

                current_elan = new Elan(current_barter_brand, 1994, motor, current_body, awd,
                        current_price, current_mileage, auto, current_fuel, current_variant1, current_variant2, current_variant3);
            }
        }


        Elan no1 = new Elan(new Brand(Volkswagen_Models.GOLF_GTI), 2015, 2.0,
                Body.XETCHBEK, false, 27000, 152000, true, FuelType.GASOLINE,
                new Barter(new Brand(Bmw_Models.e91), Body.UNIVERSAL, 3.0, false, FuelType.DIESEL),
                new Barter(new Brand(Infiniti_Models.FX50), Body.SUV, 5.0, true, FuelType.GASOLINE),
                new Barter(new Brand(Honda_Models.CIVIC), Body.XETCHBEK, 2.0, true, FuelType.GASOLINE));

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

        Elan no6 = new Elan(new Brand(Honda_Models.CIVIC), 2014, 2.0, Body.XETCHBEK, false,
                21000, 180000, true, FuelType.GASOLINE,
                new Barter(new Brand(Volkswagen_Models.GOLF_GTI), Body.XETCHBEK, 2.0, true, FuelType.GASOLINE));

        Elan no8 = new Elan(new Brand(Volkswagen_Models.GOLF_GTI), 2019, 2.0,
                Body.XETCHBEK, false, 38000, 84000, true, FuelType.GASOLINE,
                new Barter(new Brand(Bmw_Models.F20), Body.XETCHBEK, 3.0, true, FuelType.GASOLINE),
                new Barter(new Brand(Toyota_Models.YARIS_GR), Body.XETCHBEK, 1.6, false, FuelType.GASOLINE),
                new Barter(new Brand(Honda_Models.CIVIC), Body.XETCHBEK, 2.0, true, FuelType.GASOLINE));

        List<Elan> elans = List.of(no1, no2, no3, no4, no5, no6, no7, no8);

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





