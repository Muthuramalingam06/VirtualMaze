package org.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.CommonUtility;


public class FresherLoctor extends CommonUtility {
	public FresherLoctor() {
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="")
//	private WebElement carrer;
	
	@FindBy(name="resume")
	private WebElement File;
	
	public WebElement getFile() {
		return File;
	}

	@FindBy(xpath="//a[text()='Careers']")
	private WebElement carrer;
	
	@FindBy(xpath="//a[text()='View More']")
	private WebElement viewmore;
	
	@FindBy(xpath="//a[text()='Apply']")
	private WebElement apply;
	
	@FindBy(xpath="//h4[text()='Fresher']")
	private WebElement Fresher;
	
	@FindBy(xpath="//h4[text()='Experienced']")
	private WebElement Experince;
	
	@FindBy(name="name")
	private WebElement Candidatename;
	
	@FindBy(name="phone")
	private WebElement mobile;
	
	
	@FindBy(name="secondary_phone")
	private WebElement secondaryphone;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="secondary_email")
	private WebElement secondaryemail;
	

	@FindBy(name="permanent_location")
	private WebElement permanentlocation;
	
	@FindBy(name="department")
	private WebElement department;
	
	@FindBy(name="college_name")
	private WebElement collegename;
	
	@FindBy(name="ssc")
	private WebElement tenth;
	
	@FindBy(name="hsc")
	private WebElement twelth;
	
	@FindBy(name="ug")
	private WebElement ug;
	
	@FindBy(name="passing_year")
	private WebElement passingyear;
	
	@FindBy(xpath="(//input[@name='skills_data'])[1]")
	private WebElement c_lanuage;
	
	@FindBy(xpath="(//input[@name='skills_data'])[2]")
	private WebElement cplus;
	
	@FindBy(xpath="(//input[@name='skills_data'])[2]")
	private WebElement java;
	
	@FindBy(xpath="(//input[@name='skills_data'])[4]")
	private WebElement python;
	
	@FindBy(xpath="(//input[@name='skills_data'])[5]")
	private WebElement other;
	

	@FindBy(name="submit-form")
	private WebElement submit;


	@FindBy(name="current_location")
	private WebElement current_location;
	
	@FindBy(name="degree")
	private WebElement degree;
	
	

	public WebElement getDegree() {
		return degree;
	}


	public WebElement getCurrent_location() {
		return current_location;
	}


	public WebElement getCarrer() {
		return carrer;
	}


	public WebElement getViewmore() {
		return viewmore;
	}


	public WebElement getApply() {
		return apply;
	}


	public WebElement getFresher() {
		return Fresher;
	}


	public WebElement getExperince() {
		return Experince;
	}


	public WebElement getCandidatename() {
		return Candidatename;
	}


	public WebElement getMobile() {
		return mobile;
	}


	public WebElement getSecondaryphone() {
		return secondaryphone;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getSecondaryemail() {
		return secondaryemail;
	}


	public WebElement getPermanentlocation() {
		return permanentlocation;
	}


	public WebElement getDepartment() {
		return department;
	}


	public WebElement getCollegename() {
		return collegename;
	}


	public WebElement getTenth() {
		return tenth;
	}


	public WebElement getTwelth() {
		return twelth;
	}


	public WebElement getUg() {
		return ug;
	}


	public WebElement getPassingyear() {
		return passingyear;
	}


	public WebElement getC_lanuage() {
		return c_lanuage;
	}


	public WebElement getCplus() {
		return cplus;
	}


	public WebElement getJava() {
		return java;
	}


	public WebElement getPython() {
		return python;
	}


	public WebElement getOther() {
		return other;
	}


	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	

}
