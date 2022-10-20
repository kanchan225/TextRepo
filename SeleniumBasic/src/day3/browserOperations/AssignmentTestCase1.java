package day3.browserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTestCase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(650, 450));
        Thread.sleep(2000);
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        String pageTitle=driver.getTitle();
        System.out.println("Login Page Title: "+pageTitle);
        //choose sell link from menu list
        WebElement sellbutton=driver.findElement(By.id("nav-xshop"));
        sellbutton.click();
        System.out.println("Sell Page Title: "+driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        String pageTitle1=driver.getTitle();
        System.out.println("Login Page Title: "+pageTitle1);
        System.out.println("Validate home page title before and after: "+pageTitle.equals(pageTitle1));
        Thread.sleep(2000);
        //driver.close();
       
	}

}
