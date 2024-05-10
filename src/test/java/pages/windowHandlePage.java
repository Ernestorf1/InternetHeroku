package pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowHandlePage extends BasePage {
    private String multipleWindowsOpt = "//*[@id=\'content\']/ul/li[33]/a";
    private String firstPageTitle = "/html/body/div[2]/div/div/h3";
    private String firstPageLink = "/html/body/div[2]/div/div/a"; 
    private String newWindowTitle = "/html/body/div/h3";

    public windowHandlePage(){
        super(driver);
    }

    public void navigateToInternetHeroku() {
       navigateTo("https://the-internet.herokuapp.com/"); 
    }

    public void naviagetToMultipleWindow() {
       clickElement(multipleWindowsOpt, "xpath");
       
    }

    public void isNewWindowLink() {
      
     
    }

    public void clicksOnNewWindowLink() {
      elementIsDisplayed(firstPageTitle, "xpath");
      elementIsDisplayed(firstPageLink, "xpath");
      clickElement(firstPageLink, "xpath");
    }

    public void isNewOpenedWindow() {
        
            Set<String> windowHandles = driver.getWindowHandles();
            assert windowHandles.size() == 2;            
       
              switchToWindowWithTitle("New Window");
              waitForElementToBeVisible(newWindowTitle);
              
    }

    public void closeNewWindow() {
      driver.close();
    }

    public void isOneWindowOpened() {
      assert driver.getWindowHandles().size() ==1;
    }

    public void isUserOnPrincipalPage() {
     String mainWindowHandle = driver.getWindowHandles().iterator().next();
    driver.switchTo().window(mainWindowHandle);
    }
    
}
