package day7.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3Amazon {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// explicit wait(static wait)
			Thread.sleep(2000);
			// maximize browser window
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc");
		    //xpath for birthday checkbox
		    driver.findElement(By.xpath("//li[span[a[span[text()='Birthday']]]]/span/a/div/label/input"));//or
		    //or driver.findElement(By.xpath("//li[span[a[span[text()='Birthday']]]]//input"));
		    //or driver.findElement(By.xpath("//a[span[text()='Birthday']]/div/label/input"));
		    //or driver.findElement(By.xpath("//a[span[text()='Friendship']]/div/label/input//preceding::li[4]"));
	
		    //xpath for friendShip checkbox
		    driver.findElement(By.xpath("//a[span[text()='Friendship']]/div/label/input"));
		    driver.findElement(By.xpath("//a[span[text()='Birthday']]/div/label/input//following::li[4]"));
	}

}
