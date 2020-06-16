package RunnerFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

	features="Feature", glue ="Goibibo_StepDefination" , monochrome = true , plugin = {"pretty","html:test-output"})

public class Runner_Login {

}
