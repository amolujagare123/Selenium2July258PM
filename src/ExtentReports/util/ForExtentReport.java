package ExtentReports.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReport {

    public static  String screenshot(WebDriver driver) throws IOException {
        // 1. create the Object reference of TakesScreenshot
        // assign current driver to it , type cast driver  to TakesScreenshot

        TakesScreenshot ts  = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());

        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(srcFile,new File("Reports/screenshots/"+fileName));

        return fileName;
    }
}
