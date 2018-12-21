package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
public WebDriver driver;
	
public WebDriver initializeDriver() throws IOException {
	
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PallaviUK\\myOddscheckerTest\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("IE"))
		{
			//IE
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

}
