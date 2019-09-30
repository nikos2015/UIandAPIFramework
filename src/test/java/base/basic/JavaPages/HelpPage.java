package base.basic.JavaPages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

import static StepDefs.hooks.browserHooks.driver;

public class HelpPage extends  Page {
    private static final By HELP_SEARCH_BAR= By.cssSelector("input[type='search']");
    private static final  By SEARCH_RESULTS_BANNER =By.cssSelector("header.page-header h1");


    public void navigateToHelpUrl(String url){
        driver.navigate().to(url);
    }


    public void performSearch(String term) {
        search(HELP_SEARCH_BAR,term);
    }

    public String messageDisplayed() {
        String text = driver.findElement(SEARCH_RESULTS_BANNER).getText();
        return text;
    }
}
