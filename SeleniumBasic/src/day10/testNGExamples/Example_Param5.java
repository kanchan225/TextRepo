package day10.testNGExamples;

import org.testng.annotations.Test;

public class Example_Param5 {
  
  @Test(dependsOnMethods="signIn", enabled=true)
  public void login() {
	  System.out.println("Hello, I am login from Example_Param5 class");
  }
  
  @Test(dependsOnMethods="login", enabled=true)
  public void checkNotification() {
	  System.out.println("Hello, I am checkNotification from Example_Param5 class");
  }
  
  @Test( enabled=true, expectedExceptions=ArithmeticException.class)
  public void signIn() {
	  System.out.println("Hello, I am signIn from Example_Param5 class");
	  int i=10/0;
	  System.out.println("SignIn method is completed");//won't get executed due to exception at line number 20
  }
}
