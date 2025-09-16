package ExtentReports.MyReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static ExtentReports.util.ForExtentReport.initExtent;

public class MyExtentReportsListeners implements ITestListener
{
    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getMethod().getMethodName());

    }

    public void onTestSuccess(ITestResult result) {
      test.pass(result.getMethod().getMethodName() + " This test is passed");
    }

    public void onTestFailure(ITestResult result) {

        test.info(result.getThrowable());
        test.fail(result.getMethod().getMethodName() + " This test is failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");

        test.skip("this test is skipped");
    }


    public void onStart(ITestContext context) {
        System.out.println("onStart");

        if (extent==null)
          extent = initExtent();
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
        extent.flush();
    }
}
