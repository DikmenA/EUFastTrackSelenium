package Day3;

import org.junit.*;
import org.openqa.selenium.*;

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
}
