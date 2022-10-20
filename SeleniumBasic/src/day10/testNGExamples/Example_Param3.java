package day10.testNGExamples;

import org.testng.annotations.Test;

public class Example_Param3 {
  @Test(enabled=true)
  public void param1() {
	  System.out.println("Hello, I am param1 from Example_Param3 class");
  }
  
  @Test(enabled=false)
  public void param2() {
	  System.out.println("Hello, I am param2 from Example_Param3 class");
  }
  
  @Test(enabled=true)
  public void param3() {
	  System.out.println("Hello, I am param3 from Example_Param3 class");
  }
}
