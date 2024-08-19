package Testing;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Testing.SeleniumScripts.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test4 {
		@Test
		public void func4() {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");

		        
		        WebDriver driver = new FirefoxDriver();

		        try {
		          
		            driver.get("https://demoqa.com/automation-practice-form");

		            
		            driver.manage().window().maximize();

		         
		            QAFormPOM formPage = new QAFormPOM(driver);

		           
		            formPage.setFirstName("Sameer");
		            formPage.setLastName("Bhardwaj");
		            formPage.setEmail("bhardwaj.sam19@gmail.com");
		            formPage.selectGender();
		            formPage.setUserNumber("7719610705");
		            formPage.setDateOfBirth("December", "2001", "19");
		            formPage.setSubjects("Computer Science and Engineering");
		            formPage.selectHobbies();
		            formPage.uploadPicture("E:\\Wallpapers\\WhatsApp Image 2022-10-14 at 11.04.17.jpeg");
		            formPage.setAddress("Gurugram, Haryana");
		            formPage.selectState("Haryana");
		            formPage.selectCity("Gurugram");
		            formPage.submitForm();
		            Thread.sleep(3000);
		            AssertJUnit.assertTrue(true);

		        } catch (Exception e) {
		            e.printStackTrace();
		            AssertJUnit.assertTrue(false);
		        } finally {
		          
		            driver.quit();
		        }
		}
}
