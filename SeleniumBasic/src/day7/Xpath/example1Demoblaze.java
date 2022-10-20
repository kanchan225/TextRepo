package day7.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1Demoblaze {

	public static void main(String[] args) {
		
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeExePath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //xpath for get a price for Sony xperia z5
        WebElement phonePrice=driver.findElement(By.xpath("//div[h4[a[text()='Sony xperia z5']]]/h5"));
	    System.out.println(phonePrice);                    
	}

}
