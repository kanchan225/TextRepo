package day2.locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
//		String chromeExePath=System.getProperty("user.dir") +"\\executable\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver","chromeExePath");
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        
        //fluent Wait declaration
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver);
       //.withTimeout(Duration.ofSeconds(30));
        ((FluentWait<WebDriver>) wait).withTimeout(Duration.ofSeconds(30));
       // .pollingEvery(Duration.ofSeconds(30));
        ((FluentWait<WebDriver>) wait).pollingEvery(Duration.ofSeconds(30));
       // .ignoring(NoSuchElementException.class);
        ((FluentWait<WebDriver>) wait).ignoring(NoSuchElementException.class);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
        System.out.println("Home page Title: "+driver.getTitle());
	}

}
