package StepDefination;
 
import java.io.IOException; 
import org.junit.Assert;
import org.openqa.selenium.WebDriver; 
import Factory.BaseClass;
import POM.Searchdoctors;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
 
public class DoctorSearch {
	static WebDriver driver=BaseClass.getDriver();
	Searchdoctors sd;
	
	@Given("user is on the practo site")
	public void user_is_on_the_practo_site() throws InterruptedException {
		sd=new Searchdoctors(BaseClass.getDriver());
		Thread.sleep(3000);
	    
	}
	@When("user validate the homepage")
	public void user_validate_the_homepage() {
	    sd.ValidateHomepage();
	}
	
	@When("user click Find doctors on the header section")
	public void user_click_find_doctors_on_the_header_section() throws InterruptedException {
		//sd=new Searchdoctors(BaseClass.getDriver());
		sd.ClickFindDoctors();
	}
	@When("user Enter the location and select the location")
	public void user_enter_the_location_and_select_the_location() throws InterruptedException, IOException {
	    sd.SelectCity();
	}


	@When("user search for specialization and select")
	public void user_search_for_specialization_and_select() {
	    sd.SelectSpecializations();
	}

	@When("user choose gender in the filters")
	public void user_choose_gender_in_the_filters() throws InterruptedException {
	    sd.SelectGender();
	}
	@When("user choose patientstories in the filter")
	public void user_choose_patientstories_in_the_filter() throws InterruptedException {
	    sd.SelectPatient();
	}
	@When("user choose experience in the filter")
	public void user_choose_experience_in_the_filter() throws InterruptedException {
	   sd.SelectExperience();
	}
	@When("user choose fees and avaliable in the filter")
	public void user_choose_fees_and_avaliable_in_the_filter() throws InterruptedException {
	   sd.SelectallFilters();
	}
	@Then("user see the result")
	public void user_see_the_result() throws InterruptedException {
	   Thread.sleep(1000);
	}
	@When("user choose relevance in the filter")
	public void user_choose_relevance_in_the_filter() throws InterruptedException {
	   sd.SelectRelavance();
	}


	@Then("user print top five doctor details in the console")
	public void user_print_top_five_doctor_details_in_the_console() throws IOException {
	    sd.printdoctors();
	}
	
	
	
	
	
	
}