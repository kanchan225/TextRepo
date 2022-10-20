package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2TC4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.gsmarena.com/");
        //validate home page
		String expectedTitle="GSMArena.com - mobile phone reviews, news, specifications and more...";
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title is: "+actualTitle);
		System.out.println("Expected Title is: "+expectedTitle);
		System.out.println("Home page Title validation: "+actualTitle.equals(expectedTitle));
		//click on samsung phone link present on phone finder
		driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
        //check wehether page has pagination or not
		WebElement pagination=driver.findElement(By.className("nav-pages"));
		System.out.println("Page has pagination: "+pagination.isDisplayed());
		//print pagination link names
		List<WebElement> page=driver.findElements(By.cssSelector(".nav-pages>a"));
		System.out.println("count of pages: "+page.size());
		for(int i=0;i<page.size();i++) {
			System.out.println(page.get(i).getText());
		}
		//navigate to each page and get the page url
		System.out.println("current URL: "+driver.getCurrentUrl());
		List<WebElement> nextbutton=driver.findElements(By.className("pages-next"));
		for(int i=0;i<page.size();i++) {
			//page.get(i).click();
			nextbutton.get(i).click();	
			System.out.println(driver.getCurrentUrl());
	      }
	}
}
