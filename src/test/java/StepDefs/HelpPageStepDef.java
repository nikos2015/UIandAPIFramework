package StepDefs;
import base.basic.JavaPages.HelpPage;
import base.basic.JavaPages.HomePage;
import base.basic.JavaPages.Page;
import base.basic.JavaPages.QueuePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import static StepDefs.hooks.browserHooks.driver;
import static StepDefs.hooks.browserHooks.props;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class HelpPageStepDef {

    private HomePage homePage;
    private QueuePage queuePage;
    private HelpPage helpPage;

    public HelpPageStepDef (){
        homePage= new HomePage();
        queuePage = new QueuePage();
        helpPage = new HelpPage();
    }

    @Given("^I navigate to the help page url$")
    public void i_navigate_to_the_helpl_page_url() throws Throwable{
        String url = props.getProperty("help.page.url");
      helpPage.navigateToHelpUrl(url);
    }

    @And("^I search for a term (.+)$")
    public void iSearchForATerm(String term) {
        helpPage.performSearch(term);
    }

    @Then("^(.+) message should be displayed$")
    public void message_should_be_displayed(String message) {
      assertEquals(message, helpPage.messageDisplayed());
    }
}
