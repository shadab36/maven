package webApp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "." },tags={"@signupvalidation"},format={"pretty","html:target"})
public class SivviRunner {

}
