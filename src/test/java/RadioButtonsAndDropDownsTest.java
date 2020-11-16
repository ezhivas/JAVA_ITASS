import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class RadioButtonsAndDropDownsTest {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        List<WebElement> checkBoxElements = driver.findElements(By.xpath("//*[@class='custom-control-label']"));
        boolean elementGenderFound = false;
        boolean elementHobbyFound = false;
        for (WebElement checkBoxElement : checkBoxElements) {
            String sValue = checkBoxElement.getText();
            if (sValue.equals("Female")) {
                checkBoxElement.click();
                elementGenderFound = true;
            }
            if (sValue.equals("Music")) {
                checkBoxElement.click();
                elementHobbyFound = true;
            }
        }
        if (!elementGenderFound) System.out.println("Element for Gender not found");
        if (!elementHobbyFound) System.out.println("Element for Hobby not found");
        driver.findElement(By.xpath("//div[@class=' css-1hwfws3']")).click();
        driver.findElement(By.xpath("//*[text()='NCR']")).click();
        driver.findElement(By.cssSelector("div.col-md-4:nth-child(3)")).click();
        driver.findElement(By.xpath("//*[text()='Delhi']")).click();
        driver.quit();
    }
}
