package Factory;
 
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import POM.Corporate;
import io.cucumber.core.logging.Logger;
public class BaseClass {
		public static WebDriver driver;
		public Corporate cop;
		static Properties p;
		

			public  static WebDriver initializeBrowser() throws IOException
			{
				if (getProperties().getProperty("execution_env").equalsIgnoreCase("remote")) {
					DesiredCapabilities capabilities = new DesiredCapabilities();
					if (getProperties().getProperty("os").equalsIgnoreCase("windows")) {
					    capabilities.setPlatform(Platform.WIN11);
					} else if (getProperties().getProperty("os").equalsIgnoreCase("mac")) {
					    capabilities.setPlatform(Platform.MAC);
					} else {
					    System.out.println("No matching OS..");
					      }
					// browser
					switch (getProperties().getProperty("browser").toLowerCase()) {
						case "chrome":
							capabilities.setBrowserName("chrome");
							break;
						case "firefox":
							capabilities.setBrowserName("firefox");
							break;
						default:
							capabilities.setBrowserName("edge");
							break;
					}
		 
					driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		 
				} else if (getProperties().getProperty("execution_env").equalsIgnoreCase("local")) {
					switch(getProperties().getProperty("browser").toLowerCase()) 
					{
					case "chrome":
				        driver=new ChromeDriver();
				        break;
				    case "edge":
				    	driver=new EdgeDriver();
				        break;
				    case "firefox": 
				    	driver=new FirefoxDriver();
				    	break;
				    default:
				        System.out.println("No matching browser");
				        driver=null;
					}
				}
				// driver.manage().deleteAllCookies(); 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
				 return driver;
					
			}
			public static WebDriver getDriver() {
				return driver;
			}
		public static Properties getProperties() throws IOException
		{		 
		    FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		    p=new Properties();
			p.load(file);
			return p;
		}
		
}