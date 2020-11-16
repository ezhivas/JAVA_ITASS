import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputTest {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.findElement(By.id("firstName")).sendKeys("Sergey");
        driver.findElement(By.id("lastName")).sendKeys("Last Sergey");
        driver.findElement(By.id("submit")).submit();
        driver.quit();
    }
}
