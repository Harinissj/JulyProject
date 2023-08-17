package com.adactin.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AdactinBaseClass {
	
	public static WebDriver driver = null;
	@BeforeClass
	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static String excelTestData(int a, int b) {
		String value = null;
		try {
			File file = new File(
					"C:\\Users\\Sebastian M\\eclipse-workspace\\Test_Maven\\src\\test\\resources\\Test Data\\July_Offline.xlsx");
			FileInputStream fis = new FileInputStream(file);

			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(a);
			Cell cell = row.getCell(b);
			int celltype = cell.getCellType();
			if (celltype == 1) {
				value = cell.getStringCellValue();
			} else if (celltype == 0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/YYYY");
			value = s.format(dateCellValue);
			System.out.println(value);
				} else {
					double number = cell.getNumericCellValue();
					long l = (long) number;
					value = String.valueOf(l);
				}
			}
		} 
		catch (Exception e1) {
			e1.printStackTrace();
		} 
		return value;
	}
	
	public static void inputData (WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void selectDropDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public static void clickButton(WebElement element) {
		element.click();
	}
	
	public static String propertiesTestData(String key) {
		String value= null;
		try {
		File f= new File ("C:\\Users\\Sebastian M\\eclipse-workspace\\Test_Maven\\src\\test\\resources\\Test Data\\config.properties");
		FileInputStream fis= new FileInputStream(f);
		Properties p= new Properties();
		p.load(fis);
		value = p.getProperty(key);
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
		return value;
	}
	public static void screenshot() {
		Date d= new Date();
		SimpleDateFormat s = new SimpleDateFormat("ddMMM-HHmmss");
		String fileName= s.format(d)+".jpeg";
		TakesScreenshot tk= (TakesScreenshot)driver;
		File source= tk.getScreenshotAs(OutputType.FILE);
		File dest= new File ("C:\\Harini\\ScreenShot\\Adactin\\"+fileName);
		try {
			FileHandler.copy(source,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterClass
	public static void exitBrowser() {
		driver.close();
	}
}