package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtility {
	public static WebDriver driver;

	public static WebDriver OpenBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			throw new WebDriverException();
		}
		return driver;
	}

	public static void TakesScreenshot(String filename) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File srcfile = tk.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + filename + ".png");
		FileUtils.copyFile(srcfile, destfile);

	}


	public static void elementwait(WebElement e) {
		WebDriverWait w = new WebDriverWait(driver, 18);
		w.until(ExpectedConditions.visibilityOf(e));
	}

	public static void urlLanuch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void keysendKeys(WebElement e, String value, Keys enter) {
		e.sendKeys(value, enter);
	}
	
	public static void key(int key) throws AWTException {
		Robot r = new Robot();
		r.keyPress(key);
		r.keyRelease(key);
	}

	public static void Sendkeys(WebElement e, String value) {
		try {
			e.sendKeys(value);

		} catch (Exception x) {
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].setAttribute('value','" + value + "')", e);
		}

	}

	public static void ImplicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}

	public static void click(WebElement e) {
		try {
			e.click();

		} catch (Exception d) {
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].click()", e);

		}

	}

	public static void clear(WebElement e) {
		e.clear();

	}

	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static String gettexts(List<WebElement> e) {
		String r = "";
		for (WebElement x : e) {
			String text = x.getText();
			r = r + "\n" + text;
		}
		return r;
	}

	public static void selectByVisibleText(WebElement e, String arg) {
		Select s = new Select(e);
		s.selectByVisibleText(arg);
	}

	public static void quit() {
		driver.quit();
	}

	public static void getwindowshandless(int count, int g) {
		Set<String> allid = driver.getWindowHandles();

		for (String eachid : allid) {

			if (count == g) {
				driver.switchTo().window(eachid);
			}
			count++;

		}
	}
}
