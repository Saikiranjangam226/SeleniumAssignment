package test;

import commonUtils.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageMethods.LoginPage;

public class testLoginPage extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod
    public void initialisation(){
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginWithValidCredentials(){

        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLogin();

    }
}
