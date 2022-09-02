import browserManager.BrowserManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.IndexPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {
    @BeforeMethod
    public void setUp(){
        BrowserManager.getInstance().getSession().manage().window().maximize();
        BrowserManager.getInstance().getSession().get("http://automationpractice.com/index.php");

    }

    @AfterMethod
    public void tearDown(){
        BrowserManager.getInstance().getSession().close();
    }

}


