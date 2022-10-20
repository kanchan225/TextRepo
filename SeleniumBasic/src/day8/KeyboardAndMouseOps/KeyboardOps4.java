package day8.KeyboardAndMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	    //Using Escape of keyboard to avoid login popup
	    WebElement element=driver.findElement(By.xpath("//body"));
	    element.sendKeys(Keys.ESCAPE);
	    //scrolling using page down button
//	    for(int i=0;i<10;i++) {
//	    	element.sendKeys(Keys.PAGE_DOWN);
//	    	Thread.sleep(1500);
//	    }
	    Thread.sleep(1500);
	    //scrolling - directly goto bottom of the page
	    element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
	   //or  element.sendKeys(Keys.END);
	    
	    Thread.sleep(1500);
	    //scrolling - directly goto Top of the page
	    element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
	   // or element.sendKeys(Keys.HOME);
	    

	}

}
