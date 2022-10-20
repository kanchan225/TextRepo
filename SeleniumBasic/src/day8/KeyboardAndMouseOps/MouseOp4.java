package day8.KeyboardAndMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://www.facebook.com/");
        Actions act=new Actions(driver);
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        WebElement userNameInputField=driver.findElement(By.name("firstname"));
        userNameInputField.sendKeys("admin");
        userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
         //or act.doubleClick(userNameInputField).perform();
        
        userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
