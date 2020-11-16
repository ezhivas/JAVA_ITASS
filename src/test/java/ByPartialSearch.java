import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialSearch {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.findElement(By.partialLinkText("Partial"));
        System.out.println(driver.findElement(By.tagName("submit")).getText());
        driver.quit();
    }
}
