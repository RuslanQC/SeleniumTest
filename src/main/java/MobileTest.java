import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class MobileTest {

    @Test

    public void checkMobilePayment(){
         System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://next.privat24.ua/mobile");

        By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");

        driver.findElement(phoneNumber).sendKeys("633766020");

        By amount = By.xpath("//input[@data-qa-node='amount']");

        driver.findElement(amount).sendKeys("50");

        By numberdebitSource = By.xpath("//input[@data-qa-node='numberdebitSource']");

        driver.findElement(numberdebitSource).sendKeys("4506909324274797");

        By expiredebitSource = By.xpath("//input[@data-qa-node='expiredebitSource']");

        driver.findElement(expiredebitSource).sendKeys("06/22");

        By cvvdebitSource = By.xpath("//input[@data-qa-node='cvvdebitSource']");

        driver.findElement(cvvdebitSource).sendKeys("327");

        By submit = By.xpath("//input[@data-qa-node='submit']");

        driver.findElement(By.xpath("//button[@data-qa-node='submit']")).click();

        driver.findElement(By.xpath(".//button[contains(text(), 'Сплатити')]")).click();

    }


}
