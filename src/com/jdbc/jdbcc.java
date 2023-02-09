package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class jdbcc {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(url, "postgres", "saxon1876");

        PreparedStatement ps = connection.prepareStatement("select * from Cars.Brands");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            Integer id= rs.getInt(1);
            String name = rs.getString("name");
            System.out.println(id+" "+name);
        }


        Statement statement = connection.createStatement();


        Scanner sc= new Scanner(System.in);
        System.out.println("Ad");
        String name =sc.next();

        String sql = "insert into cars.brands " +
                "values (nextval('cars.brands'),'"+name+"' ,'c++')";

        String sql1= "insert into myschema.teacher3 values (nextval('myschema.mysequence'),? ,?,'c++')";
    }
}
