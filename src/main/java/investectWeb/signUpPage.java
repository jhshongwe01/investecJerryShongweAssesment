package investectWeb;

import common.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signUpPage {
    @FindBy(xpath = "//button[@ng-click='openForm();']")
    private WebElement signUpBtn;

    WebDriver webDriver;
    WebDriverWait webDriverWait;
    public signUpPage(WebDriver webDriver){
        this.webDriver=webDriver;
        webDriverWait= new WebDriverWait(webDriver,60);
        PageFactory.initElements(webDriver, this);

    }
    //Click sign up button
    public void clickSignUp(){

        try {
            baseClass myBaseClass=new baseClass(webDriver);
            myBaseClass.takeScreenShot("SignUpPage");//Take screenshot of the page
            baseClass MyBaseClass=new baseClass(webDriver);
            MyBaseClass.takeScreenShot("SignUpPage");
            webDriverWait.until(ExpectedConditions.elementToBeClickable(signUpBtn));
            signUpBtn.click();
        }catch (Exception exception){
            System.out.println("Could not interact with element: "+exception);
        }


    }
}
