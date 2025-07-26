package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_Soru extends JDBCParent{
    // city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız

    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs= statement.executeQuery("select city from city");

        rs.last();
        int sonSatirNo=rs.getRow(); // son satırı aldım

        for (int i = 1; i < sonSatirNo; i++) {
            rs.absolute(i);
            System.out.println(rs.getString("city"));  // 1 de verebilirdik
        }

        DBConnectionClose();
    }


}
