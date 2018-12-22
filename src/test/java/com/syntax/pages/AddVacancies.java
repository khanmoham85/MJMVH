package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;





public class AddVacancies extends BaseClass {

	
	@FindBy(linkText="Recruitment")
	public WebElement recruitment;
	
	@FindBy(linkText="Vacancies")
	public WebElement vacancies;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	public WebElement add;
	
	@FindBy(xpath="//select[@id='addJobVacancy_jobTitle']")
	public WebElement jobTitle;
	
	@FindBy(xpath="//input[@id='addJobVacancy_name']")
	public WebElement vacancyName;
	
	@FindBy(xpath="//input[@id='addJobVacancy_hiringManager']")
	public WebElement hiringManager;
	
	@FindBy(xpath="//input[@id='addJobVacancy_noOfPositions']")
	public WebElement numberOfPositions;
	
	@FindBy(xpath="//textarea[@id='addJobVacancy_description']")
	public WebElement discription;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement save;
	
	@FindBy(xpath="//select[@name='vacancySearch[jobTitle]']")
	public WebElement selectJobTitle;
	
	@FindBy(xpath="//select[@name='vacancySearch[jobVacancy]']")
	public WebElement selectVacancy;
	
	@FindBy(xpath="//select[@name='vacancySearch[hiringManager]']")
	public WebElement selectHiringManager;
	
	@FindBy(xpath="//select[@name='vacancySearch[status]']")
	public WebElement selectStatus;
	
	@FindBy(xpath="//input[@id='btnSrch']")
	public WebElement Search;
	
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_6']")
	public WebElement checkbox;
	
	@FindBy(xpath="//input[@id='btnDelete']")
	public WebElement delete;
	
	
	public AddVacancies() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
}
