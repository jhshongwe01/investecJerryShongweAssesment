import common.baseClass;
import investecApi.investecApi;
import investectWeb.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.util.Properties;

public class UnitTest {
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


@Test
    public void cashInvestmentsInterestRates() {
    openInvestecPage();
    landingPage myLandingPage=new landingPage(webDriver);
    searchPage mySearchPage=new searchPage(webDriver);
    searchResultsPage mySearchResultsPage= new searchResultsPage(webDriver);
    signUpPage mySignUpPage=new signUpPage(webDriver);
    thankYouPage myThankYouPage=new thankYouPage(webDriver);
    baseClass myBaseClass=new baseClass(webDriver);

        understandingCashInvestmentPage myUnderstandingCashInvestmentPage= new understandingCashInvestmentPage(webDriver);
        myBaseClass.createScreenshotFolders("CashInvestments");
        myLandingPage.clickSearchButton();
        mySearchPage.enterSearchText("Understanding cash investment interest rates");
        mySearchPage.clickSearchButton();
        mySearchResultsPage.openSearchResults();
        mySignUpPage.clickSignUp();
        myUnderstandingCashInvestmentPage.enterName("Jerry");
        myUnderstandingCashInvestmentPage.enterSurname("Shongwe");
        myUnderstandingCashInvestmentPage.enterEmail("test@investec.co.za");
        myUnderstandingCashInvestmentPage.clickInsights();
        myUnderstandingCashInvestmentPage.clickSubmit();
        myThankYouPage.checkIfThankYouIsDisplayed("Thank you");
        webDriver.quit();
    }
    @Test
    public void apiTest(){
        investecApi MyinvestecApi= new investecApi();
        MyinvestecApi.getPeopleApiCall();

    }
}
