package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PgFctry {

    @FindBy(id = "user-name")
    WebElement txt_username;

    @FindBy(id = "password")
    WebElement txt_password;

    @FindBy(id = "login-button")
    WebElement btn_login;

    WebDriver driver;

    //constructor
    public LoginPage_PgFctry(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // OR we can use this instead of the above statement PageFactory.initElements(driver, LoginPage_PgFctry.class);
    }

    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }
    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }
    public void clickLoginButton() {
        btn_login.click();
    }
}
