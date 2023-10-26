package pageObjects;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ConfigReader;
import utils.GlobalVars;

import java.time.Duration;

public class BasePage {
        public BasePage(){
        PageFactory.initElements(getDriver(), this);

    }
        public WebDriver getDriver(){
    return DriverFactory.getDriver();
    }


    public void sendKeys(WebElement element, String text){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }
    public void navigateTo_URL(String url){
        getDriver().get(url);
    }
    public void click(WebElement element){
            element.click();
    }
    public void waitFor(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void verifyUrl(String expectedUrl){
          String currentUrl = getDriver().getCurrentUrl();
          Assert.assertEquals(currentUrl, expectedUrl);
    }





}
