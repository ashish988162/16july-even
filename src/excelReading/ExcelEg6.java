package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create a File class object and add excel sheet path along with file name and extension
		File myFile= new File("C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\16JulAEVEN.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		int totalNoOfRows = mySheet.getLastRowNum();
		int totalNoOfCells = mySheet.getRow(0).getLastCellNum()-1;
		//how to read all typepes of datatypes using forloops
		//outer for loop-->rows
		for(int i=0;i<=totalNoOfRows;i++)
		{
		//inner for loop for cells
		for(int j=0;j<=totalNoOfCells;j++)
		{
		CellType dataType = mySheet.getRow(i).getCell(j).getCellType();
		if(dataType==CellType.STRING)
		{
		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+ " ");
		}
		else if (dataType==CellType.NUMERIC)
		{
		double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
		System.out.print(value+ " ");
		}
		else if (dataType==CellType.BLANK)
		{
		System.out.println();
		}
		else if (dataType==CellType.BOOLEAN)
		{
		boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
		System.out.print(value+ " ");
		}
		System.out.println();
		}
		
	}
	}
}

