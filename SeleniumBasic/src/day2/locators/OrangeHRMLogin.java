package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        String expectedTitle="OrangeHRM";
        String actualTitle=driver.getTitle();
        System.out.println("Expected Title is: "+expectedTitle);
        System.out.println("Actual Title is: "+actualTitle);
        System.out.println("Login page validation is passed: "+expectedTitle.equals(actualTitle));
        WebElement usernameInputField=driver.findElement(By.name("username"));
        usernameInputField.sendKeys("Admin");
        WebElement passwordInputField=driver.findElement(By.name("password"));
        passwordInputField.sendKeys("admin123");
        WebElement loginbutton=driver.findElement(By.className("orangehrm-login-button"));
        loginbutton.click();
        //validate home page:
        String homePageUrl=driver.getCurrentUrl();
        System.out.println("Home page validation status: "+homePageUrl.contains("viewEmployeeList"));
        System.out.println("Home page validation status: "+homePageUrl.contains("addEmployee"));
        System.out.println("Home page validation status: "+homePageUrl.contains("viewDefinedPredefinedReports"));
        System.out.println("Home page validation status: "+homePageUrl.contains("Employee Reports"));
        
        
        
	}

}
