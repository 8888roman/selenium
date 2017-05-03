package testmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Roman on 2017-05-03.
 */
public class Addsupplier {


    ChromeDriver driver = new ChromeDriver();
    private long waitTime = 1000;

    public ChromeDriver getDriver() {
        return driver;

    }

    public void fillName() throws InterruptedException {
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Siemens");
        Thread.sleep(waitTime);

    }

    public void fillName2() throws InterruptedException {
        WebElement name = driver.findElement(By.id("name2"));
        name.sendKeys("A.G.");
        Thread.sleep(waitTime);

    }

    public void fillTaxIdNumber() throws InterruptedException {
        WebElement name = driver.findElement(By.id("taxIdNumber"));
        name.sendKeys("111-222-333");
        Thread.sleep(waitTime);
    }

    public void fillAddress() throws InterruptedException {
        WebElement name = driver.findElement(By.id("address"));
        name.sendKeys("Warszawska 10");
        Thread.sleep(waitTime);
    }

    public void fillZipCode() throws InterruptedException {
        WebElement name = driver.findElement(By.id("zipCode"));
        name.sendKeys("41-902");
        Thread.sleep(waitTime);
    }

    public void fillCity() throws InterruptedException {
        WebElement name = driver.findElement(By.id("city"));
        name.sendKeys("Katowice");
        Thread.sleep(waitTime);
    }

    public void fillCountry() throws InterruptedException {
        WebElement name = driver.findElement(By.id("country"));
        name.sendKeys("Polska");
        Thread.sleep(waitTime);
    }

    public void fillContactPerson() throws InterruptedException {
        WebElement name = driver.findElement(By.id("contactPerson"));
        name.sendKeys("Jan Kowalski");
        Thread.sleep(waitTime);
    }

    public void fillEmail() throws InterruptedException {
        WebElement name = driver.findElement(By.id("email"));
        name.sendKeys("siemens@siemens.com");
        Thread.sleep(waitTime);
    }

    public void fillPhoneNumber() throws InterruptedException {
        WebElement name = driver.findElement(By.id("phoneNumber"));
        name.sendKeys("555 123 125");
        Thread.sleep(waitTime);
    }

    public void submit() throws InterruptedException {
        WebElement name = driver.findElement(By.id("submit"));
        name.click();

    }
}
