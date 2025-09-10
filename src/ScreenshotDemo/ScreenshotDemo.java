package ScreenshotDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo {

    @Test
    public void loginTest1() throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");

        // 1. create the Object reference of TakesScreenshot
        // assign current driver to it , type cast driver  to TakesScreenshot

        TakesScreenshot ts  = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());

        // 3. copy this file object into a real image file
        FileUtils.copyFile(srcFile,new File("screenshots/IMG"+timeStamp+".png"));
    }
}
