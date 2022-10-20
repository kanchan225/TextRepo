package day9.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {
	public static WebDriver driver = null;
	public static Actions action = null;
	public WebDriverWait wait;

	public static void main(String[] args) {

	}

	public WebDriver setUp(String browserName, String url) {
		String exePath;
		if (browserName.equalsIgnoreCase("chrome")) {
			exePath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			exePath = System.getProperty("user.dir") + "\\Executable\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", exePath);
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			exePath = System.getProperty("user.dir") + "\\Executable\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", exePath);
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		driver.get(url);
		action = new Actions(driver);
		return driver;

	}

	public void cleanUp1() {
		driver.close();

	}

	public void performClick(WebElement element) {
		element.click();
	}

	public void typeInput(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public String getCurrentWorkingDir() {
		// String currentDir = System.getProperty("user.dir");
		return System.getProperty("user.dir");
	}

	public void copyTextFromField(WebElement element) {
		action.doubleClick(element).perform();
		element.sendKeys(Keys.chord(Keys.CONTROL, "c"));
	}

	public void pasteTextInToField(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}

	public void copyPasteText(WebElement textToBeCopied, WebElement textToBePasted) {
		action.doubleClick(textToBeCopied).perform();
		textToBeCopied.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		textToBePasted.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}

	public void waitTillElementIsClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

// 	public List<WebElement> getAllElements(String locatorType,String locatorValue){
// 		//switch  case
// 	}

	public String getValueFromPropertyFile(String fileName, String key) {
		Properties prop = getPropertyFile(fileName);
		return prop.getProperty(key);
	}

	public Properties getPropertyFile(String fileName) {
		String filePath = getCurrentWorkingDir() + fileName;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	public void takeScreenshot(String fileLocation) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenShot = ts.getScreenshotAs(OutputType.FILE);

 		try {
 			FileUtils.copyFile(screenShot, new File(fileLocation));
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
	}

	public void performDragAndDrop(WebElement src, WebElement target) {
		action.moveToElement(src).dragAndDrop(src, target).build().perform();
	}

	public void cleanUp() {
		driver.close();
	}

	public void rightClick(WebElement option) {
		action.moveToElement(option).contextClick().build().perform();
	}

	public void mouseHoverWithCords(WebElement option, int x, int y) {
		action.moveToElement(option, x, y).perform();
	}

	public void mouseHover(WebElement element) {
		action.moveToElement(element).perform();
	}

	public void doubleClick(WebElement element) {
		action.moveToElement(element).doubleClick().perform();
	}

 	public void switchToRequiredFrameUsingName(String name) {
 		driver.switchTo().frame(name);
 	}
	
 	public void switchToRequiredFrameUsingWebElement(WebElement element) {
 		driver.switchTo().frame(element);
 	}
	
 	public void switchToRequiredFrameUsingIndex(int index) {
 		driver.switchTo().frame(index);
 	}
	
 	public void switchControlBackToMainPage() {
 		driver.switchTo().defaultContent();
 	}
	
 	public WebElement getActiveElement() {
 		return driver.switchTo().activeElement();
 	}
 	
 	public String getPageTitle() {
 		return driver.getTitle();
 	}
 	
 	public String getPageTitle(String title) {
 		wait.until(ExpectedConditions.titleContains(title));
 		return driver.getTitle();
 	}
 	
 	public String getPageTitle(WebElement element) {
 		wait.until(ExpectedConditions.elementToBeClickable(element));
 		return driver.getTitle();
 	}
 	
 	public String getCurrentUrl() {
 		return driver.getCurrentUrl();
 	}
 	
 	public String getInnerText(WebElement element) {
 		return element.getText();
 	}
 	
 	public String getAttribute(WebElement element, String Name) {
 		return element.getAttribute(Name);
 	}

	// methods for select dropdown
	// title
	// currentUrl
	// attribute
	// inner text
	// Window handling ---> not now
	// Alert Handling ---> not now
	// calendar handling

}
