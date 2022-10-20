package day1.openBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Amazon {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");	
    WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in");
    //driver.get("https://www.amazon.in/ap/signin/");
	
	String actualUrl=driver.getCurrentUrl();
	String actualTitle=driver.getTitle();
	System.out.println("Actual URL is: "+actualUrl);
	System.out.println("Actual Title is: "+actualTitle);
	
	String expectedUrl="https://www.amazon.in/";
	String expectedTitle="Amazone.in";
//	String expectedUrl="https://www.amazon.in/ap/signin/";
//	String expectedTitle="Amazon Sign In";
	
	System.out.println("URL validation: "+actualUrl.equals(expectedUrl));
	System.out.println("URL validation: "+actualTitle.equals(expectedTitle));
	
	String pageSource=driver.getPageSource();
	System.out.println("Page Source length: "+pageSource.length());
	//System.out.println("Page Source content: "+pageSource);
	}

}
