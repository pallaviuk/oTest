package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Football {
	
	public WebDriver driver;
	
	//Constructor
	public Football(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}

	
	@FindBy(xpath = "(//span[text() = 'All Odds'])[1]")
	WebElement recentAllOddsLink;
	
	@FindBy(xpath = "(//div[@id = 'oddsTableContainer']/table/tbody/tr/td/p)[1]")
	WebElement liverpoolBet365;
	

	
	public WebElement recentAllOdds() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(250, 400)");
		return recentAllOddsLink;
		
	}
	
	public WebElement bet() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(250, 400)");
		return liverpoolBet365;
		
	}
	
}
