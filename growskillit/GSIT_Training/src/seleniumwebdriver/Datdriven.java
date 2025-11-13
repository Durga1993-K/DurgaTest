package seleniumwebdriver;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Datdriven {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("C:\\Users\\user\\Documents\\DataDriven.xls");

		// Opening the identified Excel Sheet
		Workbook wb = Workbook.getWorkbook(f);

		// opening sheet
		Sheet S = wb.getSheet("Sheet4");

		// identifying the cell and printing the data
		// System.out.println(S.getCell(6 ,9).getContents());

//		//Identifying the rows and printing
//		int i;
//		for(i=0; i< S.getRows(); i++)
//			
//		{
//				System.out.println(S.getCell(0 ,i).getContents());
//				
//			}

		// Identifying the columns and printing
//		int i;
//		for (i = 0; i < S.getColumns(); i++)
//
//		{
//			System.out.println(S.getCell(i, 0).getContents());
//
//		}
		
		
		//Identifying the rows and columns for printing
		
		int i;
		int j;
		for(i = 0; i <S.getRows(); i++)
		{
			for(j = 0; j <S.getColumns(); j++) 
			{
				System.out.print(S.getCell(j, i).getContents() +" ");
			}
			System.out.println();
		}
	}
	
}
