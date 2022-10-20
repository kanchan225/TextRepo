package day1.openBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumBasic\\executable\\chromedriver.exe");
		
		//Step2: Create an instance of ChromeDriver class
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://drive.google.com/drive/folders/1tnaK2oXCN9FgXhjStZXsnkCJq0U_2Ydh");

	}

}
