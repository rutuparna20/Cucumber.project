package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "Features/titleVerification.feature"
  ,glue={"stepDefs"}
  //tags="@regression"
  )
public class testRunner {

}
