package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmPages_POM {
    WebDriver driver;

    By txt_username = By.name("username");
    By txt_password = By.name("password");
    By login_btn = By.xpath("//button[@type='submit']");

    //constructor to access methods inside step definition file

    public OrangeHrmPages_POM(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(login_btn).click();
    }
}