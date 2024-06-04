package steps;




import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginInternetPage;

public class loginInternetSteps {
    loginInternetPage  loginIP = new loginInternetPage();
@Given("^user is on Internet heroku Page$")
public void user_is_on_internet_heroku_page() {
    loginIP.navigateToInternetHeroku();

}
@When("^user clicks on auth option$")
public void user_clicks_on_auth_option() {
   loginIP.clickOnAuth();

}
@When("user input valid credentials ([^\"]*) ([^\"]*)$")
public void user_input_valid_credentials(String username, String password) {
    loginIP.inputValidCredentials(username, password);
}
@Then("^user should see welcome message$")
public void user_should_see_welcome_message() {
   loginIP.welcomeMessage();
   
}

    
    
}
