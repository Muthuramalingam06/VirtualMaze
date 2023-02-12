package org.tests;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;

import org.locators.Expriencelocators;
import org.locators.FresherLoctor;
import org.locators.Maploctors;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import org.utility.CommonUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Virtualmaze extends CommonUtility {
	long starttime;
	long endtime;

	@BeforeClass
	private void setup() {
		OpenBrowser("chrome");

	}

	@BeforeMethod
	private void beforeMethod() {
		urlLanuch("https://www.virtualmaze.com/");
		ImplicitlyWait(20);
		System.out.println("Start Time....." + new Date());
		starttime = System.currentTimeMillis();

	}

	@AfterMethod
	private void afterMethod(ITestResult r) throws IOException {
		System.out.println("End Time....." + new Date());
		endtime = System.currentTimeMillis();
		System.out.println("Duration of Execurtion...." + (endtime - starttime));
		TakesScreenshot(r.getName());

	}

	@AfterClass
	private void tearDown() {
		quit();

	}

	@Test(priority = 1)
	private void FindtheRoute() throws InterruptedException, AWTException {
		Maploctors m = new Maploctors();
		click(m.getMap());
		getwindowshandless(0, 1);
		click(m.getDirections());
		doubleClick(m.getStartpoint());
		key(KeyEvent.VK_BACK_SPACE);
		Sendkeys(m.getStartpoint(), "pallavaram");
		click(m.getFpoint());
		doubleClick(m.getEndpoint());
		key(KeyEvent.VK_BACK_SPACE);
		Sendkeys(m.getEndpoint(), "Chennai Port");
		click(m.getSpoint());
		click(m.getDetail());
		System.out.println(gettexts(m.getDetails()));

	}

	@Test(priority = 2)
	private void ApplytoFresher() throws IOException, InterruptedException {
		FresherLoctor c = new FresherLoctor();
		click(c.getCarrer());
		click(c.getViewmore());
		click(c.getApply());
		Sendkeys(c.getCandidatename(), "muthu");
		Sendkeys(c.getMobile(), "76349767236");
		Sendkeys(c.getSecondaryphone(), "9876543443");
		Sendkeys(c.getEmail(), "muthu@gmail.com");
		Sendkeys(c.getSecondaryemail(), "ram@gmail.com");
		Sendkeys(c.getPermanentlocation(), "90, chrompet,Chennai");
		Sendkeys(c.getCurrent_location(), "Chennai");
		Sendkeys(c.getDegree(), "B.Sc");
		Sendkeys(c.getDepartment(), "Chemistry");
		Sendkeys(c.getCollegename(), "barathiyar university");
		Sendkeys(c.getTenth(), "84%");
		Sendkeys(c.getTwelth(), "64%");
		Sendkeys(c.getUg(), "74%");
		selectByVisibleText(c.getPassingyear(), "2022");
		click(c.getC_lanuage());
		click(c.getCplus());
		Sendkeys(c.getFile(), System.getProperty("user.dir") + "\\Resume\\RESUME.pdf");
		click(c.getSubmit());
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	private void ApplytoExperience() throws IOException, InterruptedException {
		FresherLoctor c = new FresherLoctor();
		Expriencelocators e = new Expriencelocators();
		click(c.getCarrer());
		click(c.getViewmore());
		click(c.getApply());
		click(c.getExperince());
		Sendkeys(e.getCandidatename(), "muthu");
		Sendkeys(e.getMobile(), "76349767236");
		Sendkeys(e.getSecondaryphone(), "9876543443");
		Sendkeys(e.getEmail(), "muthu@gmail.com");
		Sendkeys(e.getSecondaryemail(), "ram@gmail.com");
		Sendkeys(e.getPermanentlocation(), "90, chrompet,Chennai");
		Sendkeys(e.getCurrent_location(), "Chennai");
		Sendkeys(e.getDegree(), "B.Sc");
		Sendkeys(e.getPassingyear(), "2022");
		Sendkeys(e.getCompanyname(), "Squeeze it solutions");
		click(e.getStart_date());
		Sendkeys(e.getTotalexperienceexp(), "1");
		Sendkeys(e.getStart_date(), "13-01-2022");
		Sendkeys(e.getEnd_date(), "25-02-2023");
		Sendkeys(e.getFile(), System.getProperty("user.dir") + "\\Resume\\RESUME.pdf");
		click(e.getSubmit());
		Thread.sleep(3000);

	}

}
