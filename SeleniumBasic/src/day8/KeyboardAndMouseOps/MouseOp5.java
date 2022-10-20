package day8.KeyboardAndMouseOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day9.utilities.SeleniumUtility;

public class MouseOp5 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility m1=new SeleniumUtility();
        WebDriver driver=m1.setUp("chrome","https://www.facebook.com/");
        
        WebElement element=driver.findElement(By.xpath("//a[text()='Create New Account']"));
        m1.performClick(element);
        //or m1.performClick(driver.findElement(By.xpath("//a[text()='Create New Account']")));
        
        WebElement username=driver.findElement(By.name("firstname"));
        m1.typeInput(username,"admin");
        WebElement lastname=driver.findElement(By.name("lastname"));
        
        m1.copyTextFromField(username);
        m1.pasteTextInToField(lastname);
        //or
        //m1.copyPasteText(username,lastname);
        System.out.println("Current Url: "+m1.getCurrentUrl());
        System.out.println("Current Url: "+m1.getPageTitle(username));
        Thread.sleep(1000);
        m1.cleanUp();
	}

}

