package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create a File class object and add excel sheet path along with file name and extension
		File myFile= new File("C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\16JulAEVEN.xlsx");
		//stored refreance element of common part
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//how to read whole row from excel
		System.out.println("============================================");
		//use for loop 
		for(int i = 0;i<=3;i++)
		
		{
		String value = mysheet.getRow(3).getCell(i).getStringCellValue();//cell value vary.....row value constant
		System.out.print(value+" ");//for one line print & give "" to give space bet word
		}
		System.out.println();
		System.out.println("============================================");
		
		//how to read whole column/cell from excel
		for(int i =3;i<=8;i++)
			
		{
		String value2 = mysheet.getRow(i).getCell(0).getStringCellValue();//cell value vary.....row value constant
		System.out.print(value2+" ");//for one line print & give "" to give space bet word
		}
		System.out.println();
		System.out.println("============================================");
		

	}

}
