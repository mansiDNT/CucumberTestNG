package MyRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/java/Features", glue = {
		"StepDefinitions" }, plugin = "json:target/cucumber-reports/CucumberTestReport.json")
//,tags= {"~@Ignore"},

public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeTest(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "scenarios")
	public void scenario(PickleWrapper pickle, FeatureWrapper cucumberfeature) {
		testNGCucumberRunner.runScenario(pickle.getPickle());
	}

	@DataProvider
	public Object[][] scenarios() {
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
	}

}
