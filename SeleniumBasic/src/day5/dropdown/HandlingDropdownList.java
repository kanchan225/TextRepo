package day5.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Register.html");
        //identify dropdown list
        WebElement skillDropdown=driver.findElement(By.id("Skills"));
        //create instance of select class and pass above element into its constructor
        Select selectSkill=new Select(skillDropdown);
        //check whether dropdown is multiselect dropdown or not
        System.out.println("Is dropdown allowing you to select multiple options: "+selectSkill.isMultiple());
        //get default or already selected option
//        WebElement selectedOption=selectSkill.getFirstSelectedOption();
//        String selectedOptionName=selectedOption.getText();
//        System.out.println("Already selected option name: "+selectedOptionName);
        //or
        System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
        //get option count
        List<WebElement> options=selectSkill.getOptions();
        System.out.println("Option count is: "+options.size());
        //get dropdown option names
        for(int i=0;i<options.size();i++) {
        	System.out.println("Option "+ i +": "+options.get(i).getText());
        }
        
        //select options from dropdown
        selectSkill.selectByIndex(4);
        System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
        selectSkill.selectByValue("Backup Management");
        System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
        selectSkill.selectByVisibleText("Analytics");
        System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
        
        //validation dropdown skills are getting displayed in descending order or not:
         //checking order of skills
        String skillName="";
        for(int i=1;i<options.size();i++){
        	if(options.size()-1!=i) {
        		skillName=skillName+options.get(i).getText()+", ";
        	}else {
        		skillName=skillName+options.get(i).getText();
        	}
        }
         //expected skills
        String exp_skillName="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
        System.out.println("skillName: "+skillName);
        System.out.println("exp_skillName: "+exp_skillName);
        System.out.println("Skills are in sorted order: "+skillName.equals(exp_skillName));
        
        
	}

}
