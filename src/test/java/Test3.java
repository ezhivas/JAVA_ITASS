import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

    @Test
    public void test() {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/search?q=w3");
        WebElement element1 = driver.findElement(By.xpath("//div[@id='center_col']/div"));
        element1.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.google.com.ua/search?q=w3");
        driver.navigate().refresh();
        driver.quit();
    }
}
