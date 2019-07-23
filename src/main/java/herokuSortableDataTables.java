import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class herokuSortableDataTables {
    public static final String  URL ="http://the-internet.herokuapp.com/tables";

    @Test
    public void addRemovalElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().fullscreen();
        Select table1 = new Select(driver.findElement(By.id("table1")));
        WebElement box11 = driver.findElement(By.xpath("//table//tr[1]//td[1]"));
        Assert.assertEquals(box11,"Last Name");

        WebElement box12 = driver.findElement(By.xpath("//table//tr[1]//td[2]"));
        Assert.assertEquals(box12,"First Name");

        WebElement box13 = driver.findElement(By.xpath("//table//tr[1]//td[3]"));
        Assert.assertEquals(box13,"Email");

        WebElement box53 = driver.findElement(By.xpath("//table//tr[5]//td[3]"));
        Assert.assertEquals(box53,"tconway@earthlink.net");


        driver.quit();
    }
}
