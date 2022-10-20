package day10.testNGExamples;

import org.testng.annotations.Test;

public class Sample2 {
  @Test
  public void tc2(){
	  System.out.println("Hello I am tc2");
  }
  
  @Test
  public void tc3(){
	  System.out.println("Hello I am tc3");
  }
  
  @Test
  public void tc1(){
	  System.out.println("Hello I am tc1");
  }
  
  @Test
  public void tc4(){
	  System.out.println("Hello I am tc4");
  }
}
/**
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/