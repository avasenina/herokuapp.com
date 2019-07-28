import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class herokuDropDown {

    public static final String  URL ="http://the-internet.herokuapp.com/inputs";

    @Test
    public void checkInput() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().fullscreen();

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByValue("Option 1");
        String text = select.getFirstSelectedOption().getText();
        assertEquals(text, "Option 1");


        select.selectByValue("Option 1");
        String text1 = select.getFirstSelectedOption().getText();
        assertEquals(text1, "Option 2");

        driver.quit();
    }
}
