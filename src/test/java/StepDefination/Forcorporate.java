package StepDefination;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver; 
import Factory.BaseClass;
import POM.Corporate;
import POM.PopularSurgeries;
import POM.Searchdoctors;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
 
public class Forcorporate {
	static WebDriver driver=BaseClass.getDriver();
	Corporate cc;
	
	@Given("user is on the practo website")
	public void user_is_on_the_practo_website() throws InterruptedException {
		cc=new Corporate(BaseClass.getDriver());
		Thread.sleep(3000);
	
	}

	@When("user clicks on corporate on the header section")
	public void user_clicks_on_corporate_on_the_header_section() {
		//cc=new Corporate(BaseClass.getDriver());
		cc.Forcorporate();
	}

	@When("user clicks on Health and Wellness plans")
	public void user_clicks_on_health_and_wellness_plans() {
		cc.Healthclick();
	    
	}
	@When("user validate the corporatepage")
	public void user_validate_the_corporatepage() {
	    cc.validateCorporatePage();
	}

@When("user enter Details Without Providing Name")
public void user_enter_details_without_providing_name() throws IOException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	cc.WithoutName();
}
@When("user enter Details Without providing organization Name")
public void user_enter_details_without_providing_organization_name() throws IOException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	cc.WithoutOrgName();
}
@When("user enter Details With wrong contact number")
public void user_enter_details_with_wrong_contact_number() throws IOException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	cc.WrongNumber();
}
@When("user enter Details With wrong email id")
public void user_enter_details_with_wrong_email_id() throws IOException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	cc.WrongEmailId();
}

@Then("user enter the Fullvalid Details")
public void user_enter_the_fullvalid_details() throws IOException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	cc.FullValid();
}



	@When("user enter the invalid details in the schedule demo")
	public void user_enter_the_invalid_details_in_the_schedule_demo() throws IOException {
		cc.InvalidDetails();
	    
	}

	@When("user verify the schedule demo button is enabled or not")
	public void user_verify_the_schedule_demo_button_is_enabled_or_not() throws InterruptedException {
		cc.VerifyScheduleDemo();
	    
	}

	@Then("user enter the valid details")
	public void user_enter_the_valid_details() throws IOException {
		cc.ValidDetails();
	    
	}

	@Then("verify it is enabled or not and click the button")
	public void verify_it_is_enabled_or_not_and_click_the_button() throws InterruptedException {
		cc.validateScheduleDemo();
	    
	}

	@Then("print the Thankyou information")
	public void print_the_thankyou_information() throws InterruptedException {
	    cc.Proceedtosubmit();
	    Thread.sleep(2000);
	}

	@Then("user take screenshot on the Thankyou page")
	public void user_take_screenshot_on_the_thankyou_page() throws HeadlessException, IOException, AWTException {
		cc.screenshot();
	}
	


}
