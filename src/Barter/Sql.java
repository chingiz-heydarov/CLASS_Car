package Barter;

import java.sql.PreparedStatement;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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

    public Sql() {
    }

    public static void selekt(String brendd, String modell, String kuzovv, Double valuee, String year, String avto, String awdd) throws SQLException, ParseException {


        String sql = "select ";

        if (brendd == null && modell == null) sql += "distinct brend  FROM barter.x";

        else if (brendd != null && modell == null) sql += "distinct model from barter.x where brend= ?";

        else if (year != null && valuee == null)
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


    public static Object little(String modell, String yearr, Double valuee, String indikator) throws SQLException, ParseException {

        String sql = "select ";

        if (valuee == null) sql += "distinct klassik from barter.x where model= ?";
        else if (indikator.equals("hp")) sql += "distinct hp from barter.x where model= ? and begin_year< ? " +
                "and end_year> ? and value= ?";
        else if (indikator.equals("fuel")) sql += "distinct fuel from barter.x where model= ? and begin_year< ? " +
                "and end_year> ? and value= ?";
        else if (indikator.equals("kuzov")) sql += "distinct kuzov from barter.x";

        PreparedStatement pstmt = connection.prepareStatement(sql);

        int i = 1;

        if (modell != null) pstmt.setString(i++, modell);
        if (yearr != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date year_date = dateFormat.parse(yearr);

            java.sql.Date sqlDate = new java.sql.Date(year_date.getTime());
            pstmt.setDate(i++, sqlDate);
            pstmt.setDate(i++, sqlDate);
        }

        if (valuee != null && !(indikator.equals("kuzov"))) pstmt.setDouble(i++, valuee);

        ResultSet rs = pstmt.executeQuery();

        Boolean klassik;

        while (rs.next()) {
            if (valuee == null) {
                klassik = rs.getBoolean("klassik");
                return klassik;
            } else if (indikator.equals("hp")) {
                Integer hp = rs.getInt("hp");
                return hp;
            } else if (indikator.equals("fuel")) {
                String fuel = rs.getString("fuel");
                return fuel;
            } else if (indikator.equals("kuzov")) {
                String kuzov = rs.getString("kuzov");
                System.out.println(kuzov);
            }
        }
        return null;
    }


    public static Integer insert(String brend, String model, Double motor, String kuzov, Boolean klassik, Boolean korobka, Boolean awd,
                                 Integer probeq, String fuel, Integer hp, Integer year, Integer cid) throws SQLException {

        String sql = "insert ";

        PreparedStatement insertcar;

        if (cid == null) {
            sql += "into barter.cars (brend,model,motor,kuzov,klassik,korobka,privod," +
                    "probeq,fuel,hp,year) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) returning id";
            insertcar = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        } else {
            sql += "into barter.barters (brend,model,value,kuzov,klassik,korobka,privod," +
                    "probeq,fuel,hp,year,car_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

            insertcar = connection.prepareStatement(sql);
        }

//        List<Object> nul = List.of(brend, model, motor, kuzov, klassik, korobka, awd, probeq, fuel, hp, year);
//
//        int i = 1;
//
//        for (Object z : nul) {
//            if (z == null) insertcar.setNull(i, Types.JAVA_OBJECT);
//            else {
//                switch (i) {
//                    case 1:
//                    case 2:
//                    case 4:
//                    case 9:
//                        insertcar.setString(i, (String) z);
//                        break;
//                    case 8:
//                    case 10:
//                    case 11:
//                        insertcar.setInt(i, (Integer) z);
//                        break;
//                    case 5:
//                    case 6:
//                    case 7:
//                        insertcar.setBoolean(i, (Boolean) z);
//                        break;
//                    case 3:
//                        insertcar.setDouble(i, (Double) z);
//                        break;
//                }
//            }
//            i++;
//        }


        insertcar.setString(1, brend);
        insertcar.setString(2, model);
        insertcar.setDouble(3, motor);
        insertcar.setString(4, kuzov);
        insertcar.setBoolean(5, Boolean.TRUE.equals(klassik));
        insertcar.setBoolean(6, Boolean.TRUE.equals(korobka));
        insertcar.setBoolean(7, Boolean.TRUE.equals(awd));
        insertcar.setInt(8, probeq);
        insertcar.setString(9, fuel);
        if (hp != null) insertcar.setInt(10, hp);
        else insertcar.setNull(10, Types.INTEGER);
        if (year != null) insertcar.setInt(11, year);
        else insertcar.setNull(11, Types.INTEGER);
        if (cid != null) insertcar.setInt(12, cid);

        insertcar.executeUpdate();

        if (cid == null) {
            ResultSet recid = insertcar.getGeneratedKeys();
            if (recid.next()) {
                return recid.getInt(1);
            }
        }
        return null;
    }

    public static void barter(String brendb, String modelb, String selek) throws SQLException {

        String sql = "select distinct " + selek + " from barter.x";


        if (modelb != null) sql += " where model= ?";
        else if (brendb != null) sql += " where brend= ?";

        PreparedStatement pstmt = connection.prepareStatement(sql);

        if (modelb != null) pstmt.setString(1, modelb);

        else if (brendb != null) pstmt.setString(1, brendb);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            if (selek.equals("value,hp")) {
                Double value = rs.getDouble("value");
                int hp = rs.getInt("hp");
                System.out.println(value + "----" + hp);
            } else {
                String s = rs.getString(selek);
                System.out.println(s);
            }
        }
    }
}
