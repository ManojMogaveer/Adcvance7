package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emptybrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String Key = "Webdriver.chrome.driver";
		String Value = "./src/main/resources/chromedriver.exe";
		System.setProperty(Key, Value);
		WebDriver driver = new ChromeDriver();  */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		

	}

}
