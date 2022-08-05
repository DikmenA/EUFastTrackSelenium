package Day3;

import org.junit.*;
import org.openqa.selenium.*;

import java.util.*;

public class RadioBtn extends BasePage {

    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }

    @Test
    public void test1(){
        WebElement radtn1 = driver.findElement(By.id("red"));
        radtn1.click();
        System.out.println(radtn1.getText());
    }

    @Test
    public void test2() throws InterruptedException {
        List<WebElement> btns = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
        for (WebElement btn: btns) {
            btn.click();
            System.out.println(btn.getText());
            Thread.sleep(1000);

        }
    }
}
