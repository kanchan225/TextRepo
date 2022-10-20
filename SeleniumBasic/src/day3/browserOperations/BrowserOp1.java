package day3.browserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOp1 {

	public static void main(String[] args) throws InterruptedException {
		//String chromeExePath=System.getProperty("user.dir") +"\\executable\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //explicit wait(static wait)
        Thread.sleep(2000);
        //maximize browser window
        driver.manage().window().maximize();
        //explicit wait(static wait)
        Thread.sleep(2000);
        //set browser window size
        driver.manage().window().setSize(new Dimension(650, 450));
        //explicit wait(static wait)
        Thread.sleep(2000);
        //maximize browser window
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //identify and click on forgot button
        driver.findElement(By.className("orangehrm-login-forgot")).click();
        Thread.sleep(2000);
        //come back to previous page
        driver.navigate().back();
        Thread.sleep(2000);
      //come back to next page
        driver.navigate().forward();
        Thread.sleep(2000);
      //to reload current page
        driver.navigate().refresh();
        Thread.sleep(2000);
        //to move to different URL
          driver.navigate().to("https://www.google.com");

	}

}
