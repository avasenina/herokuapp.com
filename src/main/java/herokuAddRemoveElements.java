import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class herokuAddRemoveElements {
    public static final String  URL ="http://the-internet.herokuapp.com/add_remove_elements/";


    @Test
    public void addRemovalElement(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        WebElement addElement = driver.findElement(By.xpath("//*[text()='Add Element']"));
        addElement.click();
        List<WebElement> deleteElement = driver.findElements(By.xpath("//*[text()='Delete']"));
        assertEquals(deleteElement.size(),1);
        addElement.click();
        deleteElement = driver.findElements(By.xpath("//*[text()='Delete']"));
        assertEquals(deleteElement.size(),2);

        deleteElement.get(1).click();
        deleteElement = driver.findElements(By.xpath("//*[text()='Delete']"));
        Assert.assertEquals(deleteElement.size(), 1);
        driver.quit();

    }
}
