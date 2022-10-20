package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTC3 {

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
	    String actualTitle=driver.getTitle();
		System.out.println("Actual Title is: "+actualTitle);
		String expectedTitle="GSMARENA.com";
		System.out.println("Expected Title is: "+expectedTitle);
		System.out.println("Home page Title validation: "+actualTitle.equals(expectedTitle));
		//get mobile phone name
		List<WebElement> mobileList=driver.findElements(By.cssSelector("div#body>aside>*:first-child>ul>li>a"));
	    //mobile phone name count 
		System.out.println("Mobile phone name count from phone finder: "+mobileList.size());
		//print all phone name
		for(int i=0;i<mobileList.size();i++) {
			System.out.println(mobileList.get(i).getText());
		}
	}

}
