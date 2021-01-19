package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.DependentsPageWebElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.SearchEmployee;

public class PageInitializer extends BaseClass {
	
	public static LoginPageElements login;
	protected static DashboardPageElements dash;
	protected static AddEmployeePageElements addEmp;
	protected static PersonalDetailsPageElements persDetails;
	protected static SearchEmployee empListElem;
	protected static DependentsPageWebElements dependentsPage;

	public static void initializePageObjects() {
		login = new LoginPageElements();
		dash = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		persDetails=new PersonalDetailsPageElements();
		empListElem = new SearchEmployee();
		dependentsPage = new DependentsPageWebElements();
	}

}
