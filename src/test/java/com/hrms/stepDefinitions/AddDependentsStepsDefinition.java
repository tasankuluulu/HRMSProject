package com.hrms.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.When;

public class AddDependentsStepsDefinition extends CommonMethods {

	@When("add new dependent, enter {string}, choose {string}, enter specification if needed {string}, and data birth, {string}, {string}, {string} and verify if it is added")
	public void add_new_dependent_enter_choose_enter_specification_if_needed_and_data_birth_and_verify_if_it_is_added(
			String name, String relationship, String other, String month, String date, String year) {
		click(persDetails.depenDets);
		click(dependentsPage.addBtn);
		sendText(dependentsPage.dependentName, name);
		selectDDValue(dependentsPage.relationship, relationship);
		if (dependentsPage.specifyRelationship.isDisplayed()) {
			sendText(dependentsPage.specifyRelationship, other);
		}
		click(dependentsPage.dateOfBirth);
		selectDDValue(dependentsPage.month, month);
		selectDDValue(dependentsPage.year, year);
		for (WebElement element : dependentsPage.calDates) {
			if (element.getText().equals(date)) {
				click(element);
			}
		}
		click(dependentsPage.saveBtn);
		boolean check = false;
		for (WebElement dependentName : dependentsPage.dependentsNameList) {
			if (dependentName.getText().equals(name)) {
				check = true;
			}
		}
		Assert.assertTrue(check);
		while (check) {
			for (int i = 0; i < dependentsPage.checkboxes.size(); i++) {
				if (dependentsPage.dependentsNameList.get(i).getText().equals(name)) {
					click(dependentsPage.checkboxes.get(i));
					click(dependentsPage.deleteBtn);
					i = 0;

				}
			}
			check = false;
		}
	}
}
