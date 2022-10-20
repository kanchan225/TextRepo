package day8.KeyboardAndMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReusableFunction {
    static WebDriver driver=null;
	public static void main(String[] args) {
	  driver=setUp("chrome","https://www.google.com");
	  System.out.println(driver.getTitle());
	  cleanUp();

	}
	static WebDriver setUp(String browserName, String url) {
		String exePath;
		if(browserName.equalsIgnoreCase("chrome")) {
			exePath=System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			exePath=System.getProperty("user.dir") + "\\Executable\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", exePath);
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ie")) {
			exePath=System.getProperty("user.dir") + "\\Executable\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", exePath);
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		
	}
	static void cleanUp() {
		driver.close();
	}

}
