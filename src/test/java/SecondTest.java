import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.SignOnPage;

import java.util.concurrent.TimeUnit;

public class SecondTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");
    }

    @Test
    void signOnTest() {
        WebElement signOn = driver.findElement(By.xpath("//a[text()='SIGN-ON']"));
        signOn.click();

        WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123456");

        WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
        Assertions.assertEquals("", username.getText());
        Assertions.assertEquals("", password.getText());
    }

    @Test
    void signOnWithPageObjectTest() {
        HomePage homePage = new HomePage(driver);
        SignOnPage signOnPage = homePage.clickSignOn();

        signOnPage.setUserName("admin");
        signOnPage.setPassword("admin123456");
        signOnPage.clickLogin();

        Assertions.assertEquals("", signOnPage.getUserNameText());
        Assertions.assertEquals("", signOnPage.getPasswordText());
    }

    @AfterEach
    void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
