import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageSourceTest {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Title: " + driver.getTitle() + "\nTitle length:" + driver.getTitle().length());
        Assert.assertEquals("https://www.google.com/", driver.getCurrentUrl());
        System.out.println("Source length of the page is: " + driver.getPageSource().length());
        driver.quit();
    }
}

