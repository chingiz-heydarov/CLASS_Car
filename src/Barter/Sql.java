package Barter;

import java.sql.PreparedStatement;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Sql {

    static String url = "jdbc:postgresql://localhost:5432/postgres";

    static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(url, "postgres", "postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void selekt(String brendd, String modell, String kuzovv, Double valuee, String year, String avto, String awdd) throws SQLException, ParseException {


        String sql = "select ";

        if (brendd == null && modell == null) sql += "distinct brend  FROM barter.x";

        else if (brendd != null && modell == null) sql += "distinct model from barter.x where brend= ?";

        else if (modell != null && year != null && valuee == null)
            sql += "distinct value from barter.x where model= ? and begin_year< ? " +
                    "and end_year> ?";

        else if (valuee != null && kuzovv == null) sql += "distinct kuzov from barter.x where model= ? and" +
                " begin_year< ? and end_year> ? and value= ? ";

        else if (kuzovv != null && avto == null) sql += "distinct auto from barter.x where model= ? " +
                "and begin_year< ? and end_year> ? and value= ? and kuzov= ?";

        else if (avto != null && awdd == null) sql += "distinct awd from barter.x where model= ? " +
                "and begin_year< ? and end_year> ? and value= ? and kuzov= ? and auto= ?";


        PreparedStatement pstmt = connection.prepareStatement(sql);

        int i = 1;

        if (brendd != null) pstmt.setString(i++, brendd);

        if (modell != null) pstmt.setString(i++, modell);

        if (year != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date year_date = dateFormat.parse(year);

            java.sql.Date sqlDate = new java.sql.Date(year_date.getTime());
            pstmt.setDate(i++, sqlDate);
            pstmt.setDate(i++, sqlDate);
        }

        if (valuee != null) pstmt.setDouble(i++, valuee);

        if (kuzovv != null) pstmt.setString(i++, kuzovv);

        if (avto != null) {
            char scan_auto = avto.charAt(0);

            boolean korobka;

            switch (scan_auto) {
                case 'a':
                    korobka = true;
                    break;
                case 'm':
                    korobka = false;
                    break;
                default: {
                    korobka = false;
                    System.out.println("---------- Sehv secim. Avtomobilin suret qutusu mexanika kimi qeyd olunacaq. ----------");
                }
            }
            pstmt.setBoolean(i++, korobka);
        }

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            if (brendd == null && modell == null) {
                String brend = rs.getString("brend");
                System.out.println(brend);
            } else if (brendd != null && modell == null) {
                String model = rs.getString("model");
                System.out.println(model);
            } else if (modell != null && year != null && valuee == null) {
                Double value = rs.getDouble("value");
                System.out.println(value);
            } else if (valuee != null && kuzovv == null) {
                String kuzov = rs.getString("kuzov");
                System.out.println(kuzov);
            } else if (kuzovv != null && avto == null) {
                boolean auto = rs.getBoolean("auto");
                if (auto) System.out.println("avtomat");
                else System.out.println("mexanika");
            } else if (avto != null && awdd == null) {
                boolean awd = rs.getBoolean("awd");
                if (awd) System.out.println("4x4");
                else System.out.println("4x2");
            }
        }
    }




    public static Object little(String modell,String yearr, Double valuee,String indikator) throws SQLException, ParseException {
        String sql = "select ";
        if(valuee==null) sql+="distinct klassik from barter.x where model= ?";
        else if (indikator.equals("hp")) sql+="distinct hp from barter.x where model= ? and begin_year< ? " +
                "and end_year> ? and value= ?";
        else if (indikator.equals("fuel")) sql+="distinct fuel from barter.x where model= ? and begin_year< ? " +
                "and end_year> ? and value= ?";

        PreparedStatement pstmt = connection.prepareStatement(sql);

        int i = 1;

        if(modell!=null) pstmt.setString(i++, modell);
        if (yearr != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date year_date = dateFormat.parse(yearr);

            java.sql.Date sqlDate = new java.sql.Date(year_date.getTime());
            pstmt.setDate(i++, sqlDate);
            pstmt.setDate(i++, sqlDate);
        }

        if (valuee != null) pstmt.setDouble(i++, valuee);


        ResultSet rs = pstmt.executeQuery();

        Boolean klassik;

        while (rs.next()) {
            if(valuee==null){
                klassik=rs.getBoolean("klassik");
                return klassik;
            }
            else if (indikator.equals("hp")){
                Integer hp=rs.getInt("hp");
                return hp;
            }
            else if (indikator.equals("fuel")){
                String fuel=rs.getString("fuel");
                return fuel;
            }
        }
       return null;
    }
}
