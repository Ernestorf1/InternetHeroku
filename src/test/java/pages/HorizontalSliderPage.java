package pages;

import static pages.BasePage.logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage extends BasePage {
    private String sliderOption = "/html/body/div[2]/div/ul/li[24]/a";
    private String sliderTitle = "//h3[normalize-space()='Horizontal Slider']";

    String sliderNewValue = "3.5";
    private String reSlider = "//span[@id='range']";

    public HorizontalSliderPage() {
        super(driver);
    }

    public void navigateToHero() {
        navigateTo("https://the-internet.herokuapp.com/");

    }

    public void clickSliderOp() {
   clickElement(sliderOption, "xpath");
    }


   public void dragSliderToValue() {
    // Declarar la variable slider dentro del método dragSliderToValue
    WebElement slider = Find("//*[@id=\'content\']/div/div/input", "xpath");
    if (slider != null) {
        // Si el slider se encuentra correctamente, ejecutar el script de JavaScript
        executeJavaScript(slider, "arguments[0].value = '3.5'");
    } else {
        // Si el slider no se encuentra, registrar un error
        logger.error("Slider element not found");
    }
}

    public void verifySliderValue() {

       /* String sliderActual = textFromElement(reSlider, "xpath");*/
        System.out.println(reSlider);
    }

}

