package base.basic.JavaPages;

import cucumber.api.Scenario;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class StepsHelper {


    public void getArticleResponse(int number, String subject) {
        Response response = getArticleResp(number,subject);
        ScenarioContext.setData(subject,response);
    }

    private Response getArticleResp(int number, String subject) {
        String params =  UrlBuilder.getMainParams() +UrlBuilder.getTitleParams()+":"+subject + UrlBuilder.getRowsParams() + number + UrlBuilder.getIdParams();
        Map<String,String> paramsMap = searchQueryParamsToMap(params);
        String baseUrl = UrlBuilder.getBaseUri();
        return getReponse(baseUrl,paramsMap);
    }

    private static Response getReponse(String baseUrl, Map<String,String> paramsMap) {
        return given().baseUri(baseUrl).params(paramsMap).urlEncodingEnabled(false).header("Accept", "application/json").log().all().when().get();
    }

    private Map<String, String> searchQueryParamsToMap(String componentQueryParams) {

        Map<String, String> queryparamMap = new HashMap<>();
        for (String param : componentQueryParams.split(";")) {
            String[] queryParams = param.split("=");
            queryparamMap.put(queryParams[0], queryParams[1]);
        }
        return queryparamMap.entrySet().stream().filter(e -> !e.getValue().equalsIgnoreCase("null")).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
    }
}
