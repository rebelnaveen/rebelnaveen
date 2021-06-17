package com.adactinbaseclass;

//import java.awt.AWTException;
import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassSelinium {
	public static WebDriver driver;
	public static WebElement element;

	public static WebDriver browserlaunch(String browser) {
		
		try {
			
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\shiva\\eclipse-workspace\\Adactin_Pro\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("web", "path");
				driver = new FirefoxDriver();
			} else {
				System.out.println("INVALID BROWSER");
			}
			//driver.manage().window().maximize();
		} catch (Exception e) {
		}
		return driver;
		
	}
	// web element methods
	// click
	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
		}
	
	}
	// send keys
	public static void sendValues(WebElement element, String values) {
		try {
			element.sendKeys(values);
		} catch (Exception e) {
		}
	}
	//clear
	public static void delete(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
		}
	}
	//actions
	public static void moveToElement(WebElement element) {
			try {
				Actions ac = new Actions(driver);
				ac.click(element).build().perform();
			} catch (Exception e) {
			}
	}
	//get url
	public static void geturl(String url) {
		try {
			driver.get(url);			
		} catch (Exception e) {
		}
	}
	//implicitwait
	public static void implicitwait(long a) {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
		} catch (Exception e) {
		}
	}
	//explicitwait
	public static void explicitwait(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(element));			
		} catch (Exception e) {
		}
	}
	public static void scroll(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element);				
		} catch (Exception e) {
		}	
	}
	public static void scrollDown() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");			
		} catch (Exception e) {
		}
	}
	public static void frameByInt(int integer) {
	try {
		driver.switchTo().frame(integer);		
	} catch (Exception e) {
	}
	}
	public static void frameByString(String string) {
		try {
			driver.switchTo().frame(string);	
		} catch (Exception e) {
		}
	}
	public static void frameByWebElement(WebElement element) {
		try {
			driver.switchTo().frame(element);			
		} catch (Exception e) {
		}
	}
	public static void sleep(int seconds) throws InterruptedException {
		try {
			Thread.sleep(seconds);			
		} catch (Exception e) {
		}
	}
	public static void defaultcontent(WebElement element) {
		try {
			driver.switchTo().defaultContent();			
		} catch (Exception e) {
		}
	}
	public static void screenshot(String path) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);			
		} catch (Exception e) {
		}
	}
	public static void close() { 
		try {
			driver.close();			
		} catch (Exception e) {
		}
	}
	public static void quit() {
		try {
			driver.quit();			
		} catch (Exception e) {
		}
	}
	public static void navigateTo(String url) {
		try {
			driver.navigate().back();			
		} catch (Exception e) {
		}
	}
	public static void navigateBack() {
	try {
		driver.navigate().back();		
	} catch (Exception e) {
	}
	}
	public static void navigateForward() {
		try {
			driver.navigate().forward();			
		} catch (Exception e) {
		}
	}
	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();			
		} catch (Exception e) {
		}
	}
	public static void alertAccept() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
		}
	}
	public static void alretDismiss() {
		try {
			driver.switchTo().alert().dismiss();			
		} catch (Exception e) {
		}
	}
	public static void alretSendValues(String text) {
		try {
			driver.switchTo().alert().sendKeys(text);			
		} catch (Exception e) {
		}
	}
	public static void robotDown() throws AWTException  {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);			
		} catch (Exception e) {
		}
	}
	public static void robotEnter() throws AWTException {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);			
		} catch (Exception e) {
		}
	}
	public static void windowHandleGetTitle() {
		try {
			Set<String> allid = driver.getWindowHandles();
			for (String id : allid) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
			}			
		} catch (Exception e) {
		}
	}
	public static void windowHandleActualTitle(String selectedtitle) {
		try {
			Set<String> allid = driver.getWindowHandles();
			String actualtitle = selectedtitle;
			for (String id : allid) {
				if (driver.switchTo().window(id).getTitle().contentEquals(actualtitle)) {
				break;
				}
				}			
		} catch (Exception e) {
		}
	}
	public static void multipleDropDown(WebElement element, int a, int b, int c) {
		try {
			Select s = new Select(element);
			java.util.List<WebElement> alloption = s.getOptions();
			int size = alloption.size();
			for (int i = 0; i < size; i++) {
				if (i == a|| i == b || i == c) {
					s.selectByIndex(i);
				}
			}			
		} catch (Exception e) {
		}
	}
	public static void singleDropDown(WebElement element,String value) {
		try {
			Select s = new Select(element);
			s.selectByValue(value);			
		} catch (Exception e) {
		}
	}
	public static void getOptions(WebElement element) {
		try {
			Select s = new Select(element);
			java.util.List<WebElement> alloption = s.getOptions();
			for (WebElement options : alloption) {
				System.out.println(options.getText());
			}			
		} catch (Exception e) {
		}
	}
	public static void isMultiple(WebElement element) {
		try {
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println("is mutiple " + multiple);			
		} catch (Exception e) {
		}
	}
	public static void getAllSelectedOptions(WebElement element) {
		try {
			Select s = new Select(element);
			java.util.List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement allselected : allSelectedOptions) {
				System.out.println(allselected.getText());			
			}			
		} catch (Exception e) {
		}
	}
	public static void getFirstSelectedOption(WebElement element) {
		try {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());			
		} catch (Exception e) {
		}
	}
	public static void checkBox(WebElement element) {
	try {
		element.click();		
	} catch (Exception e) {
	}
	}
	public static void isEnabled(WebElement element) {
		try {
			System.out.println(element.isEnabled());			
		} catch (Exception e) {
		}
	}
	public static void isDisplayed(WebElement element) {
	try {
		System.out.println(element.isDisplayed());		
	} catch (Exception e) {
	}
	}
	public static void getTitle() {
		try {
			System.out.println(driver.getTitle());			
		} catch (Exception e) {
		}
	}
	public static void getCurrentUrl() {
		try {
			System.out.println(driver.getCurrentUrl());			
		} catch (Exception e) {
		}
	}
	public static void  getAttribute(WebElement element, String attribute) {
		try {
			System.out.println(element.getAttribute(attribute));			
		} catch (Exception e) {
		}
	}
 
	
}
