package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src//test//resources//Features",
glue = {"stepDefs"},
monochrome = true,
		plugin ={"pretty"

		}
		)
public class ParallelRunner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel=true)
	public Object[][] Scenarios()
	{
		return super.scenarios();
	}

}
