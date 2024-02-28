
package TestRunner;

import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
 
@RunWith(Cucumber.class)

	@CucumberOptions(features={".//FeatureFile/Smoke.feature"},

	glue= {"StepDefination"},plugin=/* {"pretty","html:Reports/myreports.html",

												"rerun:target/rerun.txt",

												"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}*/

	{"pretty", "html:reports/myreportss.html",

		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

	,

	dryRun = false,

	monochrome = false,

	publish = false

	//tags = "@regression"

	)
public class Runner{
	
}
 
/*public class Runner extends AbstractTestNGCucumberTests{

}*/