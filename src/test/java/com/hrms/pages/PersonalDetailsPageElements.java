package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements extends BaseClass {
	
	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement profileName;

	@FindBy(xpath = "//a[text() = 'Personal Details']")
	public WebElement persDetails;
	
	@FindBy(xpath = "//a[text() = 'Contact Details']")
	public WebElement contDetails;
	
	@FindBy(xpath = "//a[text() = 'Dependents']")
	public WebElement depenDets;
	
	@FindBy(xpath = "//a[text() = 'Immigration']")
	public WebElement immigration;
	
	@FindBy(xpath = "//a[text() = 'Salary']")
	public WebElement salary;

	@FindBy(xpath = "//a[text() = 'Tax Exemptions']")
	public WebElement taxExeptions;
	
	@FindBy(xpath = "//a[text() = 'Report-to']")
	public WebElement reportTo;
	
	@FindBy(xpath = "//a[text() = 'Qualifications']")
	public WebElement qualifications;
	
	@FindBy(xpath = "//a[text() = 'Memberships']")
	public WebElement membership;
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}

}
