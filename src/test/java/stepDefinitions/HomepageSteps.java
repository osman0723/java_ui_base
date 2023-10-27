package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomepageSteps {
    HomePage homePage = new HomePage();
    @Given("visit homepage")
    public void visit_homepage() {
        homePage.visit_homepage();
    }
}
