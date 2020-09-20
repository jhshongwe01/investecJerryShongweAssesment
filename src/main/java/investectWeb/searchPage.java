package investectWeb;

import common.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchPage {
    @FindBy(id = "searchBarInput")
    private WebElement searchTxt;
    @FindBy(id = "searchBarButton")
    private WebElement searchBtn;
    WebDriver webDriver;
    WebDriverWait webDriverWait;
    public searchPage(WebDriver webDriver){
        this.webDriver=webDriver;
        webDriverWait= new WebDriverWait(webDriver,60);
        PageFactory.initElements(webDriver, this);

    }
    //Enter search text
    public void enterSearchText(String searchText){
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(searchTxt));
            searchTxt.sendKeys(searchText);
        }catch (Exception exception){
            System.out.println("Could not interact with element: "+exception);
        }

    }
    //Click search button
    public void clickSearchButton(){
        baseClass MyBaseClass=new baseClass(webDriver);
        MyBaseClass.takeScreenShot("SearchPage");//Take screenshot of the page
        try {
            webDriverWait.until(ExpectedConditions.elementToBeClickable(searchBtn));
            searchBtn.click();
        }catch (Exception exception){
            System.out.println("Could not interact with element: "+exception);
        }
    }
}
