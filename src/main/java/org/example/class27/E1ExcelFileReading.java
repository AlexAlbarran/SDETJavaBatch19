package org.example.class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class E1ExcelFileReading {

    public E1ExcelFileReading() throws IOException {
        //Location of the file
        String path="C:\\Users\\IronMan\\IdeaProjects\\SDETJavaBatch19\\Files\\Batch19TestData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        //A class that helps us read/write excel files
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);
        // Accessing sheet from excel file
        Sheet sheet =excelFile.getSheet("Sheet1");
        //A simple data structure to hold the data from the Excel file
        List<Map<String,String>> exceldata=new ArrayList<>();
        //Extracting the first row to use as the keys for the maps
        Row headerRow= sheet.getRow(0);

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {

            Map<String,String> rowMap=new LinkedHashMap<>();
            Row row=sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                String key=headerRow.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowMap.put(key,value);
            }

            exceldata.add(rowMap);
        }
        System.out.println(excelFile);
    }
}
