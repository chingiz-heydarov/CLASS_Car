package com.sql_for_barter;

import java.sql.*;

public class Sql {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        Connection connection = DriverManager.getConnection(url, "postgres", "postgres");


//        PreparedStatement statbrend = connection.prepareStatement("select distinct brend from barter.x ");
//        ResultSet resbrend = statbrend.executeQuery();
//
//        while (resbrend.next()) {
//            String brend = resbrend.getString("brend");
//            System.out.println(brend);
//        }

//        PreparedStatement statmodel=connection.prepareStatement("select distinct model from barter.x where brend='skoda'");
//        ResultSet resmodel=statmodel.executeQuery();
//
//        while (resmodel.next()){
//            String model=resmodel.getString("model");
//            System.out.println(model);
//        }


//        PreparedStatement statmotor = connection.prepareStatement("select distinct value from barter.x where model='superb'\n" +
//                "and begin_year<'05-05-2013' and end_year>'05-05-2013'");
//        ResultSet resmotor=statmotor.executeQuery();
//
//        while (resmotor.next()){
//            double value = resmotor.getDouble("value");
//            System.out.println(value);
//        }

//        PreparedStatement statkuzov=connection.prepareStatement("select distinct kuzov from barter.x where model='superb'\n" +
//                "and begin_year<'05-05-2013' and end_year>'05-05-2013' and value=2.0\n");
//        ResultSet reskuzov=statkuzov.executeQuery();
//
//        while (reskuzov.next()){
//            String kuzov=reskuzov.getString("kuzov");
//            System.out.println(kuzov);
//        }

//        PreparedStatement statauto=connection.prepareStatement("select distinct auto from barter.x where model='superb'\n" +
//                "and begin_year<'05-05-2013' and end_year>'05-05-2013' and value=2.0 and kuzov='liftbek'\n");
//        ResultSet resauto=statauto.executeQuery();
//
//        while (resauto.next()){
//            boolean auto=resauto.getBoolean("auto");
//            System.out.println(auto);
//        }


        PreparedStatement statawd=connection.prepareStatement("select distinct awd from barter.x where model='superb'\n" +
                "and begin_year<'05-05-2013' and end_year>'05-05-2013' and value=2.0 and kuzov='liftbek' and auto=true\n");
        ResultSet resawd =statawd.executeQuery();

        while (resawd.next()){
            boolean awd=resawd.getBoolean("awd");
            System.out.println(awd);
        }


//        PreparedStatement ps = connection.prepareStatement("select brend from barter.x");
//        ResultSet rs = ps.executeQuery();
//
//        while (rs.next()) {
//            Integer id = rs.getInt("id");
//            String brend = rs.getString("brend");
//            String model = rs.getString("model");
//            String gen = rs.getString("gen");
//            Date begin = rs.getDate("begin_year");
//            Date end = rs.getDate("end_year");
//            String kuzov = rs.getString("kuzov");
//            double value = rs.getDouble("value");
//            int hp = rs.getInt("hp");
//            String fuel = rs.getString("fuel");
//            boolean klassik = rs.getBoolean("klassik");
//            boolean auto = rs.getBoolean("auto");
//            boolean awd = rs.getBoolean("awd");
//            System.out.println(id+ "\t" + brend + "\t" + model + "\t" + gen + "\t" + begin + "\t" + end + "\t" + kuzov + "\t" + value + "\t" +
//                    hp + "\t" + fuel + "\t" + klassik + "\t" + auto + "\t" + awd);
//        }
    }
}
