package day8.KeyboardAndMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	    
	    driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	    
	    Thread.sleep(1500);
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
	    /**
	     * possible ways to refresh the browser
	     * 1- driver.navigate().refresh()
	     * 2- sendKeys(Keys.F5)
	     * 3- by hitting same URL again
	     * 4- ctrl+R
	     */
	    

	}

}
