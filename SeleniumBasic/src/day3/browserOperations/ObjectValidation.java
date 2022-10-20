package day3.browserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectValidation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //identify username input field & then validation on username field
	    WebElement userNameInputField=driver.findElement(By.name("username"));
	    System.out.println("User name input field is Visible or not ? "+userNameInputField.isDisplayed());
	    System.out.println("User name input field is editable or not ? "+userNameInputField.isEnabled());
	    String defaultValue=userNameInputField.getAttribute("placeholder");
	    System.out.println("User name input field default value ? "+defaultValue);
	  //identify login button & then validation on it
	    WebElement loginBtn=driver.findElement(By.className("orangehrm-login-button"));
	    System.out.println("Login button is Visible or not ? "+loginBtn.isDisplayed());
	    System.out.println("Login button functional or not ? "+loginBtn.isEnabled());
	    String buttonName=loginBtn.getText();
	    System.out.println("button name is : "+buttonName);
	    }
}
/*
 * Basic Validation on username input field
		 * - visible or not
		 * - editable or not
		 * - default text
 * Basic Validation on login button
		 * - visible or not
		 * - functional or not
		 * - default text
 */
