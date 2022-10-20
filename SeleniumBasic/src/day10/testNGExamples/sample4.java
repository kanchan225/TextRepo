package day10.testNGExamples;

import org.testng.annotations.Test;

public class sample4 {
	public void tc2(){
		  System.out.println("Hello I am tc2");
	  }
	  
	  public void tc3(){
		  System.out.println("Hello I am tc3");
	  }
	  
	  @Test
	  public void tc1(){
		  System.out.println("Hello I am tc1");
		  tc2();
	  }
	  
	  @Test
	  public void tc4(){
		  tc3();
		  tc2();
		  System.out.println("Hello I am tc4");
	  }

}
