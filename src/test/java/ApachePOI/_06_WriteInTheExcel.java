package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0);

        int enSonSatir= sheet.getPhysicalNumberOfRows(); // en son var olan satır no
        Row yeniSatir= sheet.createRow(enSonSatir); // en son boş yer yeni satır oluştur
        Cell yeniHucre=yeniSatir.createCell(0); // yeni satırda hücre oluşturuldu

        yeniHucre.setCellValue("Merhaba Dünya");
        inputStream.close(); //okuma modunu kapat

        //dosyayı kaydet
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream); //worbook u yaz, kaydet
        workbook.close(); // hafıza boşalt
        fileOutputStream.close(); // yazma modunu kapat

        System.out.println("işlem tamamlandı");
    }
}
