package pageLocators;

import org.openqa.selenium.By;

public interface LoginPageLoc {

    By userName = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By btnLogin = By.xpath("//input[@value='Log In']");
}
