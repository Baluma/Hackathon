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
 
public class PopularSurgeries extends BasePage {
	//WebDriver driver;
    //	Properties p;
	public PopularSurgeries(WebDriver driver) {
		super(driver);
	}
	static String file = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Book1.xlsx";

	//Locators
	
	@FindBy(xpath="(//div[@class='product-tab__title'])[5]")
	WebElement ClickSurgeries;
 	
	By surgeries = By.xpath("//h1[text()='Popular Surgeries']");
	
	By ListOfSurgeries  = By.xpath("//p[@class='mt-12px AilmentItem-module_itemText__XvCHL']");

   //Actions
   public void SurgeriesClick() {
	   ClickSurgeries.click();   
   }
   public void validateSurgeryPage(){
		String surgeriesPage = driver.getTitle();
		System.out.println("Title of the diagnostic page is: " + surgeriesPage);
		String title1 = "Practo Care Surgeries | End to end care from top surgeons in your city";
		Assert.assertEquals(surgeriesPage, title1, "User navigated to correct page");
		System.out.println("User navigated to correct page");
	}
   public void Scrolldown() {
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement surger = driver.findElement(surgeries);
		js.executeScript("arguments[0].scrollIntoView();", surger);
   }
   public void SurgeriesList() throws IOException {
	   
   List<WebElement> sur=driver.findElements(ListOfSurgeries);
   System.out.println("List Of Surgeries");
   for(int i=1;i<=sur.size();i++) {
	   String h=driver.findElement((By.xpath("(//p[@class='mt-12px AilmentItem-module_itemText__XvCHL'])["+i+"]"))).getText();
	   System.out.println((i)+". " +h);
	   Excel.setCellData(file, "popular_surgeries",i , 0, h);
//       for(WebElement info:sur) {
//		String str=info.getText();
//       System.out.println(str);
      // Excel.setCellData(file, "Sheet1", , 0, str);
       
       }
   }
}
