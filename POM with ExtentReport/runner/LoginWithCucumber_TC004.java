package runner;

import org.testng.annotations.BeforeTest;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features",glue="pages",
monochrome = true, publish = true)


public class LoginWithCucumber_TC004 extends BaseClass {

	@BeforeTest
	public void setValue() {
		testAuthor="Diwan";
		testCategory="sanity";
		testDescription="Login Page";
		testName="Login";
	}
}
