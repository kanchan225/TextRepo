package day8.KeyboardAndMouseOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentCricinfo {

	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		//identify all the elements of main menu
		List<WebElement> mainMenu=driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']/div/a"));
		System.out.println("Main menu option count: "+mainMenu.size());
		
		Actions act=new Actions(driver);
		for(int i=0; i<mainMenu.size(); i++) {
			WebElement option=mainMenu.get(i);
			act.moveToElement(option).perform();
			System.out.println(option.getText());
			Thread.sleep(1000);
		}
	}

}
