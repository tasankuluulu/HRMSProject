package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class SearchEmployee extends BaseClass {
	
	@FindBy(name = "empsearch[id]")
	public WebElement empSearchId;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[2]")
	public WebElement empId;
	
	public SearchEmployee() {
		PageFactory.initElements(driver, this);
	}
}
