package package_at10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestRunnerFifthTask {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[@class='custom-control-label']"));
        for (int i = 0; i < oCheckBox.size(); i++) {
            String sValue = oCheckBox.get(i).getText();
            if (sValue.equals("Female")) oCheckBox.get(i).click();
            if (sValue.equals("Music")) oCheckBox.get(i).click();
        }
        WebElement dropDownList1 = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']"));
        dropDownList1.click();
        WebElement dropDownList1_1 = driver.findElement(By.xpath("//*[text()='NCR']"));
        dropDownList1_1.click();
        WebElement dropDownList2 = driver.findElement(By.cssSelector("div.col-md-4:nth-child(3)"));
        dropDownList2.click();
        WebElement dropDownlist2_1 = driver.findElement(By.xpath("//*[text()='Delhi']"));
        dropDownlist2_1.click();
        driver.quit();

    }
}






