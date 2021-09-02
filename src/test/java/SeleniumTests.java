import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {

    @Test
    public void testcase() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hallo");
    }

}
