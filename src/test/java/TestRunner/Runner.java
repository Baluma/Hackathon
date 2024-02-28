
package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = { "src//test//resources//FeatureFile//Smoke.feature" },

		glue = { "StepDefination" }, plugin = { "pretty", "html:reports/myreportss.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		dryRun = false,

		monochrome = false,

		publish = false

// tags = "@regression"

)
public class Runner extends AbstractTestNGCucumberTests{

}

