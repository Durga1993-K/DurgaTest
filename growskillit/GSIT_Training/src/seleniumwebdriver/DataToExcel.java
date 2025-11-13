package seleniumwebdriver;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DataToExcel {
	
	public static void main(String[] args) throws Exception {
	
		FileOutputStream f =new FileOutputStream("C:\\Users\\user\\Documents\\JUNE.xls");
		
		WritableWorkbook wb = Workbook.createWorkbook(f);
		
		WritableSheet s = wb.createSheet("Result", 1);
		
		int a= 10; int b= 20;
		
		int c =a*b;
		
		Label l =new Label (0,0,"c values is" +c);
		
		s.addCell(l);
		
		wb.write();
		wb.close();
		
		System.out.println("Excel printed successfully");
	}

}
