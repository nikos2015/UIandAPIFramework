package base.basic.JavaPages;

import static StepDefs.hooks.browserHooks.driver;

import cucumber.api.java.gl.E;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Page {
	
	public void search(By by, String searchTerm){
		driver.findElement(by).click();
		driver.findElement(by).sendKeys(searchTerm);

		driver.findElement(by).sendKeys(Keys.ENTER);
	}

	
	public boolean isElementPresent(By by){
		try{
			driver.findElement(by);
			return true;
		
	}
		catch (Exception e) {
			return false;
		}
	}
	
	public void click(WebElement element){
		element.click();
	}
	
}
