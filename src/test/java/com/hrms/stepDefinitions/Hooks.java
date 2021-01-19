package com.hrms.stepDefinitions;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

	@Before
	public void startTest() {
		BaseClass.setUp();
//		For HW doesn't work correctlu
//		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
//		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
//		click(login.btnLogin);
	}

	@After
	public void endTest(Scenario scenario) {
		byte[] screenshot;
		if (scenario.isFailed()) {
			screenshot = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		} else {
			screenshot = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}

		BaseClass.tearDown();
	}

}
