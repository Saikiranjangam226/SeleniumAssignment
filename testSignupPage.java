package test;

import commonUtils.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageMethods.RegisterPage;

public class testSignupPage extends BaseTest {
    private RegisterPage registerPage;

    @BeforeMethod
    public void initialisation() {
        registerPage = new RegisterPage(driver);
    }

    @Test
    public void registerUser() {
        registerPage.clickOnRegisterLink();
        registerPage.verifySignupPage();
        registerPage.verifySignupPageDescription();
        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.enterAddress();
        registerPage.enterCity();
        registerPage.enterState();
        registerPage.enterZipcode();
        registerPage.enterSSN();
        registerPage.enterUserName();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.clickOnRegister();

    }
}
