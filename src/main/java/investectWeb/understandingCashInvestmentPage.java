package investectWeb;

import common.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class understandingCashInvestmentPage {
    @FindBy(name = "name")
    private WebElement nameTxt;
    @FindBy(name = "surname")
    private WebElement surnameTxt;
    @FindBy(name = "email")
    private WebElement emailTxt;
    @FindBy(xpath = "//div[@class='checkbox-input__button-copy ng-binding'][1]")
    private WebElement insightsChk;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;

    WebDriver webDriver;
    WebDriverWait webDriverWait;
    public understandingCashInvestmentPage(WebDriver webDriver){
        this.webDriver=webDriver;
        webDriverWait= new WebDriverWait(webDriver,60);
        PageFactory.initElements(webDriver, this);

    }
    //Enter name
    public void enterName(String nameText){
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(nameTxt));
            nameTxt.sendKeys(nameText);
        }catch (Exception exception){
            System.out.println("Could not interact with element");
        }

    }
    //Enter surname
    public void enterSurname(String nameText){

        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(surnameTxt));
            surnameTxt.sendKeys(nameText);
        }catch (Exception exception){
            System.out.println("Could not interact with element");
        }

    }
    //Enter email address
    public void enterEmail(String surnameText){
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(emailTxt));
            emailTxt.sendKeys(surnameText);
        }catch (Exception exception){
            System.out.println("Could not interact with element: "+exception);
        }

    }
    //Click insights
    public void clickInsights(){
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(insightsChk));
            insightsChk.click();
        } catch (Exception exception){
        System.out.println("Could not interact with element");
    }

    }

    //Click submit button
    public void clickSubmit(){
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(submit));
            submit.click();
            baseClass myBaseClass=new baseClass(webDriver);
            myBaseClass.takeScreenShot("UnderstandingCashInvestmentPage");//Take screenshot of the page
        } catch (Exception exception){
            System.out.println("Could not interact with element");
        }

    }
}
