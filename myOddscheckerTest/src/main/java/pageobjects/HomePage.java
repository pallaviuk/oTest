package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;	
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(linkText = "Football")
	WebElement footballLink;
	
	@FindBy(xpath="//div[@id='promo-modal']/div/div/span")
	WebElement popupClose;
	

	
	public WebElement getPopup() {
		
		return popupClose;
		
	}
	
	public WebElement football() {
		
		return footballLink;
		
	}

}
