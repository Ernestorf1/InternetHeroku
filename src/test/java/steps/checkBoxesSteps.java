package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.checkBoxesPage;

public class checkBoxesSteps {

    checkBoxesPage checkBP = new checkBoxesPage();

    @Given("^user  navigates to Internet Heroku page$")
    public void user_navigates_to_Internet_Heroku_page() {
        checkBP.navigateToIntHeroku();
    }

    @When("^user clicks on checkboxes link$")
    public void user_clicks_on_checkboxes_link() {
        checkBP.clicksCheckLink();
    }

    @And("^user verify only second cb is checked$")
    public void user_verify_only_second_cb_is_checked() {
        checkBP.verifySecondCB();
    }

    @And("^user check the first one checkbox$")
    public void user_check_the_first_one_checkbox() {
        checkBP.checkFirstCB();
    }

    @Then("^user  verify both are checked$")
    public void user_verify_both_are_checked() {
        checkBP.verifyBothChecked();
    }

}