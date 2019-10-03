package StepDefs;

import base.basic.JavaPages.HomePage;

import base.basic.JavaPages.QueuePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static StepDefs.hooks.browserHooks.driver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStepDef {
	
	private HomePage homePage;
	private QueuePage queuePage;
	
	public HomePageStepDef (){
		homePage= new HomePage();
		 queuePage = new QueuePage();
	}


	@Given("^user needs to be on home page$")
	public void User_needs_to_be_on_home_page(){
//		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver.get("https://www.payzilch.com/");	
		homePage.homePAgeBannerisDisplayed();
	}

	@When("^I enter my email$")
	public void I_enter_my_email(){
		homePage.enterEmail();
	}

	@Then("^(.+) is displayed$")
	public void waitingListPageIsDisplayed(String page) {
		switch (page.toUpperCase()) {
			case "waiting list page":
				queuePage.queueMessageisDisplayed();
				break;
			case "other page":
				System.out.println("This is the wrong page");
				break;
		}
	}
}
