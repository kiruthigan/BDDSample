package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src//test//resources//Features//UserLogin.feature",
glue = {"stepDefs"}


		

		
		)

public class UserLoginRunner extends AbstractTestNGCucumberTests {

}
