package _JDBC;

// city tablosundaki tüm satırlardaki şehir isimlerini next ile yazdırınız

import java.sql.*;

public class _02_Soru {

    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://demo.mersys.io:33906/sakila";
        String username="admin";
        String password="Techno24Study.%=";

        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
        ResultSet resultSet= statement.executeQuery("select * from city;");

        while (resultSet.next())
            System.out.println(resultSet.getString("city"));

        connection.close();
    }

}










