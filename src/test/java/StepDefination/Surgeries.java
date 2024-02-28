package StepDefination;
 
import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver; 
import Factory.BaseClass;
import POM.PopularSurgeries;
import POM.Searchdoctors;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
 
public class Surgeries {
	static WebDriver driver=BaseClass.getDriver();
	PopularSurgeries ss;
@Given("user is on the practo page")
	public void user_is_on_the_practo_page() throws InterruptedException {
	    ss=new PopularSurgeries(BaseClass.getDriver());
		Thread.sleep(3000);
	}


@When("user clicks on surgeris on header section")
public void user_clicks_on_surgeris_on_header_section() {
	//ss=new PopularSurgeries(BaseClass.getDriver());
	ss.SurgeriesClick();
 
}
@When("user validate the surgerypage")
public void user_validate_the_surgerypage() {
    ss.validateSurgeryPage();
}

@When("user scrolldown the page")
public void user_scrolldown_the_page() {
    ss=new PopularSurgeries(BaseClass.getDriver());

    ss.Scrolldown();
}

@Then("user view the popular surgeries")
public void user_view_the_popular_surgeries() throws InterruptedException {
    Thread.sleep(2000);
}
@Then("store all the surgeries in a List and display  in the console")
public void store_all_the_surgeries_in_a_list_and_display_in_the_console() throws IOException {
    ss.SurgeriesList();
}

}


