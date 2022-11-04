package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
static  String	data;

public static String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("C:\\Users\\shivj\\OneDrive\\Desktop 1\\Book1.xlsx");
	Cell value = WorkbookFactory.create(f).getSheet(sheetname).getRow(row).getCell(cell);
	
	try {
		data = value.getStringCellValue();
	}
	catch(IllegalStateException ss) {
		double num = value.getNumericCellValue();
		data=String.valueOf(num);
	}
	
	return data;
	
}
public static void captureScreenSHot(WebDriver driver,int testID) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String localtime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY (HH;mm;ss)"));
	File dest=new File("C:\\Users\\shivj\\OneDrive\\Testing document\\automation\\Automation project\\screenshots\\test-"+testID+" "+localtime+".jpeg");
	FileHandler.copy(src, dest);
}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//	getExcelData("Sheet1",0,0);
	System.out.println(getExcelData("Sheet1",1,0));
}
}
