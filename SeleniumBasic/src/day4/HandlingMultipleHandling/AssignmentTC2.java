package day4.HandlingMultipleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTC2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.espncricinfo.com/");
	    //validate home page
	    String actualTitle=driver.getTitle();
		System.out.println("Actual Title is: "+actualTitle);
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("Expected Title is: "+expectedTitle);
		System.out.println("Home page Title validation: "+actualTitle.equals(expectedTitle));
        //main menu option count
		List<WebElement> mainMenu=driver.findElements(By.cssSelector("div.ds-bg-fill-navbar>div>div>*:last-child>div>div>a"));
	    System.out.println("Count of main menu option: "+mainMenu.size());
	    //print main menu options
	    for(int i=0; i<mainMenu.size(); i++) {
	    	System.out.println(mainMenu.get(i).getText());
	    }
	}

}
