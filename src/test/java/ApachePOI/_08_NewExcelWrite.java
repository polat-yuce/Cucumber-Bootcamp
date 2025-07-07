package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        // Ortada bir excel olmadığına göre
        // Workbook u ve Sheet i hafızada oluşturmam lazım

        XSSFWorkbook workbook=new XSSFWorkbook(); // hafızadaki workbook
        XSSFSheet sheet= workbook.createSheet("Sayfa1");

        Row yeniSatir=sheet.createRow(0);
        Cell yeniHucre= yeniSatir.createCell(0);
        yeniHucre.setCellValue("Merhaba Dünya");

        String path="src/test/java/ApachePOI/resource/YeniExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("İşlem tamamlandı");
    }
}
