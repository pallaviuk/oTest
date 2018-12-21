
Feature: Placing bet
 
  Scenario: Place bet on Liverpool bet365
    Given initialize the browser with Firefox
    And navigate to "https://www.oddschecker.com/" site
    When close popup
    And navigate to football link
    And navigate to recent All Odds link
    And click on first bet in table
    And enter set stake value "11" for the selected bet
    And click on place bet
    Then login option should come
    
 


