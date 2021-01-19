package com.hrms.stepDefinitions;

import com.hrms.pages.SearchEmployee;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmplDefenitions extends CommonMethods {
	
	@Then("navigate to add employee list page")
	public void navigate_to_add_employee_list_page() {
//		click(dash.pimLinkBtn);
		jsClick(dash.pimEmplList);
	    click(dash.pimEmplList);
	}
	
	@When("enter employee ID {string}")
	public void enter_employee_ID(String Id) throws InterruptedException {
		Thread.sleep(3000); // cucumber is too fast and it give time to elements to downloads on the page, explicit wait doesn't work
		sendText(empListElem.empSearchId, Id);
	}

	@Then("click on Search button")
	public void click_on_Search_button() throws InterruptedException {
		click(empListElem.searchBtn);
		Thread.sleep(2000); // for checking if it's moving to That persone what we are looking
		click(empListElem.empId);
	}

}
