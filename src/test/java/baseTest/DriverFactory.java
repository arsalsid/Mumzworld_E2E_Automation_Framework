package baseTest;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import utils.Utilities;
import java.io.IOException;
import java.util.logging.Logger;

public class DriverFactory {
    public static WebDriver driver = null;

    @BeforeTest
    public void beforeTest() {
      Logger.getLogger("Before tests.Test logs");
    }

    @BeforeClass
    public void launchBrowser() throws IOException, InterruptedException {
        String browser = PropertyReader.getInstance().readProperty("browser");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
//        options.addArguments("--headless");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver(options);
        }
        else if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
        try { // for me
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Reporter.log("======Launch Browser======", true);
        String url = PropertyReader.getInstance().readProperty("URL");
        driver.get(url);
        Utilities.takeScreenshot(driver,"Initiating Website");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public void tearDown() {
        Reporter.log("======Browser Closed======", true);
        driver.quit();
        driver = null;
    }
}
