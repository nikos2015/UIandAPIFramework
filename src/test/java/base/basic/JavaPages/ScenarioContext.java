package base.basic.JavaPages;

import java.util.*;
public class ScenarioContext {
    private static ThreadLocal<HashMap<String, Object>> sessionData = new ThreadLocal<HashMap<String, Object>>() {
        @Override
        protected HashMap<String, Object> initialValue() {
            return new HashMap<>();
        }
    };

    public static <T> void setData(String key, Object value) { Object put = sessionData.get().put(key, value); }

    public static <T> T getData(final String key){ return (T) sessionData.get().get(key);}
}