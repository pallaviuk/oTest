package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BetSlip {
	
	public WebDriver driver;
	
	public BetSlip(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		
	}
	
	
	@FindBy(xpath = "//input[@placeholder = 'Set Stake']")
	WebElement setStakeInput;
	
	@FindBy(xpath = "//button[text()='Place Bet']")
	WebElement placeBetBtn;
	
	@FindBy(xpath = "//*[text() = 'Log In']")
	WebElement loginText;
	
	

	public WebElement setStake() {
	
		return setStakeInput;
	}

	public WebElement placeBet() {
	
		return placeBetBtn;
	
	}

	public WebElement getLoginText() {
	
		return loginText;
	
	}
}
