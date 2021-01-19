package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualificationsWebElements {

	@FindBy(id="addWorkExperience")
	public WebElement addWorkExperienceBtn;
	
	@FindBy(id="addEducation")
	public WebElement addEducationBtn;
	
	@FindBy(id="addSkill")
	public WebElement addSkillBtn;
	
	@FindBy(id="addLanguage")
	public WebElement addLanguageBtn;
	
	@FindBy(id="btnAddAttachment")
	public WebElement addAttachmentBtn;
	
	@FindBy(id="education_code")
	public WebElement educationLevelDropDown;
	
	@FindBy(id="btnEducationSave")
	public WebElement educationSaveBtn;
	
	@FindBy(id="btnEducationCancel")
	public WebElement educationCancelBtn;
	
	@FindBy(id="ufile")
	public WebElement chooseFileBtn;
	
	@FindBy(id="btnSaveAttachment")
	public WebElement attachmentUploadBtn;
	
	@FindBy(id="cancelButton")
	public WebElement attachmentCancelBtn;
}
