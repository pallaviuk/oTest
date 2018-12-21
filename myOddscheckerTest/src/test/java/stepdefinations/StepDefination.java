package stepdefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.BetSlip;
import pageobjects.Football;
import pageobjects.HomePage;
import resources.Base;

public class StepDefination extends Base{
	HomePage hp;
	Football fb;
	BetSlip bs;
	
	@Given("^initialize the browser with Firefox$")
	public void initialize_the_browser_with_Firefox() throws Throwable {
		
		driver = initializeDriver();
	 
	}

	@Given("^navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		
		driver.get(arg1);    
		
	}

	@When("^close popup$")
	public void close_popup() throws Throwable {
		
		hp = new HomePage(driver);
		hp.getPopup().click();
		
	}

	@When("^navigate to football link$")
	public void navigate_to_football_link() throws Throwable {
		
		hp.football().click();    
		
	}

	@When("^navigate to recent All Odds link$")
	public void navigate_to_recent_All_Odds_link() throws Throwable {
		
		fb = new Football(driver);
		fb.recentAllOdds().click();  
		
	}

	@When("^click on first bet in table$")
	public void click_on_first_bet_in_table() throws Throwable {
		
		fb.bet().click();  
		
	}

	@When("^enter set stake value \"([^\"]*)\" for the selected bet$")
	public void enter_set_stake_value_for_the_selected_bet(String arg1) throws Throwable {
		
		bs = new BetSlip(driver);
		bs.setStake().sendKeys(arg1);  
		
	}

	@When("^click on place bet$")
	public void click__on_place_bet() throws Throwable {
		
		bs.placeBet().click();   
		
	}

	@Then("^login option should come$")
		public void login_option_should_come() throws Throwable {
		
		Assert.assertTrue(bs.getLoginText().isDisplayed());  
		
	}

}
