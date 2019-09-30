package base.basic.JavaPages;

import static StepDefs.hooks.browserHooks.props;


public class UrlBuilder {

    public static String getTitleParams(){return props.getProperty("title.params") ;}

    public static String getRowsParams(){return props.getProperty("rows.params") ;}

    public static String getMainParams(){return props.getProperty("main.params");}

    public static String getBaseUri() { return props.getProperty("base.uri");}

    public static String getIdParams(){return props.getProperty("id.params");}
}
