package day8.KeyboardAndMouseOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp3 {

	public static void main(String[] args) throws InterruptedException {
		
		String path=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//frame handling
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		Actions act=new Actions(driver);
		
		List<WebElement> sourceElement=driver.findElements(By.cssSelector("ul#gallery>li>h5"));
		WebElement target=driver.findElement(By.id("trash"));
		act.dragAndDrop(sourceElement.get(0),target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(sourceElement.get(1),target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(sourceElement.get(2),target).build().perform();
//		
//		performDragAndDrop(act, sourceElement.get(3),target);
		
		for(int i=0; i<sourceElement.size(); i++) {
			performDragAndDrop(act, sourceElement.get(i),target);
			Thread.sleep(1000);
		}
	}
	static void performDragAndDrop(Actions act, WebElement src,WebElement target) {
		act.dragAndDrop(src, target).build().perform();
	}

}
