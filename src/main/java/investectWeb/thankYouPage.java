package investectWeb;

import common.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


public class thankYouPage  {

    WebDriver webDriver;
    WebDriverWait webDriverWait;
    public thankYouPage(WebDriver webDriver){

            this.webDriver=webDriver;
            webDriverWait= new WebDriverWait(webDriver,60);
        PageFactory.initElements(webDriver, this);

    }
    //Verify if Thank you is displayed on the page
    public void checkIfThankYouIsDisplayed(String stringToVerify){
        try {

            baseClass myBaseClass=new baseClass(webDriver);
            myBaseClass.takeScreenShot("ThankYouPage");//Take screenshot of the page
            myBaseClass.isTextPresent(stringToVerify);

            Assert.assertTrue("Thank you is not displayed",myBaseClass.isTextPresent(stringToVerify));
        }catch (Exception exception){
            System.out.println("Could not interact with element: "+exception);
        }

    }
}
