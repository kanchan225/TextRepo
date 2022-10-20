package day10.testNGExamples;

import org.testng.annotations.Test;

public class Example_Param6 {
	@Test(dependsOnMethods = "signIn", enabled = true)
	public void login() {
		System.out.println("Hello, I am login from Example_Param6 class");
	}

	@Test(dependsOnMethods = "login", enabled = true,timeOut=2000)
	public void checkNotification() {
		System.out.println("Hello, I am checkNotification from Example_Param6 class");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(enabled = true, expectedExceptions = ArithmeticException.class)
	public void signIn() {
		System.out.println("Hello, I am signIn from Example_Param6 class");
		int i = 10 / 0;
	}
}
