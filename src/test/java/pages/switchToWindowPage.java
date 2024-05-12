package pages;

import org.checkerframework.checker.units.qual.s;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;


public class switchToWindowPage extends BasePage {
    private String multipleWindowOption = "//*[@id=\'content\']/ul/li[33]/a";
    private String switchWindowLink = "//*[@id=\'content\']/div/a";
    private String newWindowTitle = "/html/body/div/h3";
    private String firstWindowHandle;
    private String newWindowHandle;

    public switchToWindowPage() {
        super(driver);

    }

    public void navigateToMain() {
        navigateTo("https://the-internet.herokuapp.com/");
        
    }

    public void clicksMultipleWindowsOption() {
        clickElement(multipleWindowOption, "xpath");
    }

    public void switchToNewWindow() {
        
        clickElement(switchWindowLink, "xpath");

        // Esperar a que se abra una nueva ventana
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

   

    }

    public void verifyOnNewWindow() {      
        Assert.assertTrue("New Window", true);
        newWindowHandle = driver.getWindowHandle();
    }

    public void goBackMainPage() throws InterruptedException {
      
       
        driver.switchTo().defaultContent();
     
    }

}
