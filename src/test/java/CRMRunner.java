import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features ="src//test//resources//taggedFeatures//",
glue = {"stepDefs"},
monochrome = true,
		plugin ={"pretty"

		}
		)

public class CRMRunner extends AbstractTestNGCucumberTests {

}
