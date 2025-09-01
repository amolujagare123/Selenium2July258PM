package Xpath;

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
        Thread.sleep(2000);
        WebElement jobLocation = driver.findElement(By.id("source_118"));
        Select locations = new Select(jobLocation);
        locations.selectByVisibleText("Bangalore");
        locations.selectByIndex(3);
        locations.selectByValue("5");
        WebElement addImage = driver.findElement(By.xpath("   //*[@id='post_form']/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]"));
        //*[@id="post_form"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]
        //html/body/div[2]/div/div[1]/div[4]/div/div[2]/div[2]/form/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]

        addImage.click();
        //Thread.sleep(2000);
    }
}