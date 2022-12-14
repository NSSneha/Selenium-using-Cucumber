package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By txt_username = By.id("user-name");
    By txt_password = By.id("password");
    By btn_login = By.id("login-button");

    //creating a constructor to use this WebDriver instance and passing driver instance from POM page

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(btn_login).click();
    }
}
