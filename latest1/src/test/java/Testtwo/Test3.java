package Testtwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {
	
	public WebDriver driver;
	@Test
	public void openapp7()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.com");
	}
	@Test
	public void openapp8()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.com");
	}
	@Test
	public void openapp9()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.com");
	}

}
