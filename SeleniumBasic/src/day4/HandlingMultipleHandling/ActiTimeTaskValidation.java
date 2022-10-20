package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTaskValidation {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
//		String driverPath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		//enter the username and password and login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//click on task tab
		driver.findElement(By.id("container_tasks")).click();
		//click on addnew and select newtask
		driver.findElement(By.className("ellipsis")).click();
		driver.findElement(By.className("createNewTasks")).click();
		//select customer galaxy corporation
		driver.findElement(By.cssSelector("div.customer>*:nth-child(2)>div>div>*:last-child")).click();
		List<WebElement> customer= driver.findElements(By.cssSelector("div[style='display: block; top: 30px; left: 0px;']>div>div>div>div"));
		customer.get(4).click();
		//List<WebElement> options=driver.findElements(By.cssSelector(""));
	}

}
