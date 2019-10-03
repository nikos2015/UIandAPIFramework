package base.config;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

    @RunWith(Cucumber.class)
	@CucumberOptions(
		features = {"src/test/resources"},
		glue = {"StepDefs"},
		tags= {"@test22"})
	
    

    public class RunCukesTest{

    
    	
}
