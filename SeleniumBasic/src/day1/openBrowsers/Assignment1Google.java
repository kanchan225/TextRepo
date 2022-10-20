package day1.openBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        
		driver.get("https://www.google.com");
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		System.out.println("Actual URL is: "+actualUrl);
		System.out.println("Actual Title is: "+actualTitle);
		
		String expectedUrl="https://www.google.com/";
		String expectedTitle="Google";
		
		System.out.println("URL validation: "+actualUrl.equals(expectedUrl));
		System.out.println("Title validation: "+actualTitle.equals(expectedTitle));
		
		String pageSource=driver.getPageSource();
		System.out.println("Page Source Length: "+pageSource.length());
//		System.out.println("Page Source content: "+pageSource);
		
		//close current browser
		//driver.close();
	}

}
