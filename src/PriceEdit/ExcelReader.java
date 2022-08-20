package PriceEdit;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public void readExcel() throws Exception {
        //FileInputStream file = new FileInputStream(new File("C:\\Users\\DNS\\Desktop\\Прайс Синержи Дорс с 19.08 Розница.xlsx"))

        File file = new File("C:\\Users\\DNS\\Desktop\\Price Synergy 20.08.2022.xlsx");

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheetAt(0);

        XSSFRow row = sheet.getRow(0);

        XSSFCell cell = row.getCell(0);

        String value = cell.getStringCellValue();
        System.out.println(value);

        inputStream.close();

        workbook.close();
    }
}
