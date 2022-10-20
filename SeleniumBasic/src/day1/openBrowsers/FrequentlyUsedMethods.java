package day1.openBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrequentlyUsedMethods {

	public static void main(String[] args) {
		//Set path for driver executable
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		//Create an instance of required Browser class
		WebDriver driver=new ChromeDriver();
		//enter the application URL
		driver.get("https://demo.actitime.com/login.do");
		
		//verify URL and titleh
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		System.out.println("Actual URL is: "+actualUrl);
		System.out.println("Actual Title is: "+actualTitle);
		
		String expectedUrl="https://demo.actitime.com/login.do";
		String expectedTitle="actiTIME - Login";
		
		System.out.println("URL validation: "+actualUrl.equals(expectedUrl));
		System.out.println("Title validation: "+actualTitle.equals(expectedTitle));
		
//		String pageSource=driver.getPageSource();
//		System.out.println("Page Source Length: "+pageSource.length());
//		System.out.println("Page Source content: "+pageSource);
		
		//close current browser
		//driver.close();
	}

}
/**
 Test case:
open chrome browser
enter application URL as https://demo.actitime.com
verify following component in the login page
	- title
	- url
close the browser
*/