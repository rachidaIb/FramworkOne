import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrstProj {

    WebDriver driver;

    @Before
    public void setUp(){
      System.setProperty("webdriver.chrome.driver" ,"C:\\Drivers\\chromedriver.exe");
        driver= new ChromeDriver();
    }
    @Test
    public void ckeckUrl(){
         driver.get("https://www.google.com/");
    }
   @Test
    public void ckekFc(){
        driver.get("https://www.facebook.com/");
    }
    @After
    public void turnDown(){
        driver.close();
    }
}
