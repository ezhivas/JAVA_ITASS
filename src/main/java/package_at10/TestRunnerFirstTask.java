package package_at10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class TestRunnerFirstTask {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println("Title: " + title + "\nTitle length:" + title.length());
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.google.com/", currentUrl);
        String source = driver.getPageSource();
        System.out.println("Source length of the page is: " + source.length());
        driver.quit();

    }
}
