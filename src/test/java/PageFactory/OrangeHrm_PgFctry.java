package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm_PgFctry {
    @FindBy(name = "username")
    WebElement txt_username;

    @FindBy(name = "password")
    WebElement txt_password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement login_btn;

    WebDriver driver;

    //constructor
    public OrangeHrm_PgFctry(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, OrangeHrm_PgFctry.class);
    }

    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }
    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }
    public void clickLoginButton() {
        login_btn.click();
    }
}