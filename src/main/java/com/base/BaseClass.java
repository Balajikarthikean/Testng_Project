package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BaseClass {
	protected static WebDriver driver;

	// browserLaunch
	protected static WebDriver browserLaunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
//		switch (browsername) {
//		case "chrome":
//		driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//			break;
//		case "firefox":
//			driver = new FirefoxDriver();
//			WebDriverManager.firefoxdriver().setup();
//				break;
//		case "edge":
//			driver = new EdgeDriver();
//			WebDriverManager.edgedriver().setup();
//				break;
//
//		default:
//			break;
//		}
//		return driver;

	}

	// launchUrl
	protected static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;

	}

	// closeBrowser
	protected static void closeBrowser() {
		driver.close();

	}

	// terminateBrowser
	protected static void terminateBrowser() {
		driver.quit();

	}

	// sendKeys passInput
	protected static void passInput(WebElement element, String input){
		
		element.sendKeys(input);

	}
//	 public void passInput(WebElement element, String value) {
//	    	try {
//				if(element .isEnabled()) {
//					element .clear();
//					element.sendKeys(value);
//					}
//			} catch (Exception e) {
//				System.out.println("TextBox is error");
//			}
//	    	}

	// forwardPage
	protected static void forwardPage() {
		driver.navigate().forward();

	}

	// toPage
	protected static void toPage(String url) {
		driver.navigate().to(url);
	}

	// backPage
	protected static void backPage() {
		driver.navigate().back();
	}

	// refreshPage
	protected void refreshPage() {
		driver.navigate().refresh();

	}

	// clickButton
	protected static void clickButton(WebElement element) throws InterruptedException {
		Thread.sleep(5000);
		element.click();
	}

//dropDownObject
	protected static Select dropDownObject(WebElement element) {
		Select s = new Select(element);
		return s;
	}

//selectbyValue
	protected static void selectbyValue(WebElement element, String value) {
		dropDownObject(element).selectByValue(value);
	}

//selectbyIndex
	protected static void selectbyIndex(WebElement element, int ind) {
		dropDownObject(element).selectByIndex(ind);
	}

//selectbyvisibletext
	protected static void selectbyvisibletext(WebElement element, String text) {
		dropDownObject(element).selectByVisibleText(text);
	}

//isMultiple
	protected static void isMultiple(WebElement Element) {
		Select s = new Select(Element);
		boolean actual = s.isMultiple();

	}

//elementDisplayed
	protected static void elementDisplayed(String elementlocator) {
		try {
			WebElement findElement = driver.findElement(null);
			findElement.isDisplayed();
		} catch (Exception e) {
			System.out.println("Element not found: " + e.getMessage());
		}

	}

//isElementEnabled
	protected static void isElementEnabled(WebElement element) {

		try {
			element.isEnabled();
		} catch (Exception e) {
			System.out.println("Element is not present or stale: " + e.getMessage());

		}

	}

//getCurrentUrl
	protected static void getCurrentUrl(String allUrls) {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			System.out.println("current URL is invalid");
		}
	}

//getOptions
	protected static List<WebElement> getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

//getTitle
	protected static void getTitle(String title) {
		driver.getTitle();
	}

//Screenshot
	protected static void Screenshot(String sshot) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("path/name/format");
		try {
			FileUtils.copyFile(source, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//javaScript
	protected static void javaScript(String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("down")) {
			js.executeScript("window.scrollBy(0,1000);");
		} else if (value.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollBy(0,-300);");
		}
	}
	//javascriptscroll
	public static void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");

	}
	//javascriptscrollIntoview 
	public static void scrollViewContent(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	//javascript just click
	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	public static void javaScriptElementInteract(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=' ';", element);

	}

//getAttributeValue
	protected static String getAttributeValue(WebElement element, String attributeName) {
		String attribute;
		try {
			attribute = element.getAttribute(attributeName);
			return attribute;
		} catch (Exception e) {
			System.out.println("Attribute retrieval error: " + e.getMessage());
			return null;
		}

	}

//selectRadioButton
	protected void selectRadioButton(WebElement radioButton) {
		try {
			if (!radioButton.isSelected()) {
				radioButton.click();
			}
		} catch (Exception e) {
			System.out.println("Radio button selection error: " + e.getMessage());
		}
	}

//getText
	protected static String getText(WebElement element) {
		return element.getText();
	}

//getFirstSelectedOption
	protected static void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		try {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
		} catch (Exception e) {
			System.out.println("getoption not selected");
		}

	}

//clickElement
	protected static void clickElement(WebElement element) {
		
		Actions actions = new Actions(driver);
		explicitwait(element);
		actions.click(element).perform();
	}

//doubleClickElement
	protected static void doubleClickElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

//rightClickElement
	protected static void rightClickElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

//dragAndDrop
	protected static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceElement, targetElement).perform();
	}

//moveToElement
	protected static void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	//33 get window handle
			public static void windowhandle() {
				String id = driver.getWindowHandle();
				System.out.println(id);
			}

//multiplewindowsHandling
	protected static void MutliplewindowsHandling(String name) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().equals(name)) {
				break;
			}

		}
	}
	
	//32 get window handles
			public static void windowhandles() {
				Set<String> allid = driver.getWindowHandles();
				System.out.println(allid);
				for (String id : allid) {
					String title = driver.switchTo().window(id).getTitle();
					System.out.println(title);
				}
			}
	
	//windowsHandling
	protected static void windowsHandling() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {

			System.out.println(driver.switchTo().window(string).getTitle());
		}
	}

//getAlertText
	protected static String getAlertText() {
		Alert alert = driver.switchTo().alert();
		try {
			return alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present: " + e.getMessage());
			return null;
		}
	}

//acceptAlert
	protected static void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		try {
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println(" No alert present:" + e.getMessage());
		}
	}

//dismissAlert
	protected static void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		try {
			alert.dismiss();
		} catch (Exception e) {
			System.out.println("dismiss i confirm" + e.getMessage());
		}
	}

//keyPress
	protected static void keyPress(int keycode) {
		Robot r = null;
		try {
			r = new Robot();
		} catch (AWTException e) {

			e.printStackTrace();
		}
		r.keyPress(keycode);
		r.keyRelease(keycode);

	}

//mouseHover
	protected static void mouseHover(WebElement element) {
		Actions actions = new Actions(driver);
		try {
			actions.moveToElement(element).build().perform();
		} catch (Exception e) {
			System.out.println("mousehover error" + e.getMessage());
		}
	}

//switchToFrameByIndex
	protected void switchToFrameByIndex(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}

	// switch to a frame by name or id
	protected void switchToFrameByNameOrId(String frameNameOrId) {
		driver.switchTo().frame(frameNameOrId);
	}

	// switch to a frame by WebElement
	protected void switchToFrameByElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// Common method to switch back to the default content
	protected void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

//getAllSelectedOptions
	protected static List<String> getAllSelectedOptions(WebElement dropdownElement) {
		Select dropdown = new Select(dropdownElement);
		List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();

		List<String> selectedOptionTexts = new ArrayList<>();
		for (WebElement option : selectedOptions) {
			selectedOptionTexts.add(option.getText());
		}

		return selectedOptionTexts;
	}

//setImplicitWait
	protected static void setImplicitWait(long timeout, TimeUnit timeUnit) {
		driver.manage().timeouts().implicitlyWait(15, timeUnit.SECONDS);
	}

	// waitForElement
	protected static void waitForElement(By locator, long timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	//movetoelement
	protected static void actionmoveElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	//implict wait
	protected static void implicitwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	//explicitwait
	protected static void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
