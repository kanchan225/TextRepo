package day3.browserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTestCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(650, 450));
        Thread.sleep(2000);
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        String pageTitle=driver.getTitle();
        System.out.println("Login Page Title: "+pageTitle);
        //choose orders from menu list
        WebElement ordersbutton=driver.findElement(By.className("nav-line-2"));
        ordersbutton.click();
        String ordersTitle=driver.getTitle();
        System.out.println("Orders Page Title: "+ordersTitle);
        String expectedOrdersTitle="Amazon.in::All Categories";
        System.out.println("expected Orders Page Title: "+expectedOrdersTitle);
        System.out.println("Orders Page Title Validation: "+expectedOrdersTitle.equals(ordersTitle));
        Thread.sleep(2000);
        driver.navigate().back();
        String pageTitle1=driver.getTitle();
        System.out.println("Login Page Title: "+pageTitle1);
        System.out.println("Validate home page title before and after: "+pageTitle.equals(pageTitle1));
        //Choose cart from menu list
        WebElement cartbutton=driver.findElement(By.cssSelector("span[id='nav-cart-count']"));
        ordersbutton.click();
        String cartTitle=driver.getTitle();
        System.out.println("Orders Page Title: "+cartTitle);
        String expectedcartTitle="Amazon.in Shopping Cart";
        System.out.println("expected Orders Page Title: "+expectedcartTitle);
        System.out.println("Orders Page Title Validation: "+expectedcartTitle.equals(cartTitle));
        Thread.sleep(2000);
        driver.navigate().back();
        String pageTitle2=driver.getTitle();
        System.out.println("Login Page Title: "+pageTitle2);
        System.out.println("Validate home page title before and after: "+pageTitle.equals(pageTitle2));
        Thread.sleep(2000);
        driver.close();
        

	}

}
