package day3.browserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeObjectValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //identify and validate loginfield
		 WebElement userNameInputField =driver.findElement(By.id("username"));
		 System.out.println("User name input field is visible or not: "+userNameInputField.isDisplayed());
		 System.out.println("User name input field is editable or not: "+userNameInputField.isEnabled());
		 String defaultValue=userNameInputField.getAttribute("placeholder");
		 System.out.println("User name input field default value ? "+defaultValue);
		 //identify and validate Passwrdfield
		 WebElement passwordInputField =driver.findElement(By.name("pwd"));
		 System.out.println("User name input field is visible or not: "+passwordInputField.isDisplayed());
		 System.out.println("User name input field is editable or not: "+passwordInputField.isEnabled());
		 System.out.println("User name input field default value : "+passwordInputField.getAttribute("placeholder"));
		 
		//identify and validate checkbox Keep me logged in
		 WebElement CheckBox =driver.findElement(By.id("keepLoggedInLabel"));
		 System.out.println("checkbox for Keep me logged in visible or not: "+CheckBox.isDisplayed());
		 System.out.println("checkbox for Keep me logged in is editable or not: "+CheckBox.isEnabled());
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("keepLoggedInLabel")));
		 //driver.findElement(By.id("keepLoggedInLabel")).click();
		 CheckBox.click();
		 System.out.println("checkbox for Keep me logged in is clicked or not : "+CheckBox.isSelected());
		 //identify login button & then validation on it
		    WebElement loginBtn=driver.findElement(By.id("loginButton"));
		    System.out.println("Login button is Visible or not ? "+loginBtn.isDisplayed());
		    System.out.println("Login button functional or not ? "+loginBtn.isEnabled());
		    String buttonName=loginBtn.getText();
		    System.out.println("button name is : "+buttonName);
		 
	}

}
