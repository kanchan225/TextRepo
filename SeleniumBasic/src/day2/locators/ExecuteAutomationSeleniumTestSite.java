package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class ExecuteAutomationSeleniumTestSite {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver","D:\\Workspace\\SeleniumBasic\\executable\\geckodriver.exe");
//        WebDriver driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demosite.executeautomation.com/Login.html");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        String expectedTitle="Execute Automation";
        String expectedUrl="https://demosite.executeautomation.com/Login.html";
        String actualTitle = driver.getTitle();
        String actualUrl=driver.getCurrentUrl();
        System.out.println("Expected Title is: "+expectedTitle);
        System.out.println("Actual Title is: "+actualTitle);
        System.out.println("Title Length is: "+actualTitle.length());
        System.out.println("Login page title validation is passed: "+actualTitle.equals(expectedTitle));
        System.out.println("URL validation is passed/Correct page is opened: "+actualUrl.equals(expectedUrl));
	    
        //WebElement userNameField=driver.findElement(By.name("UserName"));
        driver.findElement(By.name("UserName")).sendKeys("execution");
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[name='Login']")).click();
        
        
	}

}
