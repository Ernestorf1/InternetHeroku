package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.switchToWindowPage;

public class switchToWindowSteps {
  switchToWindowPage switchTWP = new switchToWindowPage();

  @Given("^user is on main Page$")
  public void user_is_on_main_page() {
    switchTWP.navigateToMain();
  }

  @When("^user clicks on Multiple Windows$")
  public void user_clicks_on_multiple_windows()  {
    switchTWP.clicksMultipleWindowsOption();

  }

  @And("^user switch to a new window$")
  public void user_switch_to_a_new_window() {
    switchTWP.switchToNewWindow();

  }

  @Then("^verify user is on the new window$")
  public void verify_user_is_on_the_new_window()  {
    switchTWP.verifyOnNewWindow();
   
  }

  @And("^go back to main page$")
  public void go_back_to_main_page() throws InterruptedException {
    
    switchTWP.goBackMainPage();
    
  }

}
