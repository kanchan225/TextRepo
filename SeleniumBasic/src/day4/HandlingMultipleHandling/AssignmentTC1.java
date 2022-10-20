package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTC1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	    //validate home page
	    String actualTitle=driver.getTitle();
		System.out.println("Actual Title is: "+actualTitle);
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("Expected Title is: "+expectedTitle);
		System.out.println("Home page Title validation: "+actualTitle.equals(expectedTitle));
        //main menu option count
		List<WebElement> mainmenu=driver.findElements(By.cssSelector("div._37M3Pb>div>a>*:nth-child(2)"));
		
		System.out.println("Main menu count: "+mainmenu.size());
		//print all phone name
		for(int i=0;i<mainmenu.size();i++) {
		   System.out.println(mainmenu.get(i).getText());
		}
	}

}
