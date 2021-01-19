package com.hrms.utils;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.PageInitializer;

public class CommonMethods extends PageInitializer {

	/**
	 * Method that sends text to any given element
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * Method return Object of JavaScript Executor type
	 * 
	 * @return js object
	 */
	public static JavascriptExecutor getJSExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	/**
	 * Method performs click using JavaScript executor
	 * 
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		getJSExecutor().executeScript("arguments[0].click();", element);
	}

	/**
	 * Methods scrolls up using JavaScript executor
	 * 
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		getJSExecutor().executeScript("window.scrollBy(0, -" + pixel + ")");
	}

	/**
	 * Methods scrolls down using JavaScript executor
	 * 
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		getJSExecutor().executeScript("window.scrollBy(0," + pixel + ")");
	}

	public static WebDriverWait getWaitObject() {
		return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
	}

	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	/**
	 * Method that will take a screenshot and store with name in specified location
	 * with .png extension
	 * 
	 * @param fileName
	 */
	public static byte[] takeScreenshot(String fileName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);

		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bytes;
	}

	/**
	 * This method will generate timeStamp
	 * 
	 * @return
	 */
	public static String getTimeStamp() {

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");

		return sdf.format(date);
	}

	/**
	 * this method will click on checkboxes or radio button by given list of
	 * webelements and the value
	 * 
	 * @param radioOrCheckBoxes
	 * @param value
	 */

	public static void clickRadioOrCheckBox(List<WebElement> radioOrCheckBoxes, String value) {

		for (WebElement radioOrCheckBox : radioOrCheckBoxes) {
			String actualValue;
			actualValue = radioOrCheckBox.getAttribute("value").trim();
			if (radioOrCheckBox.isEnabled() && actualValue.equals(value)) {
				jsClick(radioOrCheckBox);
				break;
			}
		}
	}

	/**
	 * this method will select an option from the dropdown by the given webelement
	 * and visible text value
	 * 
	 * @param dd
	 * @param visibleTextOrValue
	 */
	public static void selectDDValue(WebElement dd, String visibleTextOrValue) {
		try {
			Select select = new Select(dd);
			List<WebElement> options = select.getOptions();
			for (WebElement option : options) {
				if (option.getText().equals(visibleTextOrValue)) {
					select.selectByVisibleText(visibleTextOrValue);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method will select an option from the dropdown by the given webelement
	 * and index
	 * 
	 * @param dd
	 * @param visibleTextOrValue
	 */
	public static void selectDDValue(WebElement dd, int index) {
		try {
			Select select = new Select(dd);
			List<WebElement> options = select.getOptions();

			int size = options.size();

			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this method will switch to a frame by the given webelement
	 * @param iFrame
	 */
	public static void switchToFrame(WebElement iFrame) {
		try {
		driver.switchTo().frame(iFrame);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this method will switch to a frame by the given Index
	 * @param frameIndex
	 */
	public static void switchToFrame(int frameIndex) {
		try {
		driver.switchTo().frame(frameIndex);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this method will switch to a frame by the given Name or Id
	 * @param nameOrId
	 */
	public static void switchToFrame(String nameOrId) {
		try {
		driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	public static void switchTochildWindow() {
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String windows : allWindows) {
			if(!windows.equals(mainWindow)) {
				driver.switchTo().window(windows);
				break;
			}
			
		}
	}
	

}
