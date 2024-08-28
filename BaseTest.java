package commonUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    public WebDriver driver;
    private final String URL = "https://parabank.parasoft.com/parabank/index.htm";

    @BeforeClass
    public void lunchApplication() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get(URL);
    }

    @AfterClass
    public void quitApplication() {
        if (driver != null)
            driver.quit();
    }
}
