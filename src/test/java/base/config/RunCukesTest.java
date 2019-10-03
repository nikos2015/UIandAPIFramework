package base.config;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

    @RunWith(Cucumber.class)
	@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources"},
		glue = {"StepDefs"},
		tags= {"@test22"})
	
    

    public class RunCukesTest{

    
    	
}
