package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public Landingpage landingPage;
	public OffersPage offerspage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public Landingpage getLandingPage()
	{
	
	 landingPage= new Landingpage(driver);
	 return landingPage;
	}
	public OffersPage getOffersPage()
	{
		offerspage = new OffersPage(driver);
		return offerspage;
	}
}
