package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Landingpage {
	public WebDriver driver;
	public Landingpage(WebDriver driver){
		this.driver=driver;
	}
	private By search=  By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("h4.product-name");
	private By topDeals = By.linkText("Top Deals");
	
	public void searchitem(String product)
	{
		driver.findElement(search).sendKeys(product);
	}
	public String gettitle()
	{
		return driver.getTitle();
	}
	public String getproductname()
	{
		return driver.findElement(productName).getText();
	}
	public void clickTopDeals()
	{
		 driver.findElement(topDeals).click();
	}
	public String extractproductname(String productName)
	{
		return productName=productName.split("-")[0].trim();
	}
}
