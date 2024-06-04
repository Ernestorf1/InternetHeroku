package pages;



public class checkBoxesPage extends BasePage {
    private String cBLink ="//a[normalize-space()='Checkboxes']";
    private String cBOne ="//input[1]";
    private String cBTwo ="//input[2]";


    public checkBoxesPage(){
        super(driver);
    }

    public void navigateToIntHeroku() {
     navigateTo("https://the-internet.herokuapp.com/");
    }

    public void clicksCheckLink() {
       clickElement(cBLink, "xpath");
    }

    public void verifySecondCB() {
    elementIsSelected(cBTwo, "xpath");
    }


    public void checkFirstCB() {
        clickElement(cBOne, "xpath");
    }

    public void verifyBothChecked() {
        elementIsSelected(cBOne, "xpath");
        elementIsSelected(cBTwo, "xpath");
    }
}


    

