package common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.Properties;

public class baseClass {

   public WebDriver webDriver;
   public WebDriverWait webDriverWait;
   public static String screenshotsDirectory="screenshots";
   public static String screenshotPathFolder="";

    public baseClass(WebDriver webDriver){
        this.webDriver=webDriver;
        webDriverWait= new WebDriverWait(webDriver,60);
        PageFactory.initElements(webDriver, this);

    }
//Read values from the properties file
    public static Properties readPropertiesFileValues(String filename){

        FileInputStream fileInputStream=null;
        Properties properties=null;
        try{
            fileInputStream=new FileInputStream("src"+File.separator+"main"+File.separator+"resources"+File.separator+filename);
            properties=new Properties();
            properties.load(fileInputStream);
        }catch (Exception exception){
            System.out.println("Unable to read environment properties file");
        }
        return properties;
    }
    
    //Check if text id displayed in a page
   public boolean isTextPresent(String textToValidate){
        try {
        return webDriver.getPageSource().contains(textToValidate);

        }catch (Exception exception){
            return false;
        }
   }
//Create screenshot folder and save screenshot inside the time stamped folders
   public void createScreenshotFolders(String testCaseName){
try {
    String screenshotTime= LocalDateTime.now().toString().replace(":","-");
    File screenshotPath= new File(screenshotsDirectory);
    String screenshotFolder=screenshotPath.getAbsolutePath()+File.separator+testCaseName+screenshotTime;
    File timeStampedScreenshotFile=new File(screenshotFolder);
    timeStampedScreenshotFile.mkdir();
    screenshotPathFolder=screenshotFolder;


}catch (Exception exception){

    System.out.println("Screenshot cannot the created: "+exception);
}

   }
//Take screenshot and save in the screenshot location
   public void takeScreenShot(String screenName){
       String screenshotTimeStamp= LocalDateTime.now().toString().replace(":","-");
        if(webDriver instanceof TakesScreenshot){
            TakesScreenshot takesScreenshotDriver=(TakesScreenshot)webDriver;
            try {
                File screenshot=new File(screenshotPathFolder,screenName+"-"+screenshotTimeStamp+".png");
                FileUtils.moveFile(takesScreenshotDriver.getScreenshotAs(OutputType.FILE), screenshot);
            }catch (Exception exception){
                System.out.println("Unable to capture screenshot");

            }
        }
   }

    public String readEnvironmentProperty(String property){
        Properties properties=baseClass.readPropertiesFileValues("environment.properties");
        return  properties.getProperty(property);
    }

}
