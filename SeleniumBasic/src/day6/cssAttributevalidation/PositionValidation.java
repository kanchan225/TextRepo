package day6.cssAttributevalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PositionValidation {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");
        
        driver.findElement(By.id("loginButton")).click();
        WebElement errorMsg =driver.findElement(By.className("errormsg"));
        //or driver.findElement(By.cssSelector("errormsg"));
        System.out.println("Error msg: "+errorMsg.getText());
        System.out.println("Error msg text color: "+errorMsg.getCssValue("color"));
        
        Point locationOfErrorMsg=errorMsg.getLocation();
        int errorMsgX=locationOfErrorMsg.getX();
        int errorMsgY=locationOfErrorMsg.getY();
        System.out.println("Error X coordinate: "+errorMsgX);
        System.out.println("Error Y coordinate: "+errorMsgY);
        
        WebElement userNameField =driver.findElement(By.id("username"));
        Point locationOfUsername=userNameField.getLocation();
        int usernameX=locationOfUsername.getX();
        int usernameY=locationOfUsername.getY();
        System.out.println("Username X coordinate: "+usernameX);
        System.out.println("Username Y coordinate: "+usernameY);
        
        System.out.println("is Error msg getting displayed above the username field: "+(errorMsgY<usernameY));
        
        int passwordY=driver.findElement(By.name("pwd")).getLocation().getY();
        System.out.println("password Y coordinate: "+passwordY);
        int passwordX=driver.findElement(By.name("pwd")).getLocation().getX();
        System.out.println("password X coordinate: "+passwordX);
        
        System.out.println("is password field is displayed below username field: "+(usernameY<passwordY));
	}

}
