package stepdefinations;

import common.baseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import investectWeb.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.Properties;

public class cashInvestmentInterestRates {
    private static WebDriver webDriver;
    public void openInvestecPage(){

        if(readEnvironmentProperty("browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src"+ File.separator+"main"+File.separator+"resources"+File.separator+"drivers"+File.separator+"chromedriver.exe");
            ChromeOptions chromeOptions=new ChromeOptions();
            chromeOptions.addArguments("start-maximized");
            webDriver=new ChromeDriver(chromeOptions);
            webDriver.get(readEnvironmentProperty("url"));

        }else if(readEnvironmentProperty("browser").equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src"+ File.separator+"main"+File.separator+"resources"+File.separator+"drivers"+File.separator+"geckodriver.exe");
            webDriver=new FirefoxDriver();
            webDriver.get(readEnvironmentProperty("url"));

        }

    }

    public String readEnvironmentProperty(String property){
        Properties properties=baseClass.readPropertiesFileValues("environment.properties");
        return  properties.getProperty(property);
    }


    @Given("^User opens investec website$")
    public void userOpensInvestecWebsite() {
        openInvestecPage();
        baseClass myBaseClass=new baseClass(webDriver);
        myBaseClass.createScreenshotFolders("CashInvestments");
    }


    @And("^User clicks on search$")
    public void userClicksOnSearch() {
        landingPage myLandingPage=new landingPage(webDriver);
        myLandingPage.clickSearchButton();
    }

    @And("^User enters \"([^\"]*)\" search key word$")
    public void userEntersSearchKeyWord(String searchString) throws Throwable {
        searchPage mySearchPage=new searchPage(webDriver);
        mySearchPage.enterSearchText(searchString);
    }

    @And("^User clicks search button$")
    public void userClicksSearchButton() {
        searchPage mySearchPage=new searchPage(webDriver);
        mySearchPage.clickSearchButton();
    }

    @And("^User click understanding cash investment interest rates$")
    public void userClickUnderstandingCashInvestmentInterestRates() {
        searchResultsPage mySearchResultsPage= new searchResultsPage(webDriver);
        mySearchResultsPage.openSearchResults();
    }

    @And("^User clicks Sign up Button$")
    public void userClicksSignUpButton() {
        signUpPage mySignUpPage=new signUpPage(webDriver);
        mySignUpPage.clickSignUp();
    }

    @And("^User enters name\"([^\"]*)\"$")
    public void userEntersName(String name) throws Throwable {
        understandingCashInvestmentPage myUnderstandingCashInvestmentPage= new understandingCashInvestmentPage(webDriver);
        myUnderstandingCashInvestmentPage.enterName(name);
    }

    @And("^User enters surname\"([^\"]*)\"$")
    public void userEntersSurname(String surname) throws Throwable {
        understandingCashInvestmentPage myUnderstandingCashInvestmentPage= new understandingCashInvestmentPage(webDriver);
        myUnderstandingCashInvestmentPage.enterSurname(surname);
    }

    @And("^User enters email\"([^\"]*)\"$")
    public void userEntersEmail(String email) throws Throwable {
        understandingCashInvestmentPage myUnderstandingCashInvestmentPage= new understandingCashInvestmentPage(webDriver);
        myUnderstandingCashInvestmentPage.enterEmail(email);
    }
    @And("^User selects insights$")
    public void userSelectsInsights() {
        understandingCashInvestmentPage myUnderstandingCashInvestmentPage= new understandingCashInvestmentPage(webDriver);
        myUnderstandingCashInvestmentPage.clickInsights();
    }

    @And("^User clicks submit button$")
    public void userClicksSubmitButton() {
        understandingCashInvestmentPage myUnderstandingCashInvestmentPage= new understandingCashInvestmentPage(webDriver);
        myUnderstandingCashInvestmentPage.clickSubmit();
    }

    @Then("^verify that \"([^\"]*)\" text is displayed$")
    public void verifyThatTextIsDisplayed(String verifyText) throws Throwable {
        thankYouPage myThankYouPage=new thankYouPage(webDriver);
        myThankYouPage.checkIfThankYouIsDisplayed(verifyText);
        webDriver.quit();
    }
}
