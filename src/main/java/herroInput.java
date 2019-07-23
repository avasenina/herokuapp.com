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

            // 1. Найти элемент
            // 2. Ввести цифру
            // 3. Сравнить текст равен цифре
            // 4. Нажать кнопку вверх
            // 5. Проверить увеличение
            // 6. Нахать кнопку вниз
            // 7. Проверить уменьшение на 1
            // 8. Ввести текст
            // 9. Проверить что будет




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
