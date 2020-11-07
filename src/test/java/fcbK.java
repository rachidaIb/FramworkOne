import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fcbK {

       WebDriver driver;

    @Before
    public void setPro(){

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
    }

    @Test
    public void chekurl(){
        driver= new ChromeDriver();
        driver.get("https:/www.facebook.com/");
        Assert.assertTrue(driver.getTitle().contains("Facebook"));
        driver.findElement(By.name("email")).sendKeys("gtfsi45@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("1245gbhf");
        driver.findElement(By.name("login")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='The email you’ve entered doesn’t match any account. ']" )).isDisplayed());



    }



    @After

    public void tearDown(){
     //driver.close();//

    }
}