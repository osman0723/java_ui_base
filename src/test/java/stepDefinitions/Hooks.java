package stepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {
    @Before
    public void setUp(){
    getDriver();
}
    @AfterStep
    public void captureExceptionImage(Scenario scenario){
         if (scenario.isFailed()) {
         byte[] screenshot =((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot, "img/png", "failed_screenshot");
        }
    }
    @After
    public void tearDown(){
    cleanupDriver();
}
}
