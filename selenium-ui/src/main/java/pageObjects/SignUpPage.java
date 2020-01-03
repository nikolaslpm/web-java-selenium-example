package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    @FindBy(id = "email")
    WebElement emailField;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(name = "confirmPassword")
    WebElement confirmPasswordField;
    @FindBy(name = "register")
    WebElement submitButton;
    @FindBy(xpath = "//*[contains(text(), 'Thank you for registering.')]")
    WebElement successMessageField;

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String userName) {
        emailField.sendKeys(userName);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void setConfirmPassword(String password) {
        confirmPasswordField.sendKeys(password);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public String getSuccessMessage(){
        return successMessageField.getText();
    }
}
