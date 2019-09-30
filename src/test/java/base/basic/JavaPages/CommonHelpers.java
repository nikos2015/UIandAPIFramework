package base.basic.JavaPages;

import io.restassured.response.Response;

import java.util.List;

public class CommonHelpers {

    public  List<String> getRecords(Response response, String path){
        List<String> listIds = response.path(path);
        return  listIds;
    }
}
