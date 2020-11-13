import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

    @Test
    public void test() {
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

