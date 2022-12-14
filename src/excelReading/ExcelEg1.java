package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create a File class object and add excel sheet path along with file name and extension
		File myFile= new File("C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\16JulAEVEN.xlsx");
		//three types of datatypes use in excel wstring,numeric,boolean......use index start from 0....
		//1 datatype string
		String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();//store in referance element
        System.out.println(value1);
      //2 datatype numeric
       double value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
        System.out.println(value2);
      //3 datatype boolean
        boolean value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
        System.out.println(value3);
        
        
	}

}
