package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.internetDynamElPage;

public class internetDynamElSteps {

internetDynamElPage inDyEl = new internetDynamElPage();

@Given("^User is on Internet Heroku App$")
public void user_is_on_internet_heroku_App() {
inDyEl.navigateToHerokuApp();
}
@Given("^is on Challenging DOM option$")
public void is_on_challenging_dom_option() {
   inDyEl.challengingDOM(); 
  
}
@When("^user is able to click on Dynamic buttons$")
public void user_is_able_to_click_on_dynamic_buttons() {
  inDyEl.displayedButtons();
}
@Then("^user clicks on dynamic buttons$")
public void user_clicks_on_dynamic_buttons() {
inDyEl.clickOnDynamicButtons();
   

}   
}
