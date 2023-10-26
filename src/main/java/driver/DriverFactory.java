package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class DriverFactory {
    //private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver(){
    if(webDriver.get() == null ){
    webDriver.set(createDriver());
        }
    return webDriver.get();
    }

    private static WebDriver createDriver(){
        WebDriver driver = null;

        switch (getBrowserType()){
            case "chrome"-> {
                System.setProperty("webdriver.chrome.driver","C://MavenProjects/java_ui_base/src/main/java/driver/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                chromeOptions.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(chromeOptions);
                break;
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

    private static String getBrowserType() {
        return "chrome";
    }

    public static void cleanupDriver(){
        webDriver.get().quit();
        webDriver.remove();
    }

}
