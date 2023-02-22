package com.sql_for_barter;

import java.sql.*;

public class Sql {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        Connection connection = DriverManager.getConnection(url, "postgres", "postgres");

        PreparedStatement ps = connection.prepareStatement("select * from barter.x");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Integer id = rs.getInt("id");
            String brend = rs.getString("brend");
            String model = rs.getString("model");
            String gen = rs.getString("gen");
            Date begin = rs.getDate("begin_year");
            Date end = rs.getDate("end_year");
            String kuzov = rs.getString("kuzov");
            double value = rs.getDouble("value");
            int hp = rs.getInt("hp");
            String fuel = rs.getString("fuel");
            boolean klassik = rs.getBoolean("klassik");
            boolean auto = rs.getBoolean("auto");
            boolean awd = rs.getBoolean("awd");
            System.out.println(id + "\t" + brend + "\t" + model + "\t" + gen + "\t" + begin + "\t" + end + "\t" + kuzov + "\t" + value + "\t" +
                    hp + "\t" + fuel + "\t" + klassik + "\t" + auto + "\t" + awd);
        }
    }
}
