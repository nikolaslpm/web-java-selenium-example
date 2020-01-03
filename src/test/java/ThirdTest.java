import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.SignUpPage;

import java.util.concurrent.TimeUnit;

public class ThirdTest {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");
    }

    @Test
    void signupTest() {
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = homePage.clickRegister();
        signUpPage.setUserName("newUser");
        signUpPage.setPassword("123456");
        signUpPage.setConfirmPassword("123456");
        signUpPage.clickSubmit();

        Assertions.assertTrue(signUpPage.getSuccessMessage().contains("Thank you"),
                "Should have shown thank you page");
        Assertions.assertTrue(homePage.signOffIsDisplayed(), "Should be logged in");
    }

    @AfterEach
    void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
