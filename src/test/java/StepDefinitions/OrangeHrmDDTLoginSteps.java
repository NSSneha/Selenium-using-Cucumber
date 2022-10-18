//package StepDefinitions;
//
//import io.cucumber.java.en.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//
//public class OrangeHrmDDTLoginSteps {
//    WebDriver driver = null;
//
//    @Given("chrome browser is launched")
//    public void chrome_browser_is_launched() {
//        System.out.println("Inside Orange Hrm");
//        System.out.println("Inside test: chrome browser is launched..");
//        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
//    }
//
//    @And("end user is on Orange Hrm login page")
//    public void end_user_is_on_orange_hrm_login_page() throws InterruptedException {
//        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(1000);
//    }
//
//    @When("^end user inputs (.*)$")
//    public void end_user_inputs_username(String username) throws InterruptedException {
//        driver.findElement(By.name("username")).sendKeys(username);
//        Thread.sleep(1000);
//    }
//
//    @And("^user inputs (.*)$")
//    public void end_user_inputs_password(String password) throws InterruptedException {
//        driver.findElement(By.name("password")).sendKeys(password);
//        Thread.sleep(1000);
//    }
//
//    @Then("end user is navigated to homepage")
//    public void end_user_is_navigated_to_homepage() throws InterruptedException {
//        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
//        Thread.sleep(1000);
//        try {
//            Boolean txt = driver.findElement(By.xpath("//h5[text()='Employee Information']")).isDisplayed();
//            if (txt) {
//                System.out.println("Successful login");
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
//}
//
