package investectWeb;
import common.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchResultsPage {

    @FindBy(partialLinkText = "Understanding")//find elements
    private WebElement searchResults;

    WebDriver webDriver;
    WebDriverWait webDriverWait;
    public searchResultsPage(WebDriver webDriver){
        this.webDriver=webDriver;
        webDriverWait= new WebDriverWait(webDriver,60);
        PageFactory.initElements(webDriver, this);

    }
    //Click search results
    public void openSearchResults(){

        try {
            baseClass MyBaseClass=new baseClass(webDriver);
            MyBaseClass.takeScreenShot("SearchResultsPage");//Take screenshot of the page
            webDriverWait.until(ExpectedConditions.elementToBeClickable(searchResults));//wait for element to be clickable
            searchResults.click();
        }catch (Exception exception){
            System.out.println("Could not interact with element: "+exception);
        }
    }
}
