package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTC4 {

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
		//get device count
		List<WebElement> samsungPhone=driver.findElements(By.cssSelector("div.makers>ul>li>a>strong>span"));
		System.out.println("device count of samsung phone: "+samsungPhone.size());
		//print all devices name
		for(int i=0;i<samsungPhone.size();i++) {
			System.out.println(samsungPhone.get(i).getText());
		}
	}

}
