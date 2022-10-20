package day6.cssAttributevalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssValueValidation {
	/**
	 * Open a browser and enter vtiger application URL 
	 * validate in login page Signin
	 * 			button is displayed in Green color(code) 
	 * 			Signin text size is 16px 
	 * 			Signin text in white color(code) 
	 * 			Forgot Password ? is displayed in Blue color(code)
	 */
	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement signInButton=driver.findElement(By.className("buttonBlue"));
		System.out.println("Font color: "+signInButton.getCssValue("color"));
		System.out.println("Font size: "+signInButton.getCssValue("font-size"));
		System.out.println("background color of button: "+signInButton.getCssValue("background-image"));
		
		WebElement forgotPasswordLink=driver.findElement(By.className("forgotPasswordLink"));
		System.out.println("Font color: "+forgotPasswordLink.getCssValue("color"));
		
	}
}
