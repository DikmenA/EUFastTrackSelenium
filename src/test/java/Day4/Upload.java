package Day4;

import Day3.*;
import org.junit.*;
import org.openqa.selenium.*;

public class Upload extends BasePage {

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement uploadLink = driver.findElement(By.id("file-upload"));
        uploadLink.sendKeys("C:\\Users\\Zulpikar\\IdeaProjects\\EUFastTrackSelenium\\src\\test\\java\\utilities\\upload.txt");
        driver.findElement(By.id("file-submit")).click();
    }
}
