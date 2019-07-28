import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class herokuNotificationMes {
    public static final String  URL ="http://the-internet.herokuapp.com/notification_message_rendered";

    @Test
    public void addRemovalElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().fullscreen();
        WebElement linkText = driver.findElementByLinkText("Click here");
        WebDriverWait wait = new WebDriverWait(driver, 2);
        WebElement textNotification = driver.findElement(By.id("flash"));
        assertEquals(textNotification, "Action unsuccesful, please try again");

        driver.quit();
    }
}
