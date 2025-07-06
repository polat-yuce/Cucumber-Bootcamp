package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

// workbook-sheet-row-cell
public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
       String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        //Java dosya okuma nesnesine bu yolu vererek bağlantı kuruyorum
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

        //Dosya okuma işlemcisi üzerinden Çalışma Kitabını alıyorum
        // hafızada(Ram de) workbook u alıp oluşturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");

        //istenen satırı alıyorum
        Row satir= calismaSayfasi.getRow(0); // 0.satir aldım

        //istenen sütundaki hücreyi al
        Cell hucre=satir.getCell(0); // 0.sütundaki hücreyi aldım

        System.out.println("hucre = " + hucre);
    }
}
