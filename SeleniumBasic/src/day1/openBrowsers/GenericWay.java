package day1.openBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWay {

	public static void main(String[] args) {
		//Set path for driver executable
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");

		//Create an instance of required Browser class(Chrome Browser) and Up-casting it to WebDriver Interface
		WebDriver driver=new ChromeDriver();
		
		//It is example of runtime polymorphism
	}
}
