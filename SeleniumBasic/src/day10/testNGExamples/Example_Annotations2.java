package day10.testNGExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example_Annotations2 {
	@BeforeMethod
	  public void openBrowser() {
		  System.out.println("Chrome browser is opened and app url is entered");
	  }
	  
	  @Test(priority=1)
	  public void verifyLogin() {
		  System.out.println("Successfully login...");
	  }
	  
	  @AfterMethod
	  public void closeBrowser() {
		  System.out.println(" browser instance is closed");
	  }
	  
	  @Test(priority=2)
	  public void createTask() {
		  System.out.println("Task created Successfully");
	  }
}
