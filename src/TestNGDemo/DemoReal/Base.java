package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

   static WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
