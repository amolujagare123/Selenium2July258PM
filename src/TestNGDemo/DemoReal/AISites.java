package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {

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
    public void chatgpt() {
        driver.get("https://chat.openai.com/");
    }

    @Test
    public void bard() {
        driver.get("https://bard.google.com/");
    }

    @Test
    public void perplexity() {
        driver.get("https://www.perplexity.ai/");
    }

    @Test
    public void huggingface() {
        driver.get("https://huggingface.co/");
    }
}
