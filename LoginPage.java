package pageMethods;

import org.openqa.selenium.WebDriver;
import pageLocators.LoginPageLoc;

public class LoginPage implements LoginPageLoc {
    private final WebDriver _driver;

    public LoginPage(WebDriver driver) {
        this._driver = driver;
    }

    public void enterUsername() {
        _driver.findElement(userName).sendKeys("SJ");
    }
    public void enterPassword() {
        _driver.findElement(password).sendKeys("123");
    }
    public void clickOnLogin(){
      _driver.findElement(btnLogin).click();
    }
}
