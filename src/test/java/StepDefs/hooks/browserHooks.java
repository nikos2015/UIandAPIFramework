package StepDefs.hooks;

import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class browserHooks {

    public static WebDriver driver;
    public static Properties props;
    public static String filePath;

    public  browserHooks(){

        props = new Properties();
        filePath = new File("").getAbsolutePath();
    }

    @Before
    public static void setUp() {
        try {
            String directory = filePath + "/src/test/java/base/config/" + System.getProperty("site", "zilch") + ".properties";
          // locates the actual file and reads it into memory
            FileInputStream ip = new FileInputStream(directory);
            props.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browserName = System.getProperty("browser", "chrome");

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }  else {
            System.out.println("Error: Browser not supported!");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public static void closeDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
