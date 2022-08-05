package Day3;

import org.junit.*;
import org.openqa.selenium.*;

import java.util.*;

public class Windows extends BasePage{

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void test1(){
        driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
        Set<String> handles = driver.getWindowHandles();
        for (String handle: driver.getWindowHandles()) {
            System.out.println(driver.switchTo().window(handle).getCurrentUrl());
            System.out.println(driver.switchTo().window(handle).getTitle());
        }

    }

}
