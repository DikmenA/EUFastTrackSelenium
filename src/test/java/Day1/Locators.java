package Day1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Locators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        WebElement flash = driver.findElement(By.id("flash-messages"));
        System.out.println(flash.getTagName());

    }
}
