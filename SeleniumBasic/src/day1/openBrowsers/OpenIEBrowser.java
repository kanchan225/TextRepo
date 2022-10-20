package day1.openBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {

	public static void main(String[] args) {
		//Step1: using System.setProperty(key,value) set to path for IEDriverServer.exe
		System.setProperty("webdriver.ie.driver","D:\\Workspace\\SeleniumBasic\\executable\\IEDriverServer.exe");
				
		//Step2: Create an instance of ChromeDriver class
		InternetExplorerDriver cdriver=new InternetExplorerDriver();
		//WebDriver cdriver=new InternetExplorerDriver();

	}

}
