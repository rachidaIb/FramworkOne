import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amaznHomeWork {


    WebDriver driver;
    @Before
     public void setPR(){

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        driver =new ChromeDriver();

        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
        driver.manage().window().maximize();
}


    public void searBox(String keyWords) {

        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
        searchBox.clear();
        searchBox.sendKeys(keyWords);
        searchButton.click();

    }
        @Test

        public void sKeys()throws  InterruptedException {
           //Searchbox
            searBox("computer");
            Assert.assertTrue(driver.getCurrentUrl().contains("computer&ref"));
            Thread.sleep(3000);
            searBox("phones");
            WebElement phone=driver.findElement(By.xpath("//span[contains(text(),'Dual SIM 128GB, 6.7\" Display')]"));
            phone.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("Samsung-SM-G985F-Display-Unlocked-International") );

            //Add to cart
            Thread.sleep(3000);
            WebElement addToCart=driver.findElement(By.xpath("//input[@value='Add to Cart']"));
            addToCart.click();
            Assert.assertTrue(driver.findElement(By.xpath("//div[@class='a-icon-row a-spacing-micro']")).isDisplayed());
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@id='siNoCoverage-announce']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("UTF8&newItems"));

            //ckeckOut
            WebElement chechOut=driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']"));
            chechOut.click();
        }
            public void signUp(String Email,String psword){
           WebElement signIn=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
           signIn.click();
           WebElement username=driver.findElement(By.xpath("//input[@id='ap_email']"));
           username.sendKeys(Email);
           WebElement continueButton=driver.findElement(By.xpath("//input[@id='continue']"));
           continueButton.click();
           WebElement passw=driver.findElement(By.name("password"));
           passw.sendKeys(psword);
           WebElement signbutton= driver.findElement(By.xpath("//input[@type='submit']"));
           signbutton.click();

            }

           @Test
         //sign in with valid email and invalid password
           public void signWithInvalidC()throws  InterruptedException {
          signUp("rachida.ibeghouchene@gmail.com", "rachida1245");
          Thread.sleep(2000);
           Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),' Your password is incorrect')]")).isDisplayed());
           }
         @Test
          //sign in with valid email and password
             public void signUpWithValidConditial() throws  InterruptedException{
             signUp("rachida.ibeghouchene@gmail.com", "rachida82");
             Thread.sleep(2000);
             Assert.assertTrue(driver.getCurrentUrl().contains("approval?arb"));
         }

         @Test
         //sign in with invalid email
         public void signInWithIvalidEmail()throws  InterruptedException{
          signUp("dnaniel126@gmail.com","rachida82");
          Thread.sleep(3000);
          Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'We cannot find an account with that email address')]")).isDisplayed());

         }

        @Test
         public void checkHomePage()throws  InterruptedException {

            WebElement holidays=driver.findElement(By.linkText("Holiday Deals"));
            holidays.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("events"));
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            WebElement GiftCard=driver.findElement(By.xpath("//a[text()='Gift Cards']"));
            GiftCard.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("gift-cards"));

            driver.navigate().back();
            WebElement bestSellers=driver.findElement(By.xpath("//a[text()='Best Sellers']"));
            bestSellers.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("bestsellers"));

            driver.navigate().back();
            Thread.sleep(2000);
            WebElement customerService=driver.findElement(By.xpath("//a[text()='Customer Service']"));
            customerService.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("customer"));

            driver.navigate().back();
            Thread.sleep(2000);
            WebElement newReleases=driver.findElement(By.xpath("//a[text()='New Releases']"));
            newReleases.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("new-releases"));

            driver.navigate().back();
            Thread.sleep(2000);
            WebElement amazonBasics=driver.findElement(By.xpath("//a[text()='AmazonBasics']"));
            amazonBasics.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("node"));

            driver.navigate().back();
            Thread.sleep(2000);
            WebElement wholeFoods =driver.findElement(By.xpath("//a[text()='Whole Foods']"));
            wholeFoods.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("nav_cs_whole_foods"));

            driver.navigate().back();
            Thread.sleep(2000);
            WebElement freeShipping =driver.findElement(By.xpath("//a[text()='Free Shipping']"));
            freeShipping.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("nav_cs_freeshipping"));

            driver.navigate().back();
            Thread.sleep(3000);
            WebElement registry =driver.findElement(By.xpath("//a[text()='Registry']"));
            freeShipping.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("nav_cs_registry"));

        }
       @Test
        //select language

       public void sLanguage()throws  InterruptedException {
           WebElement language = driver.findElement(By.className("nav-line-2"));
           language.click();
           Thread.sleep(3000);
           Assert.assertTrue(driver.getCurrentUrl().contains("select-language"));
           WebElement rButton = driver.findElement(By.xpath("//span[contains(text(),'Español - ES')]"));
           rButton.click();

           WebElement saveChanges = driver.findElement(By.xpath("//input[@class='a-button-input']"));
           saveChanges.click();
           Assert.assertTrue(driver.getCurrentUrl().contains("?language=es_US"));

       }
           @Test
             //dropDown

           public void dDown()throws InterruptedException {
          WebElement select= driver.findElement(By.id("searchDropdownBox"));
          select.click();
          Select dropDown= new Select(select);
          Thread.sleep(3000);
          dropDown.selectByVisibleText("Baby");
           WebElement searchButtn=driver.findElement(By.xpath("//input[@value='Go']"));
           searchButtn.click();
           Assert.assertTrue(driver.getCurrentUrl().contains("b?node=165796011"));

           }









          @After

         public void tearDown(){

      //driver.close();

    }
}
