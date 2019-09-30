package base.basic.JavaPages;
import org.openqa.selenium.By;

import static StepDefs.hooks.browserHooks.driver;



public class QueuePage extends Page{

private static final  By QUEUE_MESSAGE_BANNER = By.cssSelector(".et_pb_text_0");


    public  boolean queueMessageisDisplayed() {
        return isElementPresent(QUEUE_MESSAGE_BANNER);
    }
}
