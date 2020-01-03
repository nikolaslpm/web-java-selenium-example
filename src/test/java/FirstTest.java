import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    void navigate() {
        driver.get("http://newtours.demoaut.com/");
    }

    @AfterEach
    void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
