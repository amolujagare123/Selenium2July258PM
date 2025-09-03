package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites {

    WebDriver driver;

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

    @Test
    public void w3schools() {
        driver.get("https://www.w3schools.com/");
    }

    @Test
    public void javatpoint() {
        driver.get("https://www.javatpoint.com/");
    }

    @Test
    public void guru99() {
        driver.get("https://www.guru99.com/");
    }

    @Test
    public void tutorialspoint() {
        driver.get("https://www.tutorialspoint.com/");
    }
}
