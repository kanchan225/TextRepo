package day10.testNGExamples;

import org.testng.annotations.Test;

public class Example_Param1 {
  @Test(invocationCount=5)
  public void param1() {
	  System.out.println("Hello, I am TC1 from Example_Param1 class");
  }
}
