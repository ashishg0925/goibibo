package RunnerFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

	features="Feature", glue ="Goibibo_StepDefination")

public class Runner_Login {

}
