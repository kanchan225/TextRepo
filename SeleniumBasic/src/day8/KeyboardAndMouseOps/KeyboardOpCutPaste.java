package day8.KeyboardAndMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOpCutPaste {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		//identify first name input field
        WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        //type firstname as admin and use ctrl+a
        firstname.sendKeys("admin", Keys.chord(Keys.CONTROL,"a"));
        //in firstName field use ctrl+x
        firstname.sendKeys(Keys.chord(Keys.CONTROL,"x"));
        //in last name field use ctrl+v (paste the first name input in the last name field)
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
