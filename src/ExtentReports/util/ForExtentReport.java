package ExtentReports.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
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


    public static ExtentReports initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("regression");

        extent.setSystemInfo("Test Environment","Production");
        extent.setSystemInfo("Release version","v1.25");
        extent.setSystemInfo("Developers Lead","Sushil");
        extent.setSystemInfo("Test Lead","Sarang");
        extent.setSystemInfo("Project Deadline","20 Dec 2025");

        return extent;
    }
}
