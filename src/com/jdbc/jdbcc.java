package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class jdbcc {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        Connection connection = DriverManager.getConnection(url, "postgres", "saxon1876");

        Statement statement = connection.createStatement();

        System.out.println("brand:");

          Scanner sc= new Scanner(System.in);

          String name =sc.next();

        String sql = "insert into cars.brands values ('12','"+name+"')";

        statement.execute(sql);

        PreparedStatement ps = connection.prepareStatement("select * from Cars.Brands");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            Integer id= rs.getInt(1);
            String namex = rs.getString("name");
            System.out.println(id+" "+namex);
        }

        System.out.println();
        System.out.println("After deleting: "+'\n');

        Statement delet = connection.createStatement();
        String delete="delete from cars.brands values where id>10";
        delet.execute(delete);

        PreparedStatement prs = connection.prepareStatement("select * from Cars.Brands");
        ResultSet rst = prs.executeQuery();

        while (rst.next()){
            Integer id= rst.getInt(1);
            String namex = rst.getString("name");
            System.out.println(id+" "+namex);
        }

        System.out.println();
        System.out.println("Idi cut olan rowlar: "+'\n');

//        Statement sel = connection.createStatement();
//        String select= "select name from cars.brands where id>5";
//        sel.execute(select);

        PreparedStatement prst = connection.prepareStatement("select id, name from cars.brands where  id%2=0");
        ResultSet rslt = prst.executeQuery();

        while (rslt.next()){
            Integer id= rslt.getInt(1);
            String namex = rslt.getString("name");
            System.out.println(id+" "+namex);
        }

        System.out.println("Prepared Statement's Update: ");

        PreparedStatement upd=connection.prepareStatement("insert into cars.brands values ('24','CITROEN')");
        upd.executeUpdate();


//        while (resUpd.next()){
//            Integer id= resUpd.getInt(1);
//            String namex = resUpd.getString("name");
//            System.out.println(id+" "+namex);
//        }

        System.out.println();
        System.out.println("Prepared Statement's Select (tek olan rowlar): "+'\n');

        PreparedStatement prselect = connection.prepareStatement("select id, name from cars.brands where  id%2=1");
        ResultSet resel = prselect.executeQuery();

        while (resel.next()){
            Integer id= resel.getInt(1);
            String namex = resel.getString("name");
            System.out.println(id+" "+namex);
        }

//        PreparedStatement prcret = connection.prepareStatement("create table concerns"+" id integer"+"name String");
//        ResultSet rescret = prcret.executeQuery();

//        Statement creat = connection.createStatement();
//        String crt= "CREATE TABLE concerns " +
//                "(id INTEGER not NULL, " +
//                " name TEXT)";
//        creat.executeQuery(crt);

    }
}
