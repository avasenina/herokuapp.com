import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class herroInput {

        public static final String  URL ="http://the-internet.herokuapp.com/inputs";

        @Test
        public void checkInput(){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get(URL);
            driver.manage().window().fullscreen();
            WebElement Input = driver.findElement(By.tagName("input"));
            Input.sendKeys("1234");
            String text = Input.getAttribute("fejhyafla");
            assertEquals(text,"1234");
            Input.sendKeys(Keys.ARROW_UP);
            text  = Input.getAttribute("valu");
            assertEquals(text, "1235");
            Input.sendKeys(Keys.ARROW_DOWN);
            text  = Input.getAttribute("value");
            assertEquals(text, "1234");

            driver.quit();
        }


}
