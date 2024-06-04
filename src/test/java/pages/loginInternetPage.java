package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginInternetPage extends BasePage {
   private String loginLink = "//*[@id=\'loop-container\']/div/article/div[2]/div[1]/div[1]/p/a";
   private String loginTitle = "//*[@id=\'login\']/h2";

   private String submitButton = "//*[@id=\'submit\']";
   private String successLogin ="//*[@id=\'loop-container\']/div/article/div[1]/h1";
private String welcomeMessage = "//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong";
   
   
    public loginInternetPage (){
        super(driver);
    }

    public void navigateToInternetHeroku() {
       navigateTo("https://practicetestautomation.com/practice/");
    }

    public void clickOnAuth() {
        clickElement(loginLink, "xpath");
        waitForElementToBeVisible(loginTitle,"xpath", 2);
    }

    public void inputValidCredentials(String username, String password) {
      WebElement usernameField = driver.findElement(By.id("username"));
      usernameField.sendKeys(username);

      WebElement passwordField = driver.findElement(By.id("password"));
      passwordField.sendKeys(password);

      clickElement(submitButton, "xpath");
      waitForElementToBeVisible(successLogin, "xpath", 2);
  }

    public void welcomeMessage() {
        String congratsMessage = textFromElement(welcomeMessage, "xpath");
      Assert.assertEquals("Congratulations student. You successfully logged in!",congratsMessage);

    }
    
}
