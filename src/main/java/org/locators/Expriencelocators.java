package org.locators;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.CommonUtility;

public class Expriencelocators extends CommonUtility {
	public Expriencelocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="name")
	private WebElement Candidatename;
	
	@FindBy(name="resume_exp")
	private WebElement File;
	
	@FindBy(name="phone")
	private WebElement mobile;
	
	
	@FindBy(name="secondary_phone")
	private WebElement secondaryphone;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="current_location")
	private WebElement current_location;
	
	

	public WebElement getCurrent_location() {
		return current_location;
	}

	@FindBy(name="secondary_email")
	private WebElement secondaryemail;
	

	@FindBy(name="permanent_location")
	private WebElement permanentlocation;
	
	@FindBy(name="department")
	private WebElement department;
	
	@FindBy(name="college_name")
	private WebElement collegename;
	
	@FindBy(name="degree")
	private WebElement degree;
	
	@FindBy(name="passing_year")
	private WebElement passingyear;
	
	@FindBy(name="company_name")
	private WebElement companyname;
	
	@FindBy(name="total_experience_exp")
	private WebElement totalexperienceexp;
	
	@FindBy(name="submit-form")
	private WebElement submit;
	
	@FindBy(name="start_date")
	private List<WebElement> start_dates;
	
	@FindBy(name="start_date")
	private WebElement start_date;
	
	
	
	public WebElement getStart_date() {
		return start_date;
	}

	@FindBy(name="end_date")
	private WebElement end_date;

	public WebElement getCandidatename() {
		return Candidatename;
	}
	
	

	public WebElement getFile() {
		return File;
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

	public WebElement getDegree() {
		return degree;
	}

	public WebElement getPassingyear() {
		return passingyear;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getTotalexperienceexp() {
		return totalexperienceexp;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public List<WebElement> getStart_dates() {
		return start_dates;
	}

	public WebElement getEnd_date() {
		return end_date;
	}
	
	
	
	
	
	

}
