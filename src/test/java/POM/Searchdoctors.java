package POM;
 
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties; 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Factory.BaseClass;
import Utilities.Excel;
 
public class Searchdoctors extends BasePage {
	//WebDriver driver;
    //	Properties p;
	public Searchdoctors(WebDriver driver) {
		super(driver);
	}
	
	static String file = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Book1.xlsx";
	//Locators
	
	@FindBy(xpath="(//div[@class='product-tab__title'])[1]")
	WebElement FindDoctor;
	
	@FindBy(xpath="//input[@data-qa-id='omni-searchbox-locality']")
	WebElement locationpath;
 
	//@FindBy (xpath="//i[@class='icon-ic_cross_solid']")
	//WebElement removecross;
	
	@FindBy (xpath="//input[@data-qa-id='omni-searchbox-locality']")
	WebElement cityname;
	
	@FindBy (xpath="(//div[@data-qa-id=\"omni-suggestion-main\"])[1]")
    WebElement Selectcity;
	
	@FindBy (xpath="//input[@data-qa-id='omni-searchbox-keyword']")
	WebElement Specializationpath;
	
	@FindBy (xpath="(//div[@data-qa-id='omni-suggestion-listing'])[1]")
	WebElement Selectpecialization;
	
	@FindBy (xpath="//div[@data-qa-id='doctor_gender_section']")
	WebElement genderdropdown;
	
	@FindBy (xpath="//li[@data-qa-id='female']")
	WebElement Selectgender;
	
	@FindBy (xpath="//div[@data-qa-id='doctor_review_count_section']")
	WebElement patientstoriesdropdown;
	
	@FindBy (xpath="(//li[@role='option'])[4]")
	WebElement SelectPatientstories;
	
	@FindBy (xpath="//div[@data-qa-id='years_of_experience_section']")
	WebElement Experiencedropdown;
	
	@FindBy (xpath="(//li[@role='option'])[6]")
	WebElement SelectExperience;
	
	@FindBy (xpath="//span[@data-qa-id='all_filters']")
	WebElement Allfilersdropdown;
	
	@FindBy (xpath="(//div[@data-qa-id='Fees_radio'])[1]")
	WebElement SelectFees;
	
	@FindBy (xpath="//span[@data-qa-id='all_filters']")
	WebElement AgainclickAllfilter;
	
	@FindBy (xpath="(//div[@data-qa-id='Availability_radio'])[2]")
	WebElement SelectAvalibility;
		
	@FindBy (xpath="//span[@data-qa-id='sort_by_selected']")
	WebElement Relavancedropdown;
	
	@FindBy (xpath="//li[@data-qa-id='consultation_fees_desc']")
	WebElement SelectRelavance;
	
	By doctors = By.xpath("//div[@class='info-section']");
	
	//Actions
	public void ValidateHomepage(){
		String homepagetitle = driver.getTitle();
		System.out.println("Title of the homepage is : " + homepagetitle);
		String homepage="Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests";
		Assert.assertEquals(homepagetitle,homepage);
	}
	public void ClickFindDoctors() throws InterruptedException {
		FindDoctor.click();
		Thread.sleep(2000);
	}
	
	
	public void SelectCity() throws InterruptedException, IOException {
		locationpath.click();
		locationpath.clear();
		//removecross.click();
		String test1 = Excel.getCellData(file, "Input_data", 1, 0);
		cityname.sendKeys(test1 );
		Thread.sleep(2000);
		Selectcity.click();
	}
	public void SelectSpecializations() {
		Specializationpath.click();
		Selectpecialization.click();
	}
	
	public void SelectGender() throws InterruptedException {
		
	genderdropdown.click();
	Thread.sleep(2000);

	Selectgender.click();
	Thread.sleep(2000);
	}
	public void SelectPatient() throws InterruptedException {
	patientstoriesdropdown.click();
	Thread.sleep(2000);
	

	SelectPatientstories.click();
	Thread.sleep(2000);
	
	}
	public void SelectExperience() throws InterruptedException {
	Experiencedropdown.click();
	Thread.sleep(2000);
	
	
	SelectExperience.click();
	Thread.sleep(2000);
	
	}
	public void SelectallFilters() throws InterruptedException {
	Allfilersdropdown.click();
	Thread.sleep(2000);
	
	SelectFees.click();
	Thread.sleep(2000);
	
	
	AgainclickAllfilter.click();
	Thread.sleep(2000);
	
	
	SelectAvalibility.click();
	Thread.sleep(2000);
	}
	public void SelectRelavance() throws InterruptedException {
	Relavancedropdown.click();
	Thread.sleep(2000);
	
	
	SelectRelavance.click();
	Thread.sleep(2000);
	
	}
	
	public void printdoctors() throws IOException {
		//String file = System.getProperty(("user.dir")+"/src/test/resources/testdata/Book3.xlsx");
		List<WebElement> doc= driver.findElements(doctors);
		int count=1;
		System.out.println("Top 5 Doctors:");
		for(WebElement info:doc) {
			String str=info.getText();
			System.out.println((count)+". " +str);
			Excel.setCellData(file, "Search_Doctors", count, 0, str);
			System.out.println("***************************");
			count++;
			if(count>5) {
				break;
		}
		}
	}

	
}