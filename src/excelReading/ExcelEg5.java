package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create a File class object and add excel sheet path along with file name and extension
		File myFile= new File("C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\16JulAEVEN.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		//row counting from index i.e from 0... by language
		int lastRowNum = mySheet.getLastRowNum();
		System.out.println("last row number is "+lastRowNum);
		int totalNoOfRows = lastRowNum;
		System.out.println("Total number of rows are "+totalNoOfRows);
		//cells counting from index i.e from 1.. by practical
		short lastCellNumber = mySheet.getRow(0).getLastCellNum();
		System.out.println("last cell number is "+lastCellNumber);
		int totalNumberofCells = lastCellNumber-1;//making adjustment make count from 0
		System.out.println("Total number of cells "+totalNumberofCells);
		
		//for loop......for dynamic value
		//outer for loop for-->rows
		for(int i=0;i<=totalNoOfRows;i++)
		{
		//innre for loop-->cells
		for(int j=0;j<=totalNumberofCells;j++)
		{
		System.out.print(mySheet.getRow(i).getCell(j).getStringCellValue()+" ");//giving space and give remove ln
		}
		System.out.println();//blank printing statement
		}
	}

}
