package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	public String url= "https://rahulshettyacademy.com/seleniumPractise/#/";
	
	public WebDriver WebDriverManager()
	{
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\chromedriver.exe"); 
			driver= new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	
}
