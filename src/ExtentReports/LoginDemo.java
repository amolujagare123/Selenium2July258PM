package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReports.util.ForExtentReport.screenshot;

public class LoginDemo {
    ExtentReports extent;
    WebDriver driver;
    @BeforeClass
    public void initExtentObject()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("regression");

        extent.setSystemInfo("Test Environment","Production");
        extent.setSystemInfo("Release version","v1.25");
        extent.setSystemInfo("Developers Lead","Sushil");
        extent.setSystemInfo("Test Lead","Sarang");
        extent.setSystemInfo("Project Deadline","20 Dec 2025");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        extent.flush();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void loginTest1() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("valid credentials");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "https://stock.scriptinglogic.in/dashboard.php1";
        String actual = driver.getCurrentUrl();


        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("Test is passed");
        } catch (AssertionError e) {
            test.fail("Test is failed"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }
}
