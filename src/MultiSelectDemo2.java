import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // 1. find the WebElement
        WebElement jobLocation = driver.findElement(By.id("source_118"));

        // 2. create the object of Select class
        Select selText = new Select(jobLocation);


        // 3. select the option using the Select class object
        selText.selectByVisibleText("Bangalore");
        selText.selectByIndex(2);
        selText.selectByIndex(3);


        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

        WebElement selectedLocation = driver.findElement(By.id("fld_118"));
        Select selectedLocationObj = new Select(selectedLocation);

        selectedLocationObj.selectByIndex(1);
        selectedLocationObj.selectByIndex(2);

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();

    }
}