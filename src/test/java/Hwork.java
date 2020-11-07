import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hwork {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void checkLink() {

        driver.get("https://www.testandquiz.com/selenium/testing.html");
        Assert.assertTrue(driver.getCurrentUrl().contains("selenium"));
        driver.findElement(By.linkText("This is a link")).click();
       Assert.assertTrue(driver.getTitle().contains("Tutorials List - Javatpoint"));
        driver.findElement(By.linkText("DS")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("structure"));
        driver.findElement(By.id("gsc-i-id1")).sendKeys("ds structure");
        driver.findElement(By.id("gs_cb50")).click();
        driver.findElement(By.id("gsc-i-id1")).sendKeys("ds array" + Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().contains("data-structure-tutorial"));
    }

      @Test
     public void ckeckLink2(){
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        Assert.assertTrue(driver.getCurrentUrl().contains("testing"));
        driver.findElement(By.linkText("This is a link")).click();
        Assert.assertTrue(driver.getTitle().contains("Tutorials List - Javatpoint"));
        driver.findElement(By.linkText("Gmail")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("gmail"));

      }

      @Test
      public void textBox(){
          driver.get("https://www.testandquiz.com/selenium/testing.html");
          Assert.assertTrue(driver.getCurrentUrl().contains("selenium"));
          driver.findElement(By.name("firstName")).sendKeys("automation");
           driver.findElement(By.id("idOfButton")).click();
           //Assert.assertFalse(driver.getTitle().contains("Click me"));//
      }

    @Test

    public void dropDEx1() {
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        Assert.assertTrue(driver.getCurrentUrl().contains("selenium"));
        //driver.findElement(By.id("testingDropdown"));//
        WebElement D = driver.findElement(By.id("testingDropdown"));
        Select dropDown = new Select(D);
        dropDown.selectByValue("Performance");
       // Assert.assertTrue(driver.findElement(By.id("testingDropdown")).isSelected());//
    }
        @Test
      public void dropDEx2() {
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        Assert.assertTrue(driver.getCurrentUrl().contains("selenium"));
        WebElement C = driver.findElement(By.id("testingDropdown"));
        Select dropDown = new Select(C);
        dropDown.selectByVisibleText("Automation Testing");
        }
            @Test
          public void dropDEx3(){
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        Assert.assertTrue(driver.getCurrentUrl().contains("selenium"));
        WebElement S=driver.findElement(By.id("testingDropdown"));
        Select dropDown= new Select(S);
           dropDown.selectByIndex(3);
        }

    @After
    public void teaDown() {
        //driver.close();//
    }

}


