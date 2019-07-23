import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class herokuTypos {
    public static final String  URL ="http://the-internet.herokuapp.com/typos";

    @Test
    public void addRemovalElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().fullscreen();
        WebElement findElements = driver.findElement(By.xpath("//*[text()='you won't']"));

        driver.quit();
    }
}
