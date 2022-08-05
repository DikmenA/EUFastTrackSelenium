package Day3;

import org.junit.*;
import org.openqa.selenium.*;
import utilities.*;

public class BasePage {

    protected WebDriver driver;

    public BasePage(){
        driver = Driver.get();
        driver.manage().window().maximize();
    }
}
