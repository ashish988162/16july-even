package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create a File class object and add excel sheet path along with file name and extension
		File myFile= new File("C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\16JulAEVEN.xlsx");
      //make pieces ..step by step ofString value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	   Workbook myworkbook = WorkbookFactory.create(myFile);
	   Sheet mysheet = myworkbook.getSheet("Sheet1");
	   Row myrow = mysheet.getRow(0);
	   Cell mycell = myrow.getCell(3);
	   
	   CellType datatypes = mycell.getCellType();//find which types of datatypes present
	  System.out.println(datatypes);
	  String value = mycell.getStringCellValue();
	  System.out.println(value);
	
	
	}

}
