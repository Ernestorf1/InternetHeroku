package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HorizontalSliderPage;

public class HorizontalSliderSteps {

    HorizontalSliderPage hsliderP = new HorizontalSliderPage();

    @Given("^User is on Internet heroku App$")
    public void user_is_on_Internet_heroku_App() {
        hsliderP.navigateToHero();
    }

    @Given("^user is on Horizontal Slider option$")
    public void user_is_on_horizontal_slider_option() {
        hsliderP.clickSliderOp();

    }

    @When("^user drag the slider to value$")
    public void user_drag_the_slider_to_value() {
        hsliderP.dragSliderToValue();

    }

    @Then("^user can see slider value position$")
    public void user_can_see_slider_value_position() {
        hsliderP.verifySliderValue();
        String actualPosition = "";
        String expectPosition = "3.5";

    }

}
