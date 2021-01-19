package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DependentsPageWebElements extends BaseClass{
	
	@FindBy(id = "btnAddDependent")
	public WebElement addBtn;
	
	@FindBy(id = "delDependentBtn")
	public WebElement deleteBtn;
	
	@FindBy(id = "btnAddAttachment")
	public WebElement addAttachmentsBtn;
	
	@FindBy(id = "dependent_name")
	public WebElement dependentName;
	
	@FindBy(id = "dependent_relationshipType")
	public WebElement relationship;
	
	@FindBy(id = "dependent_dateOfBirth")
	public WebElement dateOfBirth;
	
	@FindBy(id = "btnSaveDependent")
	public WebElement saveBtn;
	
	@FindBy(id = "btnCancel")
	public WebElement cancelBtn;
	
	@FindBy(id = "dependent_relationship")
	public WebElement specifyRelationship;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	public WebElement month;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	public WebElement year;
	
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr")
	public List<WebElement> calRows;
	
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	public List<WebElement> calDates;
	
	@FindBy(xpath = "//table[@id='dependent_list']/tbody/tr/td[2]")
	public List<WebElement> dependentsNameList;
	
	@FindBy(xpath = "//table[@id='dependent_list']/tbody/tr/td[1]")
	public List<WebElement> checkboxes;
	
	public DependentsPageWebElements() {
		PageFactory.initElements(driver, this);
	}
}
