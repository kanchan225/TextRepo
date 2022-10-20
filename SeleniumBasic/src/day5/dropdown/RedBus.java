package day5.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		//identify 'from' field give input pune
		driver.findElement(By.id("src")).sendKeys("Pune");
		//select swargate pune
        List<WebElement> from=driver.findElements(By.cssSelector("div.fl.search-box.clearfix>div>ul>li"));
        from.get(1).click();
		//identify 'to' field give input Goa
        driver.findElement(By.id("dest")).sendKeys("Goa");
        //select madgao goa
        List<WebElement> to=driver.findElements(By.cssSelector("div.clearfix.search-wrap>*:nth-child(3)>div>ul>li"));
        to.get(2).click();
        //select date of next month
        driver.findElement(By.className("next")).click();
        driver.findElement(By.cssSelector(".rb-calendar>table>tbody>*:nth-child(4)>*:first-child")).click();
        //click on search button
        driver.findElement(By.id("search_btn")).click();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
        //select departure time before 6am
      // driver.findElement(By.cssSelector("ul.dept-time.dt-time-filter>li>label:nth-of-type(1)")).click();
        //select AC type bus
      // driver.findElement(By.cssSelector("ul.list-chkbox>*:nth-child(3)>label:nth-of-type(1)")).click();
        //get bus name along with price
        List<WebElement> busName=driver.findElements(By.cssSelector("ul.bus-items>div>li>div>div>div>div>.travels.lh-24.f-bold.d-color"));
        List<WebElement> ticketPrice=driver.findElements(By.cssSelector("ul.bus-items>div>li>div>div>div>div:nth-of-type(6)>div>*:last-child>span"));
        
        for(int i=0; i<busName.size(); i++) {
        	System.out.println(busName.get(i).getText()+" ---> "+ticketPrice.get(i).getText());
        }
        System.out.println("*********************************************************");
        //view MSRTC buses
        driver.findElement(By.cssSelector("div.gmeta-data.clearfix>*:last-child>div>*:last-child>.button")).click();
      //get bus name including MSRTC buses along with price
        List<WebElement> busName1=driver.findElements(By.cssSelector("ul.bus-items>div>li>div>div>div>div>.travels.lh-24.f-bold.d-color"));
        List<WebElement> ticketPrice1=driver.findElements(By.cssSelector("ul.bus-items>div>li>div>div>div>div:nth-of-type(6)>div>*:last-child>span"));
        
        for(int i=0; i<busName1.size(); i++) {
        	System.out.println(busName1.get(i).getText()+" ---> "+ticketPrice1.get(i).getText());
        }
	}

}
