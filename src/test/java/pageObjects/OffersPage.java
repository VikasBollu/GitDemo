package pageObjects;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	public WebDriver driver;

	public OffersPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("tr td:nth-child(1)");
	
	
	public void searchbox(String s)
	{
		driver.findElement(search).sendKeys(s);
	}
	
	public String getSearchboxText()
	{
		return driver.findElement(search).getText();
	}
	
	public String getItemName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void SwitchToChildWindow()
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> i= windows.iterator();
		String parentwindow= i.next();
		String childwindow= i.next();
		driver.switchTo().window(childwindow);
	}
	
}
