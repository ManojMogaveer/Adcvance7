package Organisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Generic_Utillity.ExcelUtillity;
import Generic_Utillity.FileUtillity;
import Generic_Utillity.JavaUtillity;

public class CreateOrganizationTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	
			WebDriver driver=new ChromeDriver();
			
			FileUtillity flib = new FileUtillity();
			String URL = flib.getKeyAndValue("url");
			String USERNAME = flib.getKeyAndValue("username");
			String PASSWORD = flib.getKeyAndValue("password");
			
			
		/*	FileInputStream fis = new FileInputStream("./src/test/resources/AdvSelcomData.properties");
			Properties pro = new Properties();
			pro.load(fis);
			String URL = pro.getProperty("url");
			String USERNAME = pro.getProperty("username");
			String PASSWORD = pro.getProperty("password");
			
		*/
			driver.get(URL);
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			driver.findElement(By.id("submitButton")).click();
			driver.findElement(By.linkText("Organizations")).click();
			driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			
		//	Random ran = new Random();
		 // int ranNum = ran.nextInt(1000);
			
			JavaUtillity jlib = new JavaUtillity();
			int ranNum =jlib.getRandomNum();
			
		//	FileInputStream fes = new FileInputStream("./src/test/resources/AdvSelenium7to9am.xlsx");
		//	Workbook book = WorkbookFactory.create(fes);
		//	Sheet sheet = book.getSheet("Organization");
		//	Row row = sheet.getRow(0);
		//     Cell cell = row.getCell(0);
		 //   String OrgName = cell.getStringCellValue()+ranNum;
		//    driver.findElement(By.name("accountname")).sendKeys(OrgName);
		 //   Thread.sleep(2000);
		     
		     
		     ExcelUtillity elib = new ExcelUtillity();
		 
		   String OrgName = elib.getExcelData("Organization", 0, 0)+ranNum;
		   driver.findElement(By.name("accountname")).sendKeys(OrgName);
		    Thread.sleep(2000); 
		  
		    
		    
		     
		 //   FileInputStream fes2 = new FileInputStream("./src/test/resources/AdvSelenium7to9am.xlsx");
		//	Workbook book2 = WorkbookFactory.create(fes2);
		  //  Sheet sheet2 = book2.getSheet("Organization");
		 //  Row row2 = sheet2.getRow(1);
		//    Cell cell2 = row2.getCell(0);
		 //   DataFormatter format = new DataFormatter();
		//	String orgNum = format.formatCellValue(cell2);
		//	driver.findElement(By.id("phone")).sendKeys(orgNum);
		    
			//  Thread.sleep(2000);
		//  FileInputStream fes1 = new FileInputStream("./src/test/resources/AdvSelenium7to9am.xlsx");
		//	Workbook book1 = WorkbookFactory.create(fes1);
		//    Sheet sheet1 = book1.getSheet("Organization");
		//    Row row1 = sheet1.getRow(2);
		//    Cell cell1 = row1.getCell(0);
		//    String orgEmail = format.formatCellValue(cell1);
		//    driver.findElement(By.id("email1")).sendKeys(orgEmail);
			
		    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		    
		    Thread.sleep(2000);
		/*	WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions act = new Actions(driver);
			act.moveToElement(element).click().perform();
			driver.findElement(By.linkText("Sign Out")).click();*/
			
		    driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		    driver.findElement(By.linkText("Sign Out")).click();
			}
		

		
		
		
		
		
		
	}


