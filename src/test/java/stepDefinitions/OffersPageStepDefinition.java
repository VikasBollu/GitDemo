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
public class OffersPageStepDefinition {
	public WebDriver driver;
	String landingpageextractedname;
	String offerpageextractedname;
	Landingpage landingpage;
	OffersPage offersPage;
	TestContextSetup testContextSetup;
	PageObjectManager pom;
	public OffersPageStepDefinition(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		this.driver=testContextSetup.testbase.WebDriverManager();
		this.landingpage= testContextSetup.pom.getLandingPage();
		this.offersPage= testContextSetup.pom.getOffersPage();
	
	}
	

	@Then("^User clicked on the top deals link and search the product name (.+) and extracted the name of the product from table.$")
	public void user_clicked_on_the_top_deals_link_and_search_the_product_name_and_extracted_the_name_of_the_product_from_table(String name) throws InterruptedException {
		landingpage.clickTopDeals();
		offersPage.SwitchToChildWindow();
		offersPage.searchbox(name);
		Thread.sleep(2000);
		offerpageextractedname= offersPage.getItemName();
		System.out.println(offerpageextractedname);
	}
	@Then("Validate the product name matches with the offers page and landing page.")
	public void validate_the_product_name_matches_with_the_offers_page_and_landing_page() {
	   Assert.assertEquals(testContextSetup.landingpageextractedname, offerpageextractedname);
	   System.out.println("Test executed successfully");
	}

}
