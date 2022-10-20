package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
//get the menu option count and print of automation demo site
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://demo.automationtesting.in/Register.html");
	    
	    List<WebElement> menu=driver.findElements(By.cssSelector("ul.nav.navbar-nav>li>a"));
	    System.out.println("count of menu options: "+menu.size());
	    
	    for(int i=0; i<menu.size();i++) {
	    	System.out.println(menu.get(i).getText());
	    }

	}

}
