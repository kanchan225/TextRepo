package day1.openBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        String actualUrl=driver.getCurrentUrl();
        String actualTitle=driver.getTitle();
        System.out.println("Actual URL is: "+actualUrl);
        System.out.println("Actual Title is: "+actualTitle);
        
        String expectedUrl="https://www.facebook.com/";
        String expectedTitle="Sign up for Facebook";
        
        System.out.println("URL validation: "+actualUrl.equals(expectedUrl));
		System.out.println("Title validation: "+actualTitle.equals(expectedTitle));
		
		String PageSource=driver.getPageSource();
		System.out.println("Page source length: "+PageSource.length());
		System.out.println("Page source content: "+PageSource);
		
		driver.close();
		
	}

}
