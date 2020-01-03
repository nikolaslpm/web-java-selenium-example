package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SignOnPage clickSignOn() {
        WebElement signOnButton = driver.findElement(By.xpath("//a[text()='SIGN-ON']"));
        signOnButton.click();
        return new SignOnPage(driver);
    }

    public SignUpPage clickRegister() {
        WebElement registerButton = driver.findElement(By.xpath("//a[text()='REGISTER']"));
        registerButton.click();
        return new SignUpPage(driver);
    }

    public boolean signOffIsDisplayed(){
        WebElement signOffButton = driver.findElement(By.xpath("//a[text()='SIGN-OFF']"));
        return signOffButton.isDisplayed();
    }
}
