package Testing;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {
   @Test
   public void func2() {
	   WebDriver driver =new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
     
	try {
     
       driver.get("https://www.google.com");

     
       WebElement searchBox = driver.findElement(By.name("q"));

     
       searchBox.sendKeys("Selenium WebDriver");

      
       Thread.sleep(2000);

       
       Actions actions = new Actions(driver);
       actions.sendKeys(Keys.DOWN).perform();  
       Thread.sleep(1000);
       actions.sendKeys(Keys.DOWN).perform(); 
       Thread.sleep(1000);
       actions.sendKeys(Keys.RETURN).perform(); 


       Thread.sleep(2000);

      
       System.out.println("Page Title: " + driver.getTitle());
       AssertJUnit.assertTrue(true);

   } catch (Exception e) {
       e.printStackTrace();
       AssertJUnit.assertTrue(false);
   } finally {
      
       driver.quit();
   }
   }
}
