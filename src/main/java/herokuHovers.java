import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class herokuHovers {
    public static final String  URL ="http://the-internet.herokuapp.com/hovers";

    @Test
    public void addRemovalElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        Actions action = new Actions(driver);
        List<WebElement> us1 = driver.findElements(By.xpath("//*[text()='img/avatar-blank.jpg']"));
        assertEquals(us1.size(), 1);
        action.moveToElement((WebElement) us1).build().perform();
        WebElement name = driver.findElementByName("user1");
        assertEquals(name.getText(),"name: user1");
        WebElement link1 = driver.findElementByLinkText("View profile");
        action.click(link1);
        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
        WebElement body1 = driver.findElement(By.ByXPath("//*[text()='404']");
    }

}
