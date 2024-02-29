package POM;
 
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import javax.imageio.ImageIO;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Factory.BaseClass;
import Utilities.Excel;
 
public class Corporate extends BasePage {
	// WebDriver driver;
    //	Properties p;
	public Corporate(WebDriver driver) {
		super(driver);
	}
	
	static String file = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Book1.xlsx";

	//Locators
	
	@FindBy(xpath="//span[@class='nav-interact']")
	WebElement corporatedropdown;
 
	@FindBy (xpath="(//div[@class='u-d-item'])[1]")
	WebElement selectHealthplans;
	
	@FindBy (xpath="//input[@id='name']")
	WebElement EnterName;
	
	@FindBy (xpath="//input[@id='organizationName']")
	WebElement EnterOrganizationName;
	
	@FindBy (xpath="//input[@id='contactNumber']")
	WebElement EnterContactNumber;
	
	@FindBy (xpath="//input[@id='officialEmailId']")
	WebElement EnterEmailid;
	
	By  SelectOrgsize = By.xpath("//select[@id='organizationSize']");
	
	By  SelectInterestIn = By.xpath("//select[@id='interestedIn']");
	
	By  verifyButton = By.xpath("//button[@type='submit']");
	
	@FindBy (xpath="//input[@id='contactNumber']")
	WebElement ClearContactNum;
	
	@FindBy (xpath="//input[@id='contactNumber']")
	WebElement ReEntercontactNum;
	
	@FindBy (xpath="//input[@id='officialEmailId']")
	WebElement ClearEmailId;
	
	@FindBy (xpath="//input[@id='officialEmailId']")
	WebElement ReEnterEmailId;
	
	By  validateButton = By.xpath("//button[@type='submit']");
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement ClickSchedule;
	
	By Getinfo = By.xpath("(//div[@class='u-text--bold text-alpha'])[1]");
	
	@FindBy (xpath="(//div[@class='u-m-t--10'])[1]")
	WebElement Parainfo;
			
//Actions
public void Forcorporate() {
	JavascriptExecutor os=(JavascriptExecutor) driver;
    os.executeScript("window.scrollBy(0,-350)");
    corporatedropdown.click();
   
}
public void Healthclick() {
	selectHealthplans.click();	
}
public void validateCorporatePage() {
	String title = driver.getTitle();
	System.out.println("corporates page title is : " + title);
	String text = "Employee Health | Corporate Health & Wellness Plans | Practo";
	Assert.assertEquals( title,text,"Directed to correct page");
	System.out.println("Directed to correct page");
}
public void FullValid() throws IOException {
	String test2 = Excel.getCellData(file, "Input_data", 1, 1);
	EnterName.sendKeys(test2);
	String test3 = Excel.getCellData(file, "Input_data", 1, 2);
	EnterOrganizationName.sendKeys(test3);
	String test8 = Excel.getCellData(file, "Input_data", 1, 7);
	ReEntercontactNum.sendKeys(test8);
	String test9 = Excel.getCellData(file, "Input_data", 1, 8);
	ReEnterEmailId.sendKeys(test9);
	String test6 = Excel.getCellData(file, "Input_data", 1, 5);
	WebElement drop1=driver.findElement(SelectOrgsize);
    Select orgsize=new Select(drop1);
    orgsize.selectByVisibleText(test6);
    String test7 = Excel.getCellData(file, "Input_data", 1, 6);
    WebElement drop2=driver.findElement(SelectInterestIn);
    Select interest=new Select(drop2);
    interest.selectByVisibleText(test7); 
}
public void WithoutName() throws IOException {
	String test3 = Excel.getCellData(file, "Input_data", 1, 2);
	EnterOrganizationName.sendKeys(test3);
	String test8 = Excel.getCellData(file, "Input_data", 1, 7);
	ReEntercontactNum.sendKeys(test8);
	String test9 = Excel.getCellData(file, "Input_data", 1, 8);
	ReEnterEmailId.sendKeys(test9);
	String test6 = Excel.getCellData(file, "Input_data", 1, 5);
	WebElement drop1=driver.findElement(SelectOrgsize);
    Select orgsize=new Select(drop1);
    orgsize.selectByVisibleText(test6);
    String test7 = Excel.getCellData(file, "Input_data", 1, 6);
    WebElement drop2=driver.findElement(SelectInterestIn);
    Select interest=new Select(drop2);
    interest.selectByVisibleText(test7); 
}
public void WithoutOrgName() throws IOException {
	String test2 = Excel.getCellData(file, "Input_data", 1, 1);
	EnterName.sendKeys(test2);
	String test8 = Excel.getCellData(file, "Input_data", 1, 7);
	ReEntercontactNum.sendKeys(test8);
	String test9 = Excel.getCellData(file, "Input_data", 1, 8);
	ReEnterEmailId.sendKeys(test9);
	String test6 = Excel.getCellData(file, "Input_data", 1, 5);
	WebElement drop1=driver.findElement(SelectOrgsize);
    Select orgsize=new Select(drop1);
    orgsize.selectByVisibleText(test6);
    String test7 = Excel.getCellData(file, "Input_data", 1, 6);
    WebElement drop2=driver.findElement(SelectInterestIn);
    Select interest=new Select(drop2);
    interest.selectByVisibleText(test7); 
}

public void WrongNumber() throws IOException {
	String test2 = Excel.getCellData(file, "Input_data", 1, 1);
	EnterName.sendKeys(test2);
	String test3 = Excel.getCellData(file, "Input_data", 1, 2);
	EnterOrganizationName.sendKeys(test3);
	String test4 = Excel.getCellData(file, "Input_data", 1, 3);
	EnterContactNumber.sendKeys(test4);
	String test9 = Excel.getCellData(file, "Input_data", 1, 8);
	ReEnterEmailId.sendKeys(test9);
	String test6 = Excel.getCellData(file, "Input_data", 1, 5);
	WebElement drop1=driver.findElement(SelectOrgsize);
    Select orgsize=new Select(drop1);
    orgsize.selectByVisibleText(test6);
    String test7 = Excel.getCellData(file, "Input_data", 1, 6);
    WebElement drop2=driver.findElement(SelectInterestIn);
    Select interest=new Select(drop2);
    interest.selectByVisibleText(test7); 
}
public void WrongEmailId() throws IOException {
	String test2 = Excel.getCellData(file, "Input_data", 1, 1);
	EnterName.sendKeys(test2);
	String test3 = Excel.getCellData(file, "Input_data", 1, 2);
	EnterOrganizationName.sendKeys(test3);
	String test8 = Excel.getCellData(file, "Input_data", 1, 7);
	ReEntercontactNum.sendKeys(test8);
	String test5 = Excel.getCellData(file, "Input_data", 1, 4);
	EnterEmailid.sendKeys(test5);
	String test6 = Excel.getCellData(file, "Input_data", 1, 5);
	WebElement drop1=driver.findElement(SelectOrgsize);
    Select orgsize=new Select(drop1);
    orgsize.selectByVisibleText(test6);
    String test7 = Excel.getCellData(file, "Input_data", 1, 6);
    WebElement drop2=driver.findElement(SelectInterestIn);
    Select interest=new Select(drop2);
    interest.selectByVisibleText(test7); 
}

public void InvalidDetails() throws IOException {
	String test2 = Excel.getCellData(file, "Input_data", 1, 1);
	String test3 = Excel.getCellData(file, "Input_data", 1, 2);
	String test4 = Excel.getCellData(file, "Input_data", 1, 3);
	String test5 = Excel.getCellData(file, "Input_data", 1, 4);
	String test6 = Excel.getCellData(file, "Input_data", 1, 5);
	String test7 = Excel.getCellData(file, "Input_data", 1, 6);
	
	EnterName.sendKeys(test2);
	EnterOrganizationName.sendKeys(test3);
	EnterContactNumber.sendKeys(test4);
	EnterEmailid.sendKeys(test5);
	WebElement drop1=driver.findElement(SelectOrgsize);
    Select orgsize=new Select(drop1);
    orgsize.selectByVisibleText(test6);
    WebElement drop2=driver.findElement(SelectInterestIn);
    Select interest=new Select(drop2);
    interest.selectByVisibleText(test7);   
}

public void VerifyScheduleDemo() throws InterruptedException {
	WebElement element1 = driver.findElement(verifyButton );
    if(element1.isEnabled()) {
        System.out.println("Schedule demo is enable.");
    } else {
        System.out.println("Schedule demo is disabled.");
    }
    Thread.sleep(2000);
}

public void ValidDetails() throws IOException {
	String test8 = Excel.getCellData(file, "Input_data", 1, 7);
	String test9 = Excel.getCellData(file, "Input_data", 1, 8);
	ClearContactNum.clear();
	ReEntercontactNum.sendKeys(test8);
	ClearEmailId.clear();
	ReEnterEmailId.sendKeys(test9);	
}

public void validateScheduleDemo() throws InterruptedException {
	WebElement element2 = driver.findElement(validateButton);
    if(element2.isEnabled()) {
        System.out.println("Schedule demo is enable.");
    } else {
        System.out.println("Schedule demo is disabled.");
    }
    ClickSchedule.click();
    Thread.sleep(15000);
}

public void Proceedtosubmit() throws InterruptedException {
	//ClickSchedule.click();
	//Thread.sleep(15000);
	WebElement info=driver.findElement(Getinfo);
	if(info.isDisplayed())
	{
		System.out.println("Displayed:" + info.getText());
	}
	else {
		System.out.println("Not Displayed");
	}
	String End=Parainfo.getText();
	System.out.println(End);
	Thread.sleep(2000);
}
public void screenshot() throws IOException, HeadlessException, AWTException {
	BufferedImage img1=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	ImageIO.write(img1, "png", new File("C:\\Users\\2303909\\eclipse-workspace\\hacathonproject\\src\\test\\java\\Screenshotss\\errormsg.png"));

}
}
	
