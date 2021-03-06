import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class BaseClass {

    /*public void setLevel(){
       Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
   } */


    public static WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikola.zlatkovic\\Desktop\\Selenium\\1\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void HomePageVerification(){
        driver.get("Https://blic.rs");
        String sTitle =  "Blic Online - Najposećeniji sajt u Srbiji";
        Assert.assertTrue(driver.getTitle().contains("Blic "));
     //   Assert.assertEquals(sTitle, driver.getTitle().contains("Blic "));
    }

    @Test (dependsOnMethods={"HomePageVerification"})
    public void SportPageVerifiation(){
        WebElement wSport = driver.findElement(By.xpath("//a[@href = \"//sport.blic.rs/\"]"));
        wSport.click();
        String sSport = "Blic Sport";
        Assert.assertEquals(sSport, driver.getTitle());

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}

