package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Landingpage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;
public class LandingPageStepDefination {
	public WebDriver driver;
	String landingpageextractedname;
	String offerpageextractedname;
	Landingpage landingpage;
	OffersPage offersPage;
	TestContextSetup testContextSetup;
	PageObjectManager pom;
	public LandingPageStepDefination(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		this.driver=testContextSetup.testbase.WebDriverManager();
		this.landingpage= testContextSetup.pom.getLandingPage();

	
	}
	
	@Given("User is on Greenkart Landing page")
	public void user_is_on_greenkart_landing_page() {
		
		Assert.assertTrue(landingpage.gettitle().contains("GreenKart"));
		
	}
	@When("^User searched with the product name (.+) in textbox and extracted the actual name of the product from search.$")
	public void user_searched_with_the_product_name_in_textbox_and_extracted_the_actual_name_of_the_product_from_search(String product) throws InterruptedException {
		landingpage.searchitem(product);
		Thread.sleep(2000);
		testContextSetup.landingpageextractedname=landingpage.extractproductname(landingpage.getproductname());
	    System.out.println(testContextSetup.landingpageextractedname);
	    System.out.println("Testing giiiiiiiiiiiiiiiiiit");
	}
	
}
