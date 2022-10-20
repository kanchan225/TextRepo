package day1.openBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		//Step1: using System.setProperty(key,value) set to path for GeckoDriver.exe
		System.setProperty("webdriver.gecko.driver","D:\\Workspace\\SeleniumBasic\\executable\\geckodriver.exe");
				
		//Step2: Create an instance of FirefoxDriver class
		FirefoxDriver cdriver=new FirefoxDriver();
		//WebDriver cdriver=new FirefoxDriver();

	}

}
