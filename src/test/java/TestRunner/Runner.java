
package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = { "src//test//resources//FeatureFile" },

		glue = { "StepDefination" }, plugin = { "pretty", "html:reports/myreportss.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		dryRun = false,

		monochrome = true,

		publish = true

// tags = "@regression"

)
public class Runner extends AbstractTestNGCucumberTests{

}

