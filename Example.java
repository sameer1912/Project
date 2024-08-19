package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Example {
  public static void main(String args[]) {
	  try {
		  WebDriver driver =new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			
	      
			 driver.get("https://example.com/");
			 driver.manage().window().maximize();
			 WebElement link = driver.findElement(By.linkText("More information..."));
			 Thread.sleep(2000);
	         link.click();
	         
	        
	         link = driver.findElement(By.linkText("Domains"));
	         Thread.sleep(2000);
	         link.click();
	        
	         
	         link = driver.findElement(By.linkText(".ARPA Registry"));
	         Thread.sleep(2000);
	         link.click();
	       
	         
	         link = driver.findElement(By.linkText("Protocols"));
	         Thread.sleep(2000);
	         link.click();
	    
	         
	         link = driver.findElement(By.linkText("Performance"));
	         Thread.sleep(2000);
	         link.click();
	          
	         
	         
	         link = driver.findElement(By.linkText("Numbers"));
	         Thread.sleep(2000);
	         link.click();
	         
	         
	         link = driver.findElement(By.linkText("IPv6 (AFRINIC)"));
	         Thread.sleep(2000); 
	         link.click();
	         
	         
	         
	         link = driver.findElement(By.linkText("About"));
	         Thread.sleep(1000);
	         link.click();
	       
	        
	         link = driver.findElement(By.linkText("Performance Reporting"));
	         Thread.sleep(1000);
	         link.click();
	        
	         
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	 
  }
}
