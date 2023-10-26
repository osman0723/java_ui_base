package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class LoginPage extends BasePage{
    public LoginPage(){super();}

    private @FindBy(id = "user-name") WebElement username_textField;
    private @FindBy(id = "password") WebElement password_textField;
    private @FindBy(id = "login-button") WebElement loginButton_textField;
    public final String inventory_pageURL = "https://www.saucedemo.com/inventory.html";

    public void visit_homepage(){
        navigateTo_URL(GlobalVars.SAUCEDEMO_HOMEPAGE);
    }
    public void fill_username(){
        sendKeys(username_textField, "standard_user");
    }
    public void fill_password(){
        sendKeys(password_textField, "secret_sauce");
    }
    public void click_loginButton(){
        click(loginButton_textField);
    }
    public void verify_inventory(){
        verifyUrl(inventory_pageURL);
    }
}
