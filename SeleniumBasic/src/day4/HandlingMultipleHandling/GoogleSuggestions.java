package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.google.com");
	    
	    driver.findElement( By.name("q")).sendKeys("Selenium");
	    //get the suggestion from the google search page
	    List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>span"));
	    //get suggestion count
	    System.out.println("Suggestion count is: "+suggList.size());
	    //to get element from list
	    WebElement firstSugg=suggList.get(0);
	    System.out.println("First Suggestion name: "+firstSugg.getText());
	    //or
	    System.out.println("First Suggestion name: "+suggList.get(0).getText());
	    
	    for(int i=0; i<suggList.size();i++) {
	    	System.out.println(i+" Suggestion name: "+suggList.get(i).getText());
	    }

	}

}
