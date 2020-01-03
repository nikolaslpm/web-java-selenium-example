package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignOnPage {

    WebDriver driver;

    public SignOnPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String username) {
        WebElement usernameElm = driver.findElement(By.xpath("//input[@name='userName']"));
        usernameElm.sendKeys(username);
    }

    public void setPassword(String password) {
        WebElement passwordElm = driver.findElement(By.xpath("//input[@name='password']"));
        passwordElm.sendKeys(password);
    }

    public String getUserNameText() {
        WebElement usernameElm = driver.findElement(By.xpath("//input[@name='userName']"));
        return usernameElm.getText();
    }

    public String getPasswordText() {
        WebElement passwordElm = driver.findElement(By.xpath("//input[@name='password']"));
        return passwordElm.getText();
    }

    public void clickLogin() {
        WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
    }

}
