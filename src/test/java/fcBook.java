import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fcBook {

    WebDriver driver;

    @Before

    public void seUp(){
        System.setProperty("webdriver.chrome.driver" ,"C:\\Drivers\\chromedriver.exe");
        driver= new ChromeDriver();

    }

    @Test
    public void checkUrl(){

        driver.get("https://www.facebook.com/");
         String actualTitle= driver.getTitle();
         System.out.println(actualTitle);
         String expactedTitle="Facebook - Log In or Sign Up";
        Assert.assertTrue(actualTitle.equals(expactedTitle));


        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
    @Test
    public void srch() {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("selenium Webdriver" + Keys.ENTER);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("selenium"));

    }
        @Test
        public void checkT() {
            driver.get("https://www.google.com/");
            driver.findElement(By.linkText("Advertising")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Google Ads";

            Assert.assertTrue(driver.getTitle().contains("Google Ads"));
            driver.findElement(By.linkText("How it works")).click();

            Assert.assertTrue(driver.getCurrentUrl().contains("how-it-works"));

            driver.findElement(By.linkText("Cost")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("pricing"));
        }

        @Test
         public void check(){
        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.findElement(By.linkText("Advertising")).click();
        String actualTitle= driver.getCurrentUrl();
        String expectedTitle= ("Google Ads");
        Assert.assertTrue(driver.getTitle().contains("Google Ads "));
        driver.findElement(By.linkText("Cost")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("pricing"));
    }
      @Test
      public void chEck() {
          driver.get("https://www.google.com/");
          Assert.assertTrue(driver.getTitle().contains("Google"));
          driver.findElement(By.linkText("Advertising")).click();
          Assert.assertTrue(driver.getCurrentUrl().contains("home"));
          driver.findElement(By.linkText("Advanced campaigns")).click();
          Assert.assertTrue(driver.getCurrentUrl().contains("resources"));
      }
        @Test

       public void sgnIn(){
            driver.get("https://www.google.com/");
            Assert.assertTrue(driver.getTitle().contains("Google"));
            driver.findElement(By.linkText("Advertising")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("home"));
            driver.findElement(By.linkText("Sign in")).click();
            Assert.assertTrue(driver.getTitle().equals("Google Ads - Sign in"));
            driver.findElement(By.name("identifier")).sendKeys("ravg152@gmail"+Keys.ENTER);
            Assert.assertTrue(driver.getTitle().contains("Google Ads - Sign in"));






      }


    @After
    public void turnDown(){
        driver.close();

    }

}
