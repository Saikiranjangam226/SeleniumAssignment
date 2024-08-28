package pageMethods;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageLocators.RegisterPageLoc;

public class RegisterPage implements RegisterPageLoc {
    private final WebDriver _driver;

    public RegisterPage(WebDriver driver) {
        this._driver = driver;
    }

    public void clickOnRegisterLink() {
        _driver.findElement(lnkRegister).click();
    }

    public void verifySignupPage() {
        boolean displayed = _driver.findElement(lblSignupHeading).isDisplayed();
        Assert.assertTrue(displayed);
    }

    public void verifySignupPageDescription() {
        boolean displayed = _driver.findElement(lblSignupDescription).isDisplayed();
        Assert.assertTrue(displayed, "Signup Page Description is not displayed");
    }

    public void enterFirstName() {
        _driver.findElement(txtFirstName).sendKeys("A");
    }

    public void enterLastName() {
        _driver.findElement(txtLastName).sendKeys("B");
    }

    public void enterAddress() {
        _driver.findElement(txtAddress).sendKeys("A");
    }

    public void enterCity() {
        _driver.findElement(txtCity).sendKeys("S");
    }
    public void enterState() {
        _driver.findElement(txtState).sendKeys("S");
    }
    public void enterZipcode() {
        _driver.findElement(txtZipCode).sendKeys("123");
    }
    public void enterSSN() {
        _driver.findElement(txtSSN).sendKeys("1111");
    }
    public void enterUserName() {
        _driver.findElement(txtUsername).sendKeys("SJ");
    }
    public void enterPassword() {
        _driver.findElement(txtPassword).sendKeys("123");
    }
    public void enterConfirmPassword() {
        _driver.findElement(txtConfirm).sendKeys("123");
    }
    public void clickOnRegister() {
        _driver.findElement(btnRegister).click();
    }

}
