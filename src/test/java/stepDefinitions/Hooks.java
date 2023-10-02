package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testContextSetup;
	public WebDriver driver;
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.driver= testContextSetup.testbase.WebDriverManager();
	}

	@After
	public void AfterScenario() {
		driver.quit();
	}
	@AfterStep
	public void Screenshot(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent= FileUtils.readFileToByteArray(srcfile);
			scenario.attach(filecontent, "image/png", "image");
		}
	}
	

}
