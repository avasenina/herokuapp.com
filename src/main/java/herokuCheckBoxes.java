import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class herokuCheckBoxes {
    public static final String  URL ="http://http://the-internet.herokuapp.com/checkboxes";

    @Test
    public void addRemovalElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().fullscreen();
        WebElement check1 = driver.findElement(By.name("checkbox 1"));
        assertEquals(check1, "$0");
        check1.click();
        assertEquals(check1, "cheked");

        WebElement check2 = driver.findElement(By.name("checkbox 2"));
        assertEquals(check2, "cheked");
        check2.click();
        assertEquals(check2, "$0");
        driver.quit();

    }
}
