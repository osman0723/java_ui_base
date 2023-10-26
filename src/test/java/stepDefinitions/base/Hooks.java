package stepDefinitions.base;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {
    @Before
    public void setUp(){
    getDriver();
}
    @AfterStep
    public void captureExceptionImage(Scenario scenario){
         Timestamp timestamp = new Timestamp(System.currentTimeMillis());
         String timeMilliseconds = Long.toString(timestamp.getTime());
         if (scenario.isFailed()) {
         byte[] screenshot =((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot, "img/png", timeMilliseconds);
        }
    }
    @After
    public void tearDown(){
    cleanupDriver();
}
}
