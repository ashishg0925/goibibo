package RunnerFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Feature\\Login.feature", glue = "src\\test\\java\\Goibibo_StepDefination")

public class login_Goibibo {

}
