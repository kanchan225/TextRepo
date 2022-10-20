package day10.testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import day9.utilities.SeleniumUtility;

public class Example7 extends SeleniumUtility{
  @Test
  public void loginlogoutinActitimeApplication() {
	  WebDriver driver=setUp("chrome","https://demo.actitime.com/login.do");
	  System.out.println("Before login, page Title: "+driver.getTitle());
	  //identify required element username field from the UI and perform required action
	 // driver.findElement(By.id("username")).sendKeys("admin");
	     //or
	  WebElement username=driver.findElement(By.id("username"));
	  //validate username field is displayed or not
	  // Assert.assertTrue(username.isDisplayed()); //or
	  Assert.assertTrue(username.isDisplayed(), "Either username field not displayed or locater changed");
	  typeInput(username, "admin");
	  
	//identify password field from the UI and perform required action
		 // driver.findElement(By.name("pwd")).sendKeys("manager");
	          //or
	  typeInput(driver.findElement(By.name("pwd")),"manager");
	  
	  //driver.findElement(By.id("loginButton")).click();
	      //or
	  performClick(driver.findElement(By.id("loginButton")));
	  
	  WebElement logoutBtn=driver.findElement(By.linkText("Logout"));
	  //Explicit Wait
	  WebDriverWait wait=new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
	  
	  System.out.println("After login, page Title: "+getPageTitle());
	  //Home page validation
//	  if(getPageTitle().equals("")) {
//		  System.out.println("passed");
//	  }else {
//		  System.out.println("Failed");
//	  }
	  
	  // validation using TestNG
	  Assert.assertEquals(getPageTitle(), "actiTIME - Enter Time-Track");
	  performClick(logoutBtn);
	  
	  //login page validation
	  Assert.assertEquals(getPageTitle(), "actiTIME - Login", "Login page validation is failed");
	  driver.close();
	  
	  
  }
}
