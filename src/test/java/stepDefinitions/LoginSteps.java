package stepDefinitions;

import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    @When("fill_in username")
    public void fill_in_username() {
        loginPage.fill_username();
    }
    @When("fill_in password")
    public void fill_in_password() {
        loginPage.fill_password();
    }
    @When("click login button")
    public void click_login_button() {
        loginPage.click_loginButton();
    }

}
