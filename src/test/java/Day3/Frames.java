package Day3;

import org.junit.*;
import org.openqa.selenium.*;

public class Frames extends BasePage{

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
    }

    @Test
    public void test1(){
        WebElement frameSet = driver.findElement(By.name("frameset-middle"));
        driver.switchTo().frame(frameSet);
        WebElement middle = driver.findElement(By.name("frame-middle"));
        driver.switchTo().frame(middle);
        System.out.println(driver.findElement(By.id("content")).getText());
    }
}
