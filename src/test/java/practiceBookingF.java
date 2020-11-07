import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceBookingF {


    WebDriver driver;


    @Before
    public void autM(){

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        driver= new ChromeDriver();

    }
    @Test
     public void dROpD() {

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertTrue(driver.getCurrentUrl().contains("dropdownsPractise"));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        driver.findElement(By.id("hrefIncAdt")).click();

        driver.findElement(By.id("hrefIncAdt")).click();

        driver.findElement(By.id("btnclosepaxoption")).click();

    }
        @Test
            public void denamicDrD3(){

            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            Assert.assertTrue(driver.getCurrentUrl().contains("dropdownsPractise"));
            driver.manage().window().maximize();
            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
            driver.findElement(By.xpath("//a[@value='BLR']")).click();
            driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();


}
   @Test

           public void dropD2() {


       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       WebElement s = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
       Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
       select.selectByVisibleText("USD");
   }

        @Test
                public void drD3(){






   }

    @After

    public void tearDown(){

       // driver.close();


    }


}
