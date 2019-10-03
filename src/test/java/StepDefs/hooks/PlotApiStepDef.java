package StepDefs.hooks;

import base.basic.JavaPages.CommonHelpers;
import base.basic.JavaPages.ScenarioContext;
import base.basic.JavaPages.StepsHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class PlotApiStepDef {

    private StepsHelper stepsHelper;
    private CommonHelpers commonHelpers;
    String IDS_PATH = "response.docs.id";

    public PlotApiStepDef(StepsHelper stepsHelper,CommonHelpers commonHelpers){
        this.stepsHelper = stepsHelper;
        this.commonHelpers = commonHelpers;
    }

    @Given("^I send a request to the api to get (.+) articles with (.+) in the title$")
    public void I_send_a_request_to_the_api_to_get_6_articles_with_DNA_in_the_title(int number, String subject){
        stepsHelper.getArticleResponse(number,subject);
    }

    @Then("^I should see the (\\d+) titles in the response with subject (.+)$")
    public void i_should_see_the_titles_in_the_response(int articles, String subject) {
        Response response = ScenarioContext.getData(subject);
        List<String> listOfIds = commonHelpers.getRecords(response,IDS_PATH);
        Assert.assertEquals(articles,listOfIds.size());
    }

    @And("^(\\d+) statusCode should be displayed for subject (.+)$")
    public void status_code_should_be_displayed(int statusCode, String subject) {
        Response response = ScenarioContext.getData(subject);
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @And("^I should see only articles containing (.+)$")
    public void i_should_see_only_articles_containing(String suject) {
        Response response = ScenarioContext.getData(suject);
        List<List<String>> abstractListOfLists = response.path("response.docs.abstract");
        for (List<String> eachAbstractList : abstractListOfLists) {
            for (String eachAbstract : eachAbstractList) {
                if (eachAbstract.contains(suject)) {
                    System.out.println("This is a correct article");
                }
            }
        }
    }
}

