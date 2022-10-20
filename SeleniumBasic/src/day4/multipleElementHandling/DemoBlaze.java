package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeExePath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        List<WebElement> mobileNameList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
        List<WebElement> mobilePriceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
        
        for(int i=0;i<mobileNameList.size();i++) {
        	System.out.println(mobileNameList.get(i).getText()+"--->"+mobilePriceList.get(i).getText());
        	
        }
	}

}
