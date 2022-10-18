package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SwagLabsLoginSteps_POM {
//    WebDriver driver = null;
//    LoginPage login; //LoginPage Object to access methods
//    @Given("browser is launched")
//    public void browser_is_launched() {
//        System.out.println("Inside Swag Labs POM");
//        System.out.println("Inside test: browser is launched");
//        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
//    }
//    @And("user is on Swag Labs login page")
//    public void user_is_on_swag_labs_login_page() throws InterruptedException {
//        System.out.println("Inside test: user is on Swag Labs login page..");
//        driver.navigate().to("https://www.saucedemo.com/");
//        Thread.sleep(2000);
//    }
//    @When("^user enters (.*)$")
//    public void enters_username(String username) throws InterruptedException {
//        System.out.println("Inside test: user enters username..");
//        login = new LoginPage(driver); //loginpage obj = new classname
//        login.enterUserName(username);
//        Thread.sleep(2000);
//    }
//    @And("^enters (.*)$")
//    public void enters_password(String password) throws InterruptedException {
//        System.out.println("Inside test: user enters password..");
//        login.enterPassword(password);
//        Thread.sleep(2000);
//    }
//    @Then("user is navigated to home page")
//    public void user_is_navigated_to_home_page() throws InterruptedException {
//        System.out.println("Inside test: user is navigated to home page..");
//        Thread.sleep(2000);
//        try {
//            login.clickLoginButton();
//            Thread.sleep(1000);
//            Boolean loginText = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
//            if (loginText) {
//                System.out.println("Successfully logged in");
//            } else {
//                System.out.println("Unsuccessful login");
//            }
//            Thread.sleep(1000);
//        }
//        catch (NoSuchElementException e) {
//            System.out.println("Unsuccessful Login");
//        }
//        finally {
//            driver.quit();
//        }
//    }
}
