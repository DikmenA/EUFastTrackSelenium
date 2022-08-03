package Day2;

import io.github.bonigarcia.wdm.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Practice {

    WebDriver driver;

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        driver.get("https://www.google.com/");
        WebElement gLink = driver.findElement(By.linkText("Gmail"));
        WebElement gPLink = driver.findElement(By.partialLinkText("Gm"));
        System.out.println(gPLink.getText());
        System.out.println(gLink.getText());
    }

    @Test
    public void test2(){
        driver.get("https://www.google.com/");
        WebElement textCss = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        WebElement textXpath = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
        System.out.println(textXpath.getTagName());
        System.out.println(textCss.getTagName());
    }

    @Test
    public void test3(){
        driver.get("https://www.w3schools.com");
        WebElement headCss = driver.findElement(By.cssSelector("h1.learntocodeh1"));
        WebElement headXpath = driver.findElement(By.xpath("//*[@class=\"learntocodeh1\"]"));
        System.out.println(headCss.getTagName());
        System.out.println(headXpath.getTagName());
    }
}
