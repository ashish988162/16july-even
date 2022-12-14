package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create a File class object and add excel sheet path along with file name and extension
		File myFile= new File("C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\16JulAEVEN.xlsx");
	  Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
	  //use nested for loop
		//how to read whole data from excel
		//vary rows--> vary cells
		//outer for loop--> rows-->vary 0-->1
		for(int i=0;i<=1;i++)//0,1,2
		{
		//inner for loop--> cells-->0-->3
		for(int j=0;j<=3;j++)//0,1,2,3,4
		{
		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
		}
		System.out.println();
		}

	}

}
