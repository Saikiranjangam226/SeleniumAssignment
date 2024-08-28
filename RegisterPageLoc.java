package pageLocators;

import org.openqa.selenium.By;

public interface RegisterPageLoc {
    By lnkRegister = By.xpath("//a[text()='Register']");
    By lblSignupHeading = By.xpath("//h1[@class='title']");
    By lblSignupDescription = By.xpath("//p[contains(text(),'If you have an account')]");
    By txtFirstName = By.id("customer.firstName");
    By txtLastName = By.id("customer.lastName");
    By txtAddress = By.id("customer.address.street");
    By txtCity = By.id("customer.address.city");
    By txtState = By.id("customer.address.state");
    By txtZipCode = By.id("customer.address.zipCode");
    By txtSSN = By.id("customer.ssn");
    By txtUsername = By.id("customer.username");
    By txtPassword = By.id("customer.password");
    By txtConfirm  = By.id("repeatedPassword");
    By btnRegister = By.cssSelector("input[value='Register']");

}
