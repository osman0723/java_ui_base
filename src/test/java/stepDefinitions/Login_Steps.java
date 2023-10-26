package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Login_Steps {
    LoginPage loginPage = new LoginPage();
    @Given("visit homepage")
    public void visit_homepage() {
        loginPage.visit_homepage();
    }
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
    @Then("verify inventory page")
    public void verify_inventory_page() {
        loginPage.verify_inventory();
    }
}
