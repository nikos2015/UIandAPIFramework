package base.basic.JavaPages;

import static StepDefs.hooks.browserHooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends Page{

	private static final By HOME_PAGE_WELCOME_BANNER = By.cssSelector("div h1");
	private static final By EMAIL_ADDRESS_SPACE = By.cssSelector("div.et_pb_text_2 input");
	private static final By SUBMIT_BUTTON = By.cssSelector("div.et_pb_text_2.green button");

	public boolean homePAgeBannerisDisplayed() {
		return isElementPresent(HOME_PAGE_WELCOME_BANNER);
	}

	public void enterEmail() {
		WebElement element = driver.findElement(EMAIL_ADDRESS_SPACE);
		element.click();
		element.sendKeys("sofianosniko@gmail.com");
		driver.findElement(SUBMIT_BUTTON).click();
	}
}
