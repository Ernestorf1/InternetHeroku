package pages;

public class internetDynamElPage extends BasePage {
    private String challengingDomOp = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[5]/a[1]";
    private String button1 = "//div[@class='large-2 columns']/a[1]";
    private String button2 = "//div[@class='large-2 columns']/a[2]";
    private String button3 ="//div[@class='large-2 columns']/a[3]";


    public internetDynamElPage(){
        super(driver);
    }
    public void navigateToHerokuApp() {
        navigateTo("https://the-internet.herokuapp.com/");
    }
    public void challengingDOM() {
       clickElement(challengingDomOp,"xpath");
    }
    public void displayedButtons() {
       /*elementIsDisplayed(button1, "xpath");
       elementIsDisplayed(button2, "xpath");
       elementIsDisplayed(button3, "xpath");*/
       clickElement(button1,"xpath");
       clickElement(button2,"xpath");
    
       clickElement(button3,"xpath");
    }
    public void clickOnDynamicButtons() {
       clickElement(button2,"xpath");
    }
}
