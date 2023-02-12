package org.locators;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.CommonUtility;

public class Maploctors extends CommonUtility {
	public Maploctors() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Map']")
	private WebElement map;
	
	@FindBy(xpath="//span[text()='Details']")
	private WebElement detail;
	
	@FindBy(xpath="//div[@class='selected-route-Direction-content']")
	private List<WebElement>  details;
	

	@FindBy(id="menu-search-location-optionsMenu-icon")
	private WebElement directions;

	
	@FindBy(id="menu-search-location-searchInput-Field")
	private WebElement start;
	
	@FindBy(xpath="(//span[@class='search-result'])[1]")
	private WebElement fristpoint;
	
	@FindBy(xpath="(//div[@class='selectedLoc-OverView-content-Direction-Options-Items '])[1]")
	private WebElement direction;
	
	@FindBy(id="searchinput1")
	private WebElement startpoint;
	
	@FindBy(id="searchinput2")
	private WebElement endpoint;
	
	@FindBy(xpath="(//p[@id='search-result-location'])[1]")
	private WebElement fpoint;
	
	@FindBy(xpath="(//p[@id='search-result-location'])[1]")
	private WebElement spoint;

	public WebElement getFpoint() {
		return fpoint;
	}

	public WebElement getSpoint() {
		return spoint;
	}

	public WebElement getMap() {
		return map;
	}

	public WebElement getStart() {
		return start;
	}

	public WebElement getFristpoint() {
		return fristpoint;
	}

	public WebElement getDirection() {
		return direction;
	}

	public WebElement getStartpoint() {
		return startpoint;
	}

	public WebElement getEndpoint() {
		return endpoint;
	}
	public WebElement getDetail() {
		return detail;
	}
	public List<WebElement> getDetails() {
		return details;
	}
	public WebElement getDirections() {
		return directions;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
