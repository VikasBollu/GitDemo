package utils;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public TestBase testbase;
	public PageObjectManager pom;
	public String landingpageextractedname;
	public TestContextSetup()
	{
		testbase = new TestBase();
		pom = new PageObjectManager(testbase.WebDriverManager());
	}

}
