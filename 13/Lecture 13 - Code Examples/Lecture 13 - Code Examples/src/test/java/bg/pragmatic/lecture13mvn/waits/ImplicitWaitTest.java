package bg.pragmatic.lecture13mvn.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {
 	@Test
 	public void testWithOutWait()
 	{
 		//Go to the Demo AjAX Application
 		System.setProperty("webdriver.chrome.driver" ,"C:\\Desi\\Program Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://pragmatic.bg/automation/ajax/demo.html");
        
        try {
        	
        	//Get link for Page 4 and click on it
        	WebElement page4button = driver.findElement(By.linkText("Page 4"));
        	page4button.click();
        	        
        	//Get an element with id page4 and verify it's text
        	//Test will fail to locate the element without an Implicit Wait
        	WebElement message = driver.findElement(By.xpath("//div[contains(text(),'Nunc nibh tortor')]"));
           	assertTrue(message.getText().contains("Nunc nibh tortor"));
        } catch (NoSuchElementException e) {
        	e.printStackTrace();
        	fail("Element not found!!");
        } finally {
 			driver.quit();
        }
 	}
 	
 	@Test
 	public void testWithImplicitWait()
 	{
 		//Go to the Demo AjAX Application
 		System.setProperty("webdriver.chrome.driver" ,"C:\\Desi\\Program Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://pragmatic.bg/automation/ajax/demo.html");
        
        //Set the Implicit Wait time Out to 10 Seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 		try {

 			//Get link for Page 4 and click on it
 			WebElement page4button = driver.findElement(By.linkText("Page 4"));
 			page4button.click();
 		
 			//Get an element with id page4 and verify it's text
 			WebElement message = driver.findElement(By.xpath("//div[contains(text(),'Nunc nibh tortor')]"));
 			System.out.println(message.getText());
 			assertTrue(message.getText().contains("Nunc nibh tortor"));
 			
 		} catch (NoSuchElementException e) {
 			e.printStackTrace();
 			fail("Element not found!!");

 		} finally {
 			driver.quit();
 		}
 	}
}