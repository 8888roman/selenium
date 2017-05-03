import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testmethods.Addsupplier;
/**
 * Created by Roman on 2017-04-27.
 */
public class TestSelenium {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Roman/IdeaProjects/selenium/chromedriver.exe");
        Addsupplier addsupplier = new Addsupplier();
       addsupplier.getDriver().get("http://localhost:8080/addsupplier");

       addsupplier.fillName();

       addsupplier.fillName2();

       addsupplier.fillTaxIdNumber();

       addsupplier.fillAddress();

       addsupplier.fillZipCode();

       addsupplier.fillCity();

       addsupplier.fillCountry();

       addsupplier.fillContactPerson();

       addsupplier.fillEmail();

       addsupplier.fillPhoneNumber();

       addsupplier.submit();





    }








}
