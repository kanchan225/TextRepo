package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.demoblaze.com/");
        List<WebElement> mobileName=driver.findElements(By.cssSelector("div#tbodyid>div>div>div>h4>a"));
        List<WebElement> mobilePrice=driver.findElements(By.cssSelector("div#tbodyid>div>div>div>h5"));
        
        for(int i=0;i<mobileName.size();i++) {
        	System.out.println(mobileName.get(i).getText()+"--->"+mobilePrice.get(i).getText());
        }
	}

}
