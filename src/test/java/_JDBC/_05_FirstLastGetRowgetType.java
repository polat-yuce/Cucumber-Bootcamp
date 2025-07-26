package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowgetType extends JDBCParent{

    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs=statement.executeQuery("select city from city");

        rs.last();  // son satıra götürüyor
        System.out.println("Son satır = " + rs.getString(1)); // son satır
        int kacinciSatirdayim=rs.getRow(); // sorgunun sonucunda dönen kayıt sayısı
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

        rs.first();
        System.out.println("ilk satır = " + rs.getString(1)); // ilk satır
        kacinciSatirdayim=rs.getRow(); // sorgunun sonucunda dönen kayıt sayısı
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);


        DBConnectionClose();
    }

}

// rs.next() : sonraki satır
// rs.previous : önceki satır
// rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
// rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.
// rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
// rs.relative(-5) :  - (eksi) bulunduğu yerden 5 satır geri
// ilk satırdan relative ile 5 geri gitmek istersek sınırı taştığı için hata verecektir