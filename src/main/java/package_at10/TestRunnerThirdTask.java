package package_at10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunnerThirdTask {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='submit']"));
        name.sendKeys("Serhii");
        lastName.sendKeys("Vasylets");
        submitButton.submit();

    }
}
