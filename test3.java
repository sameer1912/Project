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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class test3 {
@Test
public void func3() {
	 try {
  	   
	       
	        WebDriver driver =new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			
	    
			 driver.get("https://demoqa.com/automation-practice-form");

		      
		        driver.manage().window().maximize();

		      
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		       
		        driver.findElement(By.id("firstName")).sendKeys("Sameer");
		        driver.findElement(By.id("lastName")).sendKeys("Bhardwaj");
		        driver.findElement(By.id("userEmail")).sendKeys("bhardwaj.sam19@gmail.com");

		     
		        WebElement genderRadioButton = driver.findElement(By.xpath("//label[text()='Male']"));
		        js.executeScript("arguments[0].click();", genderRadioButton);

		        driver.findElement(By.id("userNumber")).sendKeys("7719610705");

		       
		        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
		        js.executeScript("arguments[0].click();", dateOfBirthInput);
		        WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
		        Select monthSelect = new Select(monthDropdown);
		        monthSelect.selectByVisibleText("December");

		        WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
		        Select yearSelect = new Select(yearDropdown);
		        yearSelect.selectByVisibleText("2001");

		        WebElement day = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='24']"));
		        js.executeScript("arguments[0].click();", day);

		      
		        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
		        subjectsInput.sendKeys("Computer Science and Engineering");
		        subjectsInput.sendKeys(Keys.ENTER);

		        
		  

		        WebElement musicCheckbox = driver.findElement(By.xpath("//label[text()='Music']"));
		        js.executeScript("arguments[0].click();", musicCheckbox);

		     
		        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\HP\\Desktop\\214 copy.jpg");

		   
		        driver.findElement(By.id("currentAddress")).sendKeys("Gurugram , Haryana");

		      
		        WebElement state = driver.findElement(By.id("react-select-3-input"));
		        state.sendKeys("Haryana");
		        state.sendKeys(Keys.ENTER);

		        WebElement city = driver.findElement(By.id("react-select-4-input"));
		        city.sendKeys("Gurugram");
		        city.sendKeys(Keys.ENTER);

		  
		        WebElement submitButton = driver.findElement(By.id("submit"));
		        js.executeScript("arguments[0].click();", submitButton);
		        	
		        AssertJUnit.assertTrue(true);

	       
	       // driver.quit();
	       }
	       catch(Exception e) {
	    	   e.printStackTrace();
	    	   AssertJUnit.assertTrue(false);
	       }
}
}
