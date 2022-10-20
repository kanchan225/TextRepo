package day5.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleDropdownList {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://omayo.blogspot.com");
        //identify dropdown list
        WebElement carDropdown=driver.findElement(By.id("multiselect1"));
        //create instance of select class and pass above element into its constructor
        Select selectSkill=new Select(carDropdown);
        //check whether dropdown is multiselect dropdown or not
        System.out.println("Is dropdown allowing you to select multiple options: "+selectSkill.isMultiple());
        selectSkill.selectByIndex(0);
        //get default or already selected option
       // WebElement selectedOption=selectSkill.getFirstSelectedOption();
       // String selectedOptionName=selectedOption.getText();
       // System.out.println("Already selected option name: "+selectedOptionName);
        System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
        //get option count
        List<WebElement> options=selectSkill.getOptions();
        System.out.println("Option count is: "+options.size());
        //get dropdown option names
        for(int i=0;i<options.size();i++) {
        	System.out.println("Option "+ i +": "+options.get(i).getText());
        }
        
        //select options from dropdown
        selectSkill.selectByIndex(0);
        selectSkill.selectByIndex(2);
        selectSkill.selectByIndex(3);
        selectSkill.selectByValue("Hyundaix");
        selectSkill.selectByVisibleText("Audi");
        
        //get all the selected options
        List<WebElement> selectCars=selectSkill.getAllSelectedOptions();
        System.out.println("Selected car count: "+selectCars.size());
           //System.out.println(selectCars);
        
        //Unselect already select options
        selectSkill.deselectByIndex(0);
        selectSkill.deselectByValue("Hyundaix");
        selectSkill.deselectByVisibleText("Audi");
//        //or
//        selectSkill.deselectAll();
        
	}

}
