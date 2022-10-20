package day10.testNGExamples;

import org.testng.annotations.Test;

public class Example_Param2 {
  @Test(priority=1)
  public void login() {
	  System.out.println("Hello, I am login from Example_Param2 class");
  }
  
  @Test(priority=2)
  public void sendEmail() {
	  System.out.println("Hello, I am sendEmail from Example_Param2 class");
  }
  
  @Test(priority=3)
  public void logout() {
	  System.out.println("Hello, I am logout from Example_Param2 class");
  }
}
/**

By Default each @Test has priority as 0
lowest priority will get executed first
*/