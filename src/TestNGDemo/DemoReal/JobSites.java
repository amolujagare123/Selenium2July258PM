package TestNGDemo.DemoReal;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends Base {



    @Test
    public void naukri() {
        driver.get("https://www.naukri.com/");
        Assert.assertEquals(driver.getTitle(),
                "Naukri site"
        ,"This is not a naukri site");
    }

    @Test
    public void linkedinJobs() {
        driver.get("https://www.linkedin.com/jobs");
    }

    @Test
    public void indeed() {
        driver.get("https://www.indeed.com/");
    }

    @Test
    public void monster() {
        driver.get("https://www.monster.com/");
    }
}
