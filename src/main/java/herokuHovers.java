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
        driver.manage().window().maximize();
        Actions action = new Actions(driver);

        WebElement us1 = driver.findElement(By.xpath("//html/body/div[2]/div/div/div[1]/img"));
        WebElement link1 = driver.findElement(By.xpath("//*[@href='/users/1']"));
        WebElement name1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/h5"));
        action.moveToElement(us1).perform();
        String profile = name1.getText();
        assertEquals(profile, "name: user1");
        action.moveToElement(us1).moveToElement(link1).click().build().perform();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        String text = driver.findElement(By.tagName("h1")).getText();
        assertEquals(text, "Not Found");


        driver.get(URL);
        driver.manage().window().maximize();
        Actions action = new Actions(driver);

        WebElement us2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        WebElement link2 = driver.findElement(By.xpath("//*[@href='/users/2']"));
        WebElement name2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h5"));
        action.moveToElement(us2).perform();
        String profile = name2.getText();
        assertEquals(profile, "name: user2");
        action.moveToElement(us2).moveToElement(link2).click().build().perform();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        String text = driver.findElement(By.tagName("h1")).getText();
        assertEquals(text, "Not Found");



        driver.get(URL);
        driver.manage().window().maximize();
        Actions action = new Actions(driver);

        WebElement us3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
        WebElement link3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/a"));
        WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/h5"));
        action.moveToElement(us3).perform();
        String profile = name.getText();
        assertEquals(profile, "name: user1");
        action.moveToElement(us3).moveToElement(link3).click().build().perform();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        String text = driver.findElement(By.tagName("h1")).getText();
        assertEquals(text, "Not Found");

    }

}
