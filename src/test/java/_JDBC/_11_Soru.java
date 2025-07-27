package _JDBC;

import jdk.dynalink.linker.LinkerServices;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class _11_Soru extends JDBCParent{
// Kendisine gönderilen bir select sorgusunun sonucunu ArrayList olarak döndüren
    // metodu yazınız. Mainde Listi yazdırarak sonucu kontrol ediniz.

    public static void main(String[] args) {
         String sorgu="select * from customer";

         List<List<String>> gelenData=getListData(sorgu);

         for(List<String> satir: gelenData) {
             for (String hucre : satir)
                 System.out.print(hucre+"\t");

             System.out.println();
         }
    }


    public static List<List<String>> getListData(String sorgu)
    {
        DBConnectionOpen();

        List<List<String>> tablo=new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(sorgu);
            ResultSetMetaData rsmd=rs.getMetaData();

            while (rs.next())
            {
                ArrayList<String> satir=new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    satir.add(rs.getString(i)); // satırları doldur

                tablo.add(satir); //ana tabloya ekle
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        DBConnectionClose();
        return tablo;
    }

}
