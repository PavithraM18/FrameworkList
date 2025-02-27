package dataDriven.excelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel {

	@Test
	public void getData() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\pavithra.mathivanan\\OneDrive - InnovaSolutions\\eclipse-workspace\\SampleFiles\\excelDriven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		XSSFRow row = sheet.getRow(0);
		int columCount = row.getLastCellNum();
		Object data[][] =  new Object[rowCount-1][columCount];
		for(int i = 0;i<rowCount-1; i++)
		{
			//System.out.println("Outer loop started:");
			row = sheet.getRow(i+1);
			for (int j=0;j<columCount;j++)
			{
				System.out.println(row.getCell(j));
			}
		//	System.out.println("Outer loop Ended here");
		}
	}
}
