package org.sample;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public static WebDriver driver;

	public static void launchbrower() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}

	public static void LaunchasBrowser() {
		WebDriver driver = new ChromeDriver();
	}

	public static void windowsamximize() {
		driver.manage().window().maximize();
	}

	public static void launchurl(String Url) {
		driver.get(Url);

	}

	public static String pageurl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static String pagetitle() {
      String title = driver.getTitle();
      return title;
	}

	public static void closebrowser() {
		driver.quit();
	}

	public static void passtext(String string, WebElement ele) {
		ele.sendKeys(string);
	}
    public static void clickbutton(WebElement ele) {
    	ele.click();

	}
	public static void fileread() throws IOException {
		File f = new File("D:\\Selenium-Workspace\\MavenProject\\excel\\arthydatas.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fs);
		Sheet mysheet = book.getSheet("arthydata");
		for (int i = 0; i < mysheet.getPhysicalNumberOfRows(); i++) {
			Row myrow = mysheet.getRow(1);
			Cell mycell = myrow.getCell(0);
			System.out.println(mycell);
		}
	}

	public static void screenshotdriver(String imgname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgname.png");
		FileUtils.copyFile(screen, f);

	}

	public static Actions a;

	public static void acti(WebElement targetwebelement) {
		Actions a = new Actions(driver);
		a.moveToElement(targetwebelement).perform();;

	}

	public static void createworkbook(int rownum, int cellnum, String newdata) throws IOException {
		File f = new File("Excel location.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook book = new SXSSFWorkbook();
		Sheet mysheet = book.getSheet("newdata");
		Row myrow = mysheet.getRow(rownum);
		Cell mycell = myrow.getCell(cellnum);
		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);
	}
	public static void createNew(String sheetname,int rowname,int cellnum,String writedata) {
		File f = new File("Excel location.xlsx");
		Workbook book = new SXSSFWorkbook();
		Sheet mysheet = book.getSheet("newdata");
		Row myrow1 = mysheet.getRow(rowname);
		Cell c = myrow1.getCell(cellnum);
         int cee = c.getCellType();
                        

   
	}	
}
		