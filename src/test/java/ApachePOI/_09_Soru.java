package ApachePOI;

// YeniExcel2.xlsx adında bir yeni excele merhaba Dünya 1 şeklinde yazı yazınız.
// Daha sonra program her yeniden çalıştırıldığında altına Merhaba Dünya 2...3
// şeklinde eklesin. Yani dosya yok ise oluşturup yazsın, daha sonra hep altına eklesin.

// File dosya=new File(path)
// if ( dosya.exists() )    dosya var ise

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Merhaba Dünya 1
// Merhaba Dünya 2
// Merhaba Dünya 3
// ...
public class _09_Soru {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/Merhaba.xlsx";
        File dosya=new File(path);

        if (!dosya.exists()) { // dosya yok ise
            XSSFWorkbook workbook=new XSSFWorkbook(); //yeni oluştur
            XSSFSheet sheet= workbook.createSheet("Sayfa1");
            Row yeniSatir=sheet.createRow(0);
            Cell yeniHucre=yeniSatir.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya 1");  //değeri ver
            FileOutputStream outputStream=new FileOutputStream(path);  //kaydet
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Dosya oluşturuldu");
        }
        else {  //dosya var ise
            FileInputStream inputStream=new FileInputStream(path);  //var olanı oku
            Workbook workbook= WorkbookFactory.create(inputStream);
            Sheet sheet= workbook.getSheetAt(0);
            int enSonSatir= sheet.getPhysicalNumberOfRows();
            Row yeniSatir=sheet.createRow(enSonSatir);
            Cell yeniHucre=yeniSatir.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya "+(enSonSatir+1));  //değeri ver
            FileOutputStream outputStream=new FileOutputStream(path);  //kaydet
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Dosyaya Eklendi");
        }

    }
}

// TODO 1:
// * Excel Çarpım tablosunu  alt alta
// * YENİ bir excel dosyasına
// * 1 den 10 kadar çarpımlar için yapınız.
// */

// TODO 2:
// * Excel Çarpım tablosunu  yan yana
// * YENİ bir excel dosyasına
// * 1 den 10 kadar çarpımlar için yapınız.
// */