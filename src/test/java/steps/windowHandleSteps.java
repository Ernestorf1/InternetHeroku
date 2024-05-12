package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.windowHandlePage;

public class windowHandleSteps {
    windowHandlePage windowHP = new windowHandlePage();
  @Given("^user  navigates to Internet Heroku app page$")
public void user_navigates_to_internet_heroku_app_page() {
   windowHP.navigateToInternetHeroku();
}
@When("^user navigates to Multiple Windows page$")
public void user_navigates_to_multiple_windows_page() {
   windowHP.naviagetToMultipleWindow();
}

@Then("^user clicks on the new link$")
public void user_clicks_on_the_new_link() {
    windowHP.clicksOnNewWindowLink();
}
@Then("^should be two open Windows$")
public void should_be_two_open_windows() {
  windowHP.isNewOpenedWindow();
}
@And ("^user can see a new window with specific title$")
public void user_can_see_a_new_window_with_specific_title(){
   windowHP.isTitlePresent();
}
@When("^user close the second window$")
public void user_close_the_second_window() {
   windowHP.closeNewWindow();
}
@Then("^must be one window open$")
public void must_be_one_window_open() {
   windowHP.isOneWindowOpened();
}
@Then("^user is on the principal window$")
public void user_is_on_the_principal_window() {
   windowHP.isUserOnPrincipalPage();
}  
    
}
