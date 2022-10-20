package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerLogin {

	public static void main(String[] args) {
		// step1;open chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// step2;enter app URL
        driver.get("https://demo.vtiger.com/vtigercrm/index.php");
        //step3;Validate login page
        String expectedTitle="vtiger";
        String actualTitle = driver.getTitle();
        System.out.println("Expected Title is: "+expectedTitle);
        System.out.println("Actual Title is: "+actualTitle);
        System.out.println("Login page validation is passed: "+actualTitle.equals(expectedTitle));
	    //step4:remove existing text from username field
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.clear();
        //step5:remove existing text from password field
        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.clear();
        //step6:type username as admin;
        userNameField.sendKeys("admin");
        //step7:type password as Test@123;
        passwordField.sendKeys("Test@123");
        //step8;Click on Signin button;
        driver.findElement(By.className("button")).click();
//        WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
//		//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	}

}
