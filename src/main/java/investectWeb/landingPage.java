package investectWeb;

import common.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class landingPage  {
    @FindBy(id = "search-toggle")//get element using ID
    private WebElement searchBtn;
    WebDriver webDriver;
    WebDriverWait webDriverWait;


    public landingPage(WebDriver webDriver){
        this.webDriver=webDriver;
        webDriverWait= new WebDriverWait(webDriver,60);
        PageFactory.initElements(webDriver, this);

    }
    //Click search button
    public void clickSearchButton(){
        try {
            baseClass MyBaseClass=new baseClass(webDriver);
            MyBaseClass.takeScreenShot("LandingPage");//Take screenshot of the page
            webDriverWait.until(ExpectedConditions.elementToBeClickable(searchBtn));
            searchBtn.click();
        }catch (Exception exception){
            System.out.println("Could not interact with element: "+exception);
        }

    }
}
